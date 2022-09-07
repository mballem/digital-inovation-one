# Desafio Final Database Experience Dio

## 📑 Descrição do Desafio
Neste desafio, você terá a missão de compreender o papel dos Bancos de Dados Relacionais (SQL) e Não Relacionais (NoSQL) no contexto de um Engenheiro de Dados. Para isso, anote todos os conceitos, definições e insights que julgar relevantes em um novo repositório Git, aumentando assim seu portfolio de conhecimentos.

### Banco de Dados
Um banco de dados é uma coleção organizada de informações estruturadas. Essas informações são nomeadas como registros ou dados e gerenciadas por um sistema de gerenciamento de banco de dados (SGDB). 

Um banco de dados pode ser seguir o modelo relacional ou não relacional. Este último, conhecido também como NoSQL. 

📃 **O Modelo Relacional**
Os bancos de dados relacionais se tornaram dominantes na década de 1980. Os registros em um banco de dados relacional são organizados como um conjunto de tabelas com colunas e linhas. 

O modelo de banco de dados relacional tem características importantes como a restrição de integridade para garantir a consistência dos registros armazenados nas tabelas. Esta restrição é realizada a partir do uso de chaves primárias (PK) e também de chaves estrangeiras (FK).

Outra caracteristica importante para o modelo relacional é o processo de normalização. Este processo possui uma sequência de passos que separa os tipos de dados em tabelas especificas que os representam mais adequadamente. A partir da normalização são criados os relacionamentos entre tabelas baseados em PKs e FKs. Com o uso da normalização alcançamos um armazenamento mais consistente dos dados, reduziindo a redundância e criando um eficiente acesso aos registros por meio dos relacionamentos.

No modelo ralcional o acesso aos dados é realizado por meio de SQL (Structured Query Language), uma criada pela IBM e inspirada em álgebra relacional. Embora os SGBDs adotem o SQL como linguagem padrão do modelo relacional, existem comandos que podem ser específicos para cada SGBD, fazendo com que instruções, como em consultas aos dados, percam a portabilidade entre SGBDs distintos.
É por meio de SQL que criamos tabelas, colunas, índices, inserimos ou atualizamos registros e, principalmente, consultamos os dados armazenados em tabelas.
Existem alguns tipos distintos de definições para a execução dos comandos SQL como:
* DDL - Data Definition Language - Conjunto de comandos que lidam com os objetos, criando bancos de dados, esquemas, tabelas, campos, etc. Dentre os mais utilizados temos CREATE, ALTER e DROP. Exemplo:
`CREATE TABLE usuario`
* DML - Data Manipulation Language - Os comandos aqui lidam com os dados. Alguns muito comuns são INSERT, UPDATE e DELETE. Exemplo:
`INSERT INTO usuario (nome, sobrenome) VALUES ('Beltrano', 'da Silva')`
* DQL - Data Query Language - Linguagem de consulta de dados conta com o conjunto da instrução utilizada para a obtenção dos registros dos bancos de dados. Exemplo:
`SELECT nome, sobrenome FROM usuario`
* DTL - Data Transaction Language - Linguagem de transação de dados que conta com o conjunto de instruções usadas para gerenciar as transações que ocorrem dentro do banco de dados. Exemplo:
`BEGIN TRAN`
* DCL - Data Control Language - Linguagem de controle de dados possui o conjunto das instruções usadas para controlar o acesso e gerenciar permissões de usuários no banco de dados. Exemplo:
`GRANT CREATE TABLE to usuario`

Os SGBDs no mundo relacional possuem um conceito importantissimo chamado ACID. Esse conceito se refere às quatro propriedades de transação de um sistema de banco de dados: Atomicidade, Consistência, Isolamento e Durabilidade.
*  	Atomicidade – verifica se uma transação foi bem sucedida ou não. Em caso negativo será realizado um rollback total da transação.
*  	Consistência – garante que depois de uma transação bem sucedida, os dados afetados são mantidos em um estado consistente;
*  	Isolamento – cada transação deve ser executada de forma isolada, sem afetar o estado de outras transações;
*  	Durabilidade – o resultado de uma transação é permanente, assim, há a garantia do que foi salvo não será perdido.

Exemplo de uma uma consulta realizado sobre a tabela `city` no modelo relacional:

    mysql> select * from city limit 5;
    +----+----------------+-------------+---------------+------------+
    | ID | Name           | CountryCode | District      | Population |
    +----+----------------+-------------+---------------+------------+
    |  1 | Kabul          | AFG         | Kabol         |    1780000 |
    |  2 | Qandahar       | AFG         | Qandahar      |     237500 |
    |  3 | Herat          | AFG         | Herat         |     186800 |
    |  4 | Mazar-e-Sharif | AFG         | Balkh         |     127800 |
    |  5 | Amsterdam      | NLD         | Noord-Holland |     731200 |
    +----+----------------+-------------+---------------+------------+
    5 rows in set (0.00 sec)

