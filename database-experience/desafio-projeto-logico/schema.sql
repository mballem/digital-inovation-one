--
-- Database ecommerce / MySQL V. 8.0.22
--

CREATE DATABASE  IF NOT EXISTS ecommerce
USE ecommerce;

--
-- Tabela cliente
--

DROP TABLE IF EXISTS cliente;
CREATE TABLE cliente (
  ID_CLIENTE int NOT NULL AUTO_INCREMENT,
  ID_ENDERECO int NOT NULL,
  PRIMARY KEY (ID_CLIENTE),
  KEY fk_CLIENTE_ENDERECO1_idx (ID_ENDERECO),
  CONSTRAINT fk_CLIENTE_ENDERECO1 FOREIGN KEY (ID_ENDERECO) REFERENCES endereco (ID_ENDERECO)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tabela dados_complementares
--

DROP TABLE IF EXISTS dados_complementares;
CREATE TABLE dados_complementares (
  ID_DADO_COMPLEMENTAR int NOT NULL AUTO_INCREMENT,
  ID_TIPO_PAGAMENTO int NOT NULL,
  NOME_IMPRESSO varchar(45) NOT NULL,
  NUMERO varchar(45) NOT NULL,
  VALIDADE date NOT NULL,
  PRIMARY KEY (ID_DADO_COMPLEMENTAR),
  KEY fk_DADOS_COMPLEMENTARES_TIPO_PAGAMENTO1_idx (ID_TIPO_PAGAMENTO),
  CONSTRAINT fk_DADOS_COMPLEMENTARES_TIPO_PAGAMENTO1 FOREIGN KEY (ID_TIPO_PAGAMENTO) REFERENCES tipo_pagamento (ID_TIPO_PAGAMENTO)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tabela endereco
--

DROP TABLE IF EXISTS endereco;
CREATE TABLE endereco (
  ID_ENDERECO int NOT NULL AUTO_INCREMENT,
  LOGRADOURO varchar(45) NOT NULL,
  BAIRRO varchar(45) NOT NULL,
  NUMERO varchar(45) NOT NULL,
  COMPLEMENTO varchar(45) DEFAULT NULL,
  CIDADE varchar(45) NOT NULL,
  UF varchar(2) NOT NULL,
  CEP varchar(8) NOT NULL,
  PRIMARY KEY (ID_ENDERECO)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tabela estoque
--

DROP TABLE IF EXISTS estoque;
CREATE TABLE estoque (
  ID_ESTOQUE int NOT NULL AUTO_INCREMENT,
  LOCAL varchar(45) DEFAULT NULL,
  PRIMARY KEY (ID_ESTOQUE)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tabela fornecedor
--

DROP TABLE IF EXISTS fornecedor;
CREATE TABLE fornecedor (
  ID_FORNECEDOR int NOT NULL AUTO_INCREMENT,
  RAZAO_SOCIAL varchar(45) NOT NULL,
  CNPJ varchar(14) NOT NULL,
  PRIMARY KEY (ID_FORNECEDOR),
  UNIQUE KEY CNPJ_UNIQUE (CNPJ)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tabela fornecedor_tem_produto
--

DROP TABLE IF EXISTS fornecedor_tem_produto;
CREATE TABLE fornecedor_tem_produto (
  ID_FORNECEDOR_PRODUTO int NOT NULL AUTO_INCREMENT,
  ID_FORNECEDOR int NOT NULL,
  ID_PRODUTO int NOT NULL,
  PRIMARY KEY (ID_FORNECEDOR_PRODUTO),
  KEY fk_FORNECEDOR_has_PRODUTO_PRODUTO1_idx (ID_PRODUTO),
  KEY fk_FORNECEDOR_has_PRODUTO_FORNECEDOR_idx (ID_FORNECEDOR),
  CONSTRAINT fk_FORNECEDOR_has_PRODUTO_FORNECEDOR FOREIGN KEY (ID_FORNECEDOR) REFERENCES fornecedor (ID_FORNECEDOR),
  CONSTRAINT fk_FORNECEDOR_has_PRODUTO_PRODUTO1 FOREIGN KEY (ID_PRODUTO) REFERENCES produto (ID_PRODUTO)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tabela pedido
--

DROP TABLE IF EXISTS pedido;
CREATE TABLE pedido (
  ID_PEDIDO int NOT NULL AUTO_INCREMENT,
  ID_CLIENTE int NOT NULL,
  ID_TIPO_PAGAMENTO int NOT NULL,
  VALOR_FRETE decimal(9,2) NOT NULL,
  VALOR_PEDIDO decimal(9,2) NOT NULL,
  CODIGO_RASTREIO varchar(45) NOT NULL,
  DATA_PEDIDO date NOT NULL,
  DATA_ENTREGA date DEFAULT NULL,
  DESCRICAO varchar(255) DEFAULT NULL,
  PRIMARY KEY (ID_PEDIDO),
  UNIQUE KEY CODIGO_RASTREIO_UNIQUE (CODIGO_RASTREIO),
  KEY fk_PEDIDO_CLIENTE1_idx (ID_CLIENTE),
  KEY fk_PEDIDO_TIPO_PAGAMENTO1_idx (ID_TIPO_PAGAMENTO),
  CONSTRAINT fk_PEDIDO_CLIENTE1 FOREIGN KEY (ID_CLIENTE) REFERENCES cliente (ID_CLIENTE),
  CONSTRAINT fk_PEDIDO_TIPO_PAGAMENTO1 FOREIGN KEY (ID_TIPO_PAGAMENTO) REFERENCES tipo_pagamento (ID_TIPO_PAGAMENTO)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tabela pedido_tem_produto
--

DROP TABLE IF EXISTS pedido_tem_produto;
CREATE TABLE pedido_tem_produto (
  ID_PEDIDO_PRODUTO int NOT NULL AUTO_INCREMENT,
  ID_PEDIDO int NOT NULL,
  ID_PRODUTO int NOT NULL,
  QUANTIDADE int NOT NULL,
  PRIMARY KEY (ID_PEDIDO_PRODUTO),
  KEY fk_PEDIDO_tem_PRODUTO_PRODUTO1_idx (ID_PRODUTO),
  KEY fk_PEDIDO_tem_PRODUTO_PEDIDO1_idx (ID_PEDIDO),
  CONSTRAINT fk_PEDIDO_has_PRODUTO_PEDIDO1 FOREIGN KEY (ID_PEDIDO) REFERENCES pedido (ID_PEDIDO),
  CONSTRAINT fk_PEDIDO_tem_PRODUTO_PRODUTO1 FOREIGN KEY (ID_PRODUTO) REFERENCES produto (ID_PRODUTO)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tabela pedido_tem_status
--

DROP TABLE IF EXISTS pedido_tem_status;
CREATE TABLE pedido_tem_status (
  ID_PEDIDO_STATUS int NOT NULL AUTO_INCREMENT,
  ID_PEDIDO int NOT NULL,
  ID_STATUS int NOT NULL,
  DATA_INICIO date NOT NULL,
  DATA_FIM date DEFAULT NULL,
  PRIMARY KEY (ID_PEDIDO_STATUS),
  KEY fk_PEDIDO_has_STATUS_DO_PEDIDO_STATUS_DO_PEDIDO1_idx (ID_STATUS),
  KEY fk_PEDIDO_has_STATUS_DO_PEDIDO_PEDIDO1_idx (ID_PEDIDO),
  CONSTRAINT fk_PEDIDO_has_STATUS_DO_PEDIDO_PEDIDO1 FOREIGN KEY (ID_PEDIDO) REFERENCES pedido (ID_PEDIDO),
  CONSTRAINT fk_PEDIDO_has_STATUS_DO_PEDIDO_STATUS_DO_PEDIDO1 FOREIGN KEY (ID_STATUS) REFERENCES status (ID_STATUS_PEDIDO)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tabela pessoa_fisica
--

DROP TABLE IF EXISTS pessoa_fisica;
CREATE TABLE pessoa_fisica (
  ID_CLIENTE int NOT NULL,
  CPF varchar(11) NOT NULL,
  NOME varchar(45) NOT NULL,
  DATA_NASCIMENTO date DEFAULT NULL,
  GENERO enum('F','M','O') DEFAULT NULL,
  PRIMARY KEY (ID_CLIENTE),
  UNIQUE KEY CPF_UNIQUE (CPF),
  KEY fk_PESSOA_FISICA_CLIENTE1_idx (ID_CLIENTE),
  CONSTRAINT fk_PESSOA_FISICA_CLIENTE1 FOREIGN KEY (ID_CLIENTE) REFERENCES cliente (ID_CLIENTE)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tabela pessoa_juridica
--

DROP TABLE IF EXISTS pessoa_juridica;
CREATE TABLE pessoa_juridica (
  ID_CLIENTE int NOT NULL,
  CNPJ varchar(14) NOT NULL,
  RAZAO_SOCIAL varchar(45) NOT NULL,
  INSC_ESTADUAL varchar(45) NOT NULL,
  DATA_CONSTITUICAO date DEFAULT NULL,
  NOME_FANTASIA varchar(45) DEFAULT NULL,
  PRIMARY KEY (ID_CLIENTE),
  UNIQUE KEY CNPJ_UNIQUE (CNPJ),
  UNIQUE KEY INSC_ESTADUAL_UNIQUE (INSC_ESTADUAL),
  KEY fk_PESSOA_JURIDICA_CLIENTE1_idx (ID_CLIENTE),
  CONSTRAINT fk_PESSOA_JURIDICA_CLIENTE1 FOREIGN KEY (ID_CLIENTE) REFERENCES cliente (ID_CLIENTE)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tabela produto
--

DROP TABLE IF EXISTS produto;
CREATE TABLE produto (
  ID_PRODUTO int NOT NULL AUTO_INCREMENT,
  CATEGORIA enum('Eletronico','Eletrodomestico','Informatica','Vestuario','Alimentos','Bazar','Pets','Moveis') DEFAULT NULL,
  DESCRICAO varchar(45) NOT NULL,
  VALOR decimal(9,2) NOT NULL,
  PRIMARY KEY (ID_PRODUTO)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tabela produto_tem_estoque
--

DROP TABLE IF EXISTS produto_tem_estoque;
CREATE TABLE produto_tem_estoque (
  ID_PRODUTO_ESTOQUE int NOT NULL AUTO_INCREMENT,
  ID_PRODUTO int NOT NULL,
  ID_ESTOQUE int NOT NULL,
  QUANTIDADE int NOT NULL DEFAULT '0',
  PRIMARY KEY (ID_PRODUTO_ESTOQUE),
  KEY fk_PRODUTO_tem_ESTOQUE_ESTOQUE1_idx (ID_ESTOQUE),
  KEY fk_PRODUTO_tem_ESTOQUE_PRODUTO1_idx (ID_PRODUTO),
  CONSTRAINT fk_PRODUTO_tem_ESTOQUE_ESTOQUE1 FOREIGN KEY (ID_ESTOQUE) REFERENCES estoque (ID_ESTOQUE),
  CONSTRAINT fk_PRODUTO_tem_ESTOQUE_PRODUTO1 FOREIGN KEY (ID_PRODUTO) REFERENCES produto (ID_PRODUTO)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tabela status
--

DROP TABLE IF EXISTS status;
CREATE TABLE status (
  ID_STATUS_PEDIDO int NOT NULL AUTO_INCREMENT,
  TIPO varchar(20) DEFAULT NULL,
  PRIMARY KEY (ID_STATUS_PEDIDO)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tabela tipo_pagamento
--

DROP TABLE IF EXISTS tipo_pagamento;
CREATE TABLE tipo_pagamento (
  ID_TIPO_PAGAMENTO int NOT NULL AUTO_INCREMENT,
  TIPO varchar(45) DEFAULT NULL,
  PRIMARY KEY (ID_TIPO_PAGAMENTO)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;