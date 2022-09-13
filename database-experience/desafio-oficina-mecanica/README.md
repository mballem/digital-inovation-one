# Desafio Database Experience Dio

## 📑 Descrição 1º Desafio
O esquema deverá ser adicionado a um repositório do Github para futura avaliação do desafio de projeto. Adicione ao Readme a descrição do projeto conceitual para fornecer o contexto sobre seu esquema.

🎯  **Objetivo**
Cria o esquema conceitual para o contexto de oficina com base na narrativa fornecida

📃 **Narrativa**
Sistema de controle e gerenciamento de execução de ordens de serviço em uma oficina mecânica
1. Clientes levam veículos à oficina mecânica para serem consertados ou para passarem por revisões  periódicas
2. Cada veículo é designado a uma equipe de mecânicos que identifica os serviços a serem executados e preenche uma OS com data de entrega.
3. A partir da OS, calcula-se o valor de cada serviço, consultando-se uma tabela de referência de mão-de-obra
4. O valor de cada peça também irá compor a OSO cliente autoriza a execução dos serviços
5. A mesma equipe avalia e executa os serviços
6. Os mecânicos possuem código, nome, endereço e especialidade
7. Cada OS possui: n°, data de emissão, um valor, status e uma data para conclusão dos trabalhos.

## 🔵 Projeto modelagem Ordem de Serviço para Oficina Mecânica