Alguns dos SGBDs relacionais mais conhecidos e utilizados no mercado:
1. Oracle
2. SQL Server
3. MySQL
4. PostgreSQL
5. IBM DB2 

📃 **O Modelo Não Relacional - NoSQL**
Os bancos de dados não relacionais, como o nome bem diz, não seguem os conceitos do modelo relacional. Este tipo de banco de dados se tornou conhecido pelo nome NoSQL (Not Only SQL).

Enquanto os SGBDs Relacionais seguem um padrão de armazenamento e manipulação de dados, como o uso do SQL, os não relacionais não possuem nenhum padrão a ser seguido. Cada SGBD não relacional pode ter seu próprio formato de dados, de armazenamento e linguagem de manipulção dos registros. 
Até este momento existem pelo menos quatro classificações de banco de dados não relacionais que são: 
* Orientandos a chave-valor
* Orientandos a colunas
* Orientandos a documentos
* Orientandos a grafos.

#### Orientados a Chave Valor
Os SGDBs orientados a chave-valor (Key-Value Store) são considerados o modelo mais simples de armazenamento entre as classificações NoSQL. Bem como sugere o nome, o armazenamento é realizado por meio de uma chave contida por um valor. O valor de uma chave pode ser único ou mesmo um tipo de lista. 
Segue um exemplo desse tipo de armazenamento:

    Key | Value
    101 | nome: 'Fulano de Tal'
    102 | {nome: 'Beltrano', sobrenome: 'de Tal'}

#### Orientados a Colunas
Os bancos de dados orientados a colunas (Wide Columns Store ou Columnar) são considerados mais complexos que os orientados a chave-valor. Esta classificação de SGBDs trabalha com um sistema de armazenamento via tabelas e, os dados, são agrupados por colunas, o que reduz o tempo de leitura e escrita em disco. A diferença entre as tabelas do modelo relacional e o modelo não relacional, do tipo colunar, é que o relacional agrupa os dados orientados em linhas de uma tabela, enquanto o colunar, como já citado, armazena os dados orientados por colunas. Observe o exemplo a seguir:

    Ana         | Mario      | José          | Luísa             | Pietra
    São Paulo   | Campinas   | Porto Alegre  | Rio de Janeiro    | Porto Alegre
    1990-10-01  | 1994-05-07 | 1989-10-17    | 1999-06-08        | 2001-03-07 

Cada coluna da tabela possui os regristros de uma pessoa (nome, cidade e data de nascimento).

#### Orientados a Documentos
Os bancos de dados orientados a documentos (Document-Oriented) armazenam os registros em forma de documentos. Estes documentos podem ser semelhamentes a um arquivo XML ou JSON. A ideia principal é que cada documento irá conter todos os dados de uma determinada entidade. Este modelo de armazenamento permite um alto nível de flexibilidade, não dependendo de um esquema rígido ou de uma estrutura fixa. Deste modo os documentos se tornam flexiveis de forma que cada documento pode possuir diferentes campos de dados. O modelo documental terá um identificador único, similar a chave primária de um banco de dados relacional. Abaixo um exemplo de um documento no formato JSON:

    {
        _id : 57,
        name: ‘Fulano de Tal’,
        age: 55,
        city: ‘Rio de Janeiro’,
        tags: ['filmes', 'futebol', 'animes']	
    }

#### Orientados a Grafos
Talvez um dos menos populares entre os não relacionais são os orientados a grafos (Graph Store). Este modele de armazenamento utiliza nós (nodes) que se relacionam com outros nós. Os nós são formados por propriedades do tipo chave-valor para armazenar os resgistro. Segue um exemplo de armazenamento por grafo:

![Orientados a Grafos](https://github.com/mballem/digital-inovation-one/blob/master/database-experience/desafio-final/image/graph-store.png)

Enquanto no modelo relacional temos o conceito ACID, os não relacionais fazem uso do conceito BASE. Este conceito parte do principio que enquanto uma aplicação está disponível o tempo todo, a base de dados não precisaria ser consistente todo o tempo. Isso tornaria a base dade consistente eventualmente, o que agiliza não somente o desempenho das consultas, mas muitas vezes as operações de escritas:
* BA (Basically Available) – sigla que representa o conceito de basicamente disponível. Tem relação direta com a disponibilidade de dados;
* S (Soft State) – possuir estado leve, ou seja, o sistema não precisa estar consistente o tempo todo;
* E (Eventually Consistent) – a consistência é eventual, ou seja, em um momento indeterminado. 

Alguns dos SGBDs não relacionais e suas classificações:

![Orientados a Grafos](https://github.com/mballem/digital-inovation-one/blob/master/database-experience/desafio-final/image/nosql-types.png)
