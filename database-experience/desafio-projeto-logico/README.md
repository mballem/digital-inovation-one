# Desafio Projeto Lógico Database Experience Dio

## 📑 Descrição do Desafio
Assim como demonstrado durante o desafio, realize a criação do Script SQL para criação do esquema do banco de dados. Posteriormente, realize a persistência de dados para realização de testes. Especifique ainda queries mais complexas dos que apresentadas durante a explicação do desafio. Sendo assim, crie queries SQL com as cláusulas abaixo:

📌 Recuperações simples com SELECT Statement
* Filtros com WHERE Statement
* Crie expressões para gerar atributos derivados
* Defina ordenações dos dados com ORDER BY
* Condições de filtros aos grupos – HAVING Statement
* Crie junções entre tabelas para fornecer uma perspectiva mais complexa dos dados

📌 Diretrizes
* Não há um mínimo de queries a serem realizadas;
* Os tópicos supracitados devem estar presentes nas queries;
* Elabore perguntas que podem ser respondidas pelas consultas;
* As cláusulas podem estar presentes em mais de uma query;

🎯 Objetivo:
-- Aplique o mapeamento para o  cenário:

“Refine o modelo apresentado acrescentando os seguintes pontos”

* Cliente PJ e PF – Uma conta pode ser PJ ou PF, mas não pode ter as duas informações;
* Pagamento – Pode ter cadastrado mais de uma forma de pagamento;
* Entrega – Possui status e código de rastreio;

Algumas das perguntas que podes fazer para embasar as queries SQL:

* Quantos pedidos foram feitos por cada cliente?
* Algum vendedor também é fornecedor?
* Relação de produtos fornecedores e estoques;
* Relação de nomes dos fornecedores e nomes dos produtos;

### Banco de Dados E-commerce