![e-commerce](https://github.com/mballem/digital-inovation-one/blob/master/database-experience/desafio-oficina-mecanica/image/Oficina_Menanica.png)

### 🟠 Arquivo fonte .mwb (MySQL Workbench) disponivel no diretório <a href="https://github.com/mballem/digital-inovation-one/tree/master/database-experience/desafio-oficina-mecanica/mwb" alt="mwb">mwb</a>.

## 📑 Descrição 2º desafio database oficina mecênica
Para este cenário você irá utilizar seu esquema conceitual, criado no desafio do módulo de modelagem de BD com modelo ER, para criar o esquema lógico para o contexto de uma oficina. Neste desafio, você definirá todas as etapas. Desde o esquema até a implementação do banco de dados. Sendo assim, neste projeto você será o protagonista. Tenha os mesmos cuidados, apontados no desafio anterior, ao modelar o esquema utilizando o modelo relacional.

Após a criação do esquema lógico, realize a criação do Script SQL para criação do esquema do banco de dados. Posteriormente, realize a persistência de dados para realização de testes. Especifique ainda queries mais complexas do que apresentadas durante a explicação do desafio. Sendo assim, crie queries SQL com as cláusulas abaixo:

* Recuperações simples com SELECT Statement;
* Filtros com WHERE Statement;
* Crie expressões para gerar atributos derivados;
* Defina ordenações dos dados com ORDER BY;
* Condições de filtros aos grupos – HAVING Statement;
* Crie junções entre tabelas para fornecer uma perspectiva mais complexa dos dados;

📃 **Diretrizes**
* Não há um mínimo de queries a serem realizadas;
* Os tópicos supracitados devem estar presentes nas queries;
* Elabore perguntas que podem ser respondidas pelas consultas
* As cláusulas podem estar presentes em mais de uma query

### Banco de Dados Oficina Mecânica
* [Scrip schema Oficina Mecânica](https://github.com/mballem/digital-inovation-one/blob/master/database-experience/desafio-oficina-mecanica/script-sql/schema.sql)
* [Scrip data Oficina Mecânica]((https://github.com/mballem/digital-inovation-one/blob/master/database-experience/desafio-oficina-mecanica/script-sql/data.sql)

🔎  Retorne o total de Ordens de Serviços
```sql
select count(1) from ordens_de_servico;
```
**Resultado:**
```
# TOTAL
7
```

🔎  Retorne o total de Ordens de Serviços pelo ano e mês da data de inicio
```sql
select 
	year(data_emissao) as ANO,
	month(data_emissao) as MES, 
    count(1) as TOTAL 
from ordens_de_servico
group by ANO, MES;
```
**Resultado:**
```
# ANO	MES	    TOTAL
2021	2	    2
2021	3	    1
2021	4	    1
2021	5	    1
2021	6	    2
```

🔎  Retorne o valor total das ordens de serviços no ano de 2021 e com status de seriço finalizado
```sql
select 
	sum(valor_total_os) as TOTAL
from 
	ordens_de_servico
where 
	YEAR(data_emissao) = 2021
and id_status = 3;
```
**Resultado:**
```
# TOTAL
8751.79
```

🔎  Retorne o nome dos clientes, ordenados de a-z, que aprovaram os serviços e quantidade de serviços que cada
cliente aprovou:
```sql
select distinct c.nome as 'Nome do Cliente', count(1) as Total	 
from clientes c 
join veiculos v
	on c.ID_CLIENTE = v.ID_CLIENTE
join ordens_de_servico os 
	on v.ID_VEICULO = os.ID_VEICULO
where os.OS_APROVADA = 1
group by c.nome
order by c.nome asc;
```
**Resultado:**
```
# Nome do Cliente	Total
JOELMA CASTRO	    2
JULIO CESAR GOMES	1
MARCUS PETRI	    1
PIETRA RAMOS	    1
RICARDO MATTOS	    1
```

🔎  Retorne o nome das cidades onde vivem os mecânicos e a quantidade de mecanico registrado em cada cidade retornada. 
Por fim, ordene pela quantidade de mecânicos de forma decrescente:
```sql
select e.CIDADE as Cidade, count(1) as Total
from enderecos e 
join mecanicos m
	on e.ID_ENDERECO = m.ID_ENDERECO
group by Cidade
order by Total desc;
```
**Resultado:**
```
# Cidade	    Total
SÃO PAULO	    6
DIADEMA	        3
OSASCO	        2
SANTO ANDRÉ	    2
SÃO BERNARDO	2
```

🔎  Retorne todas as especialidades que possuem mecânicos vinculados. Ordene o resultado pelo titula em ordem alfabética.
Exclua valores repetidos, exibindo apenas uma única vez:
```sql
select distinct e.titulo as Especialidade
from especialidades e 
join mecanicos_tem_especialidades me
	on e.ID_ESPECIALIDADE = me.ID_ESPECIALIDADE
join mecanicos m
	on me.ID_MECANICO = m.ID_MECANICO
order by e.titulo asc;
```
**Resultado:**
```
# Especialidade
ALINHAMENTO
BALANCEAMENTO
CARBURADOR
CHAPEAMENTO OU LANTERNAGEM
DIREÇÃO ELÉTRICA
DIREÇÃO HIDRAULICA
ELETRECISTA
HOMOCINÉTICA
INJEÇÃO ELETRÔNICA
MECANICO GERAL
MONTAGEM E DESMONTAGEM DE INTEIROR
MOTOR
REGULAGEM DE FAROIS
SUSPENSÃO
TRANSMISSÃO AUTOMÁTICA
TRANSMISSÃO MANUAL
```

🔎  Retorne todas as especialidades que **não** possuem mecânicos vinculados. Ordene o resultado pelo titulo em ordem alfabética:
```sql
select e.titulo as Especialidade
from especialidades e 
where e.ID_ESPECIALIDADE not in (
	select me.ID_ESPECIALIDADE from mecanicos_tem_especialidades me 
) 
order by e.titulo asc;
```
**Resultado:**
```
# Especialidade
SOLDADOR
```

🔎  Retorne o nome das peças e a quantidade de vezes que cada peça foi usada. Ordene de forma crescrente pela
quantidade e pelo nome:
```sql
select p.MODELO as Peca, count(1) as Total
from ordens_de_servico os
join ordens_de_servico_tem_pecas osp
	on os.ID_ORDENS_DE_SERVICO = osp.ID_ORDENS_DE_SERVICO
join pecas p
	on osp.ID_PECA = p.ID_PECA
where os.OS_APROVADA = 1 and os.ID_STATUS = 3
group by p.MODELO
order by Total asc,  Peca asc;	
```
**Resultado:**
```
# Peca	            Total
CAPO FORD	        1
FAROL	            1
SINALEIRA TRASEIRA	1
TRANSMISSAO MANUAL	1
VIDRO FRONTAL	    1
OLEO DE MOTOR	    2
OLEO DE TRANSMISSAO	2
PNEU FIRESTONE 15	4
RODA 15	            4
VELA	            4
```