* [Scrip schema ecommerce](https://github.com/mballem/digital-inovation-one/blob/master/database-experience/desafio-projeto-logico/schema.sql)
* [Scrip data ecommerce](https://github.com/mballem/digital-inovation-one/blob/master/database-experience/desafio-projeto-logico/data.sql)

🔎  Quantos pedidos foram feitos por cada cliente?
```sql
select c.ID_CLIENTE as 'cliente id' , count(p.ID_PEDIDO) as 'total de pedidos'
from pedido p 
join cliente c 
	on c.ID_CLIENTE = p.ID_CLIENTE
group by c.id_cliente;
```
**Result:**
```
# cliente id	total de pedidos
1	            2
2           	1
3           	2
4	            1
5	            1
6	            1
7	            2
```

🔎 Quais os produtos de cada fornecedor?
```sql
select f.RAZAO_SOCIAL, p.ID_PRODUTO, p.DESCRICAO
from produto p
join fornecedor_tem_produto fp
	on p.ID_PRODUTO = fp.ID_PRODUTO
join fornecedor f
	on f.ID_FORNECEDOR = fp.ID_FORNECEDOR
order by f.RAZAO_SOCIAL;   
```
**Resultado:**
```
# RAZAO_SOCIAL	        ID_PRODUTO	DESCRICAO
Agro Matias & Mattos	16      	Anti Pulga 1 dose
Agro Matias & Mattos	17	        Coleira e Guia
Agro Matias & Mattos	18	        Talco Banho
Agro Matias & Mattos	19	        Sabonete 
California Moveis	    7	        Roupeiro 3 Portas
California Moveis	    8       	Ropeiro 2 Portas
Eltro Toda Casa	        1	        Refrigerador
Eltro Toda Casa	        2	        Fogão
Food e Drinks Ltda	    12	        Caixa Bombom Garoto
Food e Drinks Ltda	    13	        Barra Ao Leite Garoto
Food e Drinks Ltda  	14	        Kit Kat Dark
Food e Drinks Ltda	    15	        Cebolitos Elma Chips
Hardware Store      	20	        Microfone
Hardware Store	        21	        Radio Relógio
Hardware Store	        22	        TV Led LG 50
Industria Covala	    6	        Jogo de Cama
Industria Covala    	9	        Camisa Polo
Industria Covala	    10	        Camisa Regata
Industria Covala	    11	        Bermuda Surfista
Industria Covala	    5	        Jogo de Mesa
Informativa Ativa	    3	        PC Lenovo XX45
Informativa Ativa	    4	        PC ACER T99
```

🔎 Qual o valor médido e total de vendas no e-commerce? 
-- Fixar os centavos em duas casas decimais.
```sql
select 
    round(avg(p.VALOR_PEDIDO), 2) as 'valor médio', 
    round(sum(p.VALOR_PEDIDO), 2) as 'valor total'
from 
    pedido p;  
```
**Resultado:**
```
# valor médio   	valor total
  2420.67	        24206.69
```

🔎 Qual o valor total por tipo de pagamento?
-- Fixar os centavos em duas casas decimais.
```sql
select tp.TIPO as tipo, round(sum(p.VALOR_PEDIDO), 2) as valor
from pedido p, tipo_pagamento tp
where p.ID_TIPO_PAGAMENTO = tp.ID_TIPO_PAGAMENTO
group by tipo;
```
**Resultado:**
```
# tipo	            valor
CARTAO VISA	        9424.04
CARTAO MASTERCARD	658.00
CARTAO ELO	        3501.26
BOLETO	            5780.99
PIX	                4842.40
```

🔎  Listar o id do cliente, o valor total do pedido (frete + pedido) e data do pedido daqueles realizados no ano de 2021:
```sql
select 
    p.ID_CLIENTE as 'id cliente', 
    (p.VALOR_FRETE + p.VALOR_PEDIDO) as 'valor total',
    p.DATA_PEDIDO as 'data do pedido'
from 
    pedido p
where 
    YEAR(p.DATA_PEDIDO) = 2021;
```
**Resultado:**
```
# id cliente	valor total	    data do pedido
1	            2109.64	        2021-08-01
2	            281.39	        2021-08-01
```

🔎  Qual menor e o de maior valor de pedidos considerenco o frete?
```sql
select 
    min((p.VALOR_PEDIDO + p.VALOR_FRETE)) as 'menor valor', 
    max((p.VALOR_PEDIDO + p.VALOR_FRETE)) as 'maior valor'
from 
    pedido p;
```
**Resultado:**
```
# menor valor	maior valor
52.59	        5820.80
```

🔎  Qual a data do pedido, a data do cancelamento do pedido e o nome do cliente entre os pedidos cancelados?
```sql
select 
	p.DATA_PEDIDO as 'Data do Pedido', 
    ps.DATA_FIM as 'Data do Cancelamento', 
    case
		when c.ID_CLIENTE = pf.ID_CLIENTE then pf.NOME
        when c.ID_CLIENTE = pj.ID_CLIENTE then pj.RAZAO_SOCIAL
    end as 'Nome do Cliente'
from pessoa_fisica pf, pessoa_juridica pj, cliente c, pedido p
join pedido_tem_status ps
	on p.ID_PEDIDO = ps.ID_PEDIDO
join status s
	on ps.ID_STATUS = s.ID_STATUS_PEDIDO
where 
	s.TIPO = 'CANCELADO'
and	p.ID_CLIENTE = c.ID_CLIENTE 
and (c.ID_CLIENTE = pf.ID_CLIENTE or c.ID_CLIENTE = pj.ID_CLIENTE)
group by p.ID_PEDIDO;
```
**Resultado:**
```
# Data do Pedido	Data do Cancelamento	Nome do Cliente
2022-09-06	        2022-09-07	            Rita de Cassia Sousa
2022-09-03	        2022-09-04	            Jussara da Silva
```

🔎  Localizar os clientes que fizeram pedidos e retornar o CPF formatado, caso o cliente seja pessoa fisica, ou o CNPJ formatado, caso o cliente seja pessoa juridica. Retornar o nome ou razão social dos clientes localizados. 
```sql
select distinct
	case
		when c.ID_CLIENTE = pf.ID_CLIENTE then 
			concat( SUBSTRING(pf.CPF, 1, 3),'.', SUBSTRING(pf.CPF, 4, 3),'.', SUBSTRING(pf.CPF, 7, 3),'-', SUBSTRING(pf.CPF, 10, 2) ) 
        when c.ID_CLIENTE = pj.ID_CLIENTE then 
			concat( SUBSTRING(pj.CNPJ, 1, 2),'.', SUBSTRING(pj.CNPJ, 3, 3),'.', SUBSTRING(pj.CNPJ, 6, 3),'/', SUBSTRING(pj.CNPJ, 9, 4),'-', SUBSTRING(pj.CNPJ, 13, 2)) 
    end as documento,
 	case
		when c.ID_CLIENTE = pf.ID_CLIENTE then pf.NOME
        when c.ID_CLIENTE = pj.ID_CLIENTE then pj.RAZAO_SOCIAL
    end as nome   
from pessoa_fisica pf, pessoa_juridica pj, cliente c
join pedido p
	on c.ID_CLIENTE = p.ID_CLIENTE
where
	c.ID_CLIENTE = pf.ID_CLIENTE 
or  c.ID_CLIENTE = pj.ID_CLIENTE;
```
**Resultado:**
```
# documento	        nome
963.852.741-98	    Pietra Ramos
963.852.741-40  	Ricardo Camargo
853.852.741-98	    Rita de Cassia Sousa
968.542.741-98	    Mario Borges
742.852.741-98	    Jussara da Silva
745.669.200-78	    Otavio Santos
32.205.035/0001-53	Papelaria Silva
```
