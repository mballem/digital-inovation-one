-- 
-- Banco de dados oficina | MySQL 8.0.22
-- 

-- 
-- Tabela CLIENTES
-- 
DROP Tabela IF EXISTS CLIENTES ;

CREATE Tabela IF NOT EXISTS CLIENTES (
  ID_CLIENTE INT NOT NULL AUTO_INCREMENT,
  NOME VARCHAR(45) NOT NULL,
  TELEFONE VARCHAR(45) NOT NULL,
  EMAIL VARCHAR(45) NULL,
  PRIMARY KEY (ID_CLIENTE))
ENGINE = InnoDB;


-- 
-- Tabela VEICULOS
-- 
DROP Tabela IF EXISTS VEICULOS ;

CREATE Tabela IF NOT EXISTS VEICULOS (
  ID_VEICULO INT NOT NULL AUTO_INCREMENT,
  ID_CLIENTE INT NOT NULL,
  MARCA VARCHAR(45) NULL,
  MODELO VARCHAR(45) NULL,
  ANO VARCHAR(45) NULL,
  COR VARCHAR(45) NULL,
  VIN VARCHAR(45) NULL,
  PRIMARY KEY (ID_VEICULO),
  CONSTRAINT fk_VEICULOS_CLIENTES
    FOREIGN KEY (ID_CLIENTE)
    REFERENCES CLIENTES (ID_CLIENTE)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

-- 
-- Tabela EQUIPE_DE_MECANICOS
-- 
DROP Tabela IF EXISTS EQUIPE_DE_MECANICOS ;

CREATE Tabela IF NOT EXISTS EQUIPE_DE_MECANICOS (
  ID_EQUIPE INT NOT NULL,
  CODIGO VARCHAR(45) NOT NULL,
  PRIMARY KEY (ID_EQUIPE))
ENGINE = InnoDB;


-- 
-- Tabela ENDERECOS
-- 
DROP Tabela IF EXISTS ENDERECOS ;

CREATE Tabela IF NOT EXISTS ENDERECOS (
  ID_ENDERECO INT NOT NULL AUTO_INCREMENT,
  CIDADE VARCHAR(45) NOT NULL,
  LOGRADOURO VARCHAR(45) NOT NULL,
  BAIRRO VARCHAR(45) NOT NULL,
  NUMERO VARCHAR(45) NOT NULL,
  CEP VARCHAR(45) NOT NULL,
  COMPLEMENTO VARCHAR(45) NULL,
  PRIMARY KEY (ID_ENDERECO))
ENGINE = InnoDB;


-- 
-- Tabela MECANICOS
-- 
DROP Tabela IF EXISTS MECANICOS ;

CREATE Tabela IF NOT EXISTS MECANICOS (
  ID_MECANICO INT NOT NULL AUTO_INCREMENT,
  ID_EQUIPE INT NOT NULL,
  ID_ENDERECO INT NOT NULL,
  CODIGO VARCHAR(45) NOT NULL,
  NOME VARCHAR(45) NOT NULL,
  ESPECIALIDADE VARCHAR(45) NOT NULL,
  PRIMARY KEY (ID_MECANICO),
  CONSTRAINT fk_MECANICOS_EQUIPE_DE_MECANICOS1
    FOREIGN KEY (ID_EQUIPE)
    REFERENCES EQUIPE_DE_MECANICOS (ID_EQUIPE)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT fk_MECANICOS_ENDERECOS1
    FOREIGN KEY (ID_ENDERECO)
    REFERENCES ENDERECOS (ID_ENDERECO)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

-- 
-- Tabela TIPOS_DE_SERVICOS
-- 
DROP Tabela IF EXISTS TIPOS_DE_SERVICOS ;

CREATE Tabela IF NOT EXISTS TIPOS_DE_SERVICOS (
  ID_TIPO_SERVICO INT NOT NULL AUTO_INCREMENT,
  CODIGO VARCHAR(45) NOT NULL,
  DESCRICAO VARCHAR(45) NOT NULL,
  VALOR DECIMAL(9,2) NOT NULL,
  PRIMARY KEY (ID_TIPO_SERVICO))
ENGINE = InnoDB;


-- 
-- Tabela STATUS_SERVICO
-- 
DROP Tabela IF EXISTS STATUS_SERVICO ;

CREATE Tabela IF NOT EXISTS STATUS_SERVICO (
  ID_STATUS INT NOT NULL AUTO_INCREMENT,
  DESCRICAO VARCHAR(45) NULL,
  PRIMARY KEY (ID_STATUS))
ENGINE = InnoDB;


-- 
-- Tabela ORDENS_DE_SERVICO
-- 
DROP Tabela IF EXISTS ORDENS_DE_SERVICO ;

CREATE Tabela IF NOT EXISTS ORDENS_DE_SERVICO (
  ID_ORDENS_DE_SERVICO INT NOT NULL AUTO_INCREMENT,
  ID_EQUIPE INT NOT NULL,
  ID_VEICULO INT NOT NULL,
  ID_STATUS INT NOT NULL,
  NUMERO_OS VARCHAR(45) NOT NULL,
  DATA_EMISSAO DATE NOT NULL,
  DATA_ENTREGA DATE NOT NULL,
  VALOR_TOTAL_OS DECIMAL(9,2) NULL,
  OS_APROVADA TINYINT NULL,
  PRIMARY KEY (ID_ORDENS_DE_SERVICO),
  CONSTRAINT fk_ORDENS_DE_SERVICO_EQUIPE_DE_MECANICOS1
    FOREIGN KEY (ID_EQUIPE)
    REFERENCES EQUIPE_DE_MECANICOS (ID_EQUIPE)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT fk_ORDENS_DE_SERVICO_VEICULOS1
    FOREIGN KEY (ID_VEICULO)
    REFERENCES VEICULOS (ID_VEICULO)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT fk_ORDENS_DE_SERVICO_STATUS_SERVICO1
    FOREIGN KEY (ID_STATUS)
    REFERENCES STATUS_SERVICO (ID_STATUS)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

-- 
-- Tabela PECAS
-- 
DROP Tabela IF EXISTS PECAS ;

CREATE Tabela IF NOT EXISTS PECAS (
  ID_PECA INT NOT NULL AUTO_INCREMENT,
  REFERENCIA VARCHAR(45) NULL,
  MODELO VARCHAR(45) NULL,
  ANO VARCHAR(4) NULL,
  VALOR DECIMAL(9,2) NULL,
  PRIMARY KEY (ID_PECA))
ENGINE = InnoDB;


-- 
-- Tabela ORDENS_SERVICO_TEM_TIPOS_DE_SERVICOS
-- 
DROP Tabela IF EXISTS ORDENS_SERVICO_TEM_TIPOS_DE_SERVICOS ;

CREATE Tabela IF NOT EXISTS ORDENS_SERVICO_TEM_TIPOS_DE_SERVICOS (
  ID_ORDEM_TIPO_SERVICO INT NOT NULL AUTO_INCREMENT,
  TIPOS_DE_SERVICOS_ID_TIPO_SERVICO INT NOT NULL,
  ORDENS_DE_SERVICO_ID_ORDENS_DE_SERVICO INT NOT NULL,
  PRIMARY KEY (ID_ORDEM_TIPO_SERVICO),
  CONSTRAINT fk_TIPOS_DE_SERVICOS_has_ORDENS_DE_SERVICO_TIPOS_DE_SERVICOS1
    FOREIGN KEY (TIPOS_DE_SERVICOS_ID_TIPO_SERVICO)
    REFERENCES TIPOS_DE_SERVICOS (ID_TIPO_SERVICO)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT fk_TIPOS_DE_SERVICOS_has_ORDENS_DE_SERVICO_ORDENS_DE_SERVICO1
    FOREIGN KEY (ORDENS_DE_SERVICO_ID_ORDENS_DE_SERVICO)
    REFERENCES ORDENS_DE_SERVICO (ID_ORDENS_DE_SERVICO)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

-- 
-- Tabela ORDENS_DE_SERVICO_TEM_PECAS
-- 
DROP Tabela IF EXISTS ORDENS_DE_SERVICO_TEM_PECAS ;

CREATE Tabela IF NOT EXISTS ORDENS_DE_SERVICO_TEM_PECAS (
  ID_ORDEM_PECA INT NOT NULL AUTO_INCREMENT,
  ID_ORDENS_DE_SERVICO INT NOT NULL,
  ID_PECA INT NOT NULL,
  PRIMARY KEY (ID_ORDEM_PECA),
  CONSTRAINT fk_ORDENS_DE_SERVICO_has_PECAS_ORDENS_DE_SERVICO1
    FOREIGN KEY (ID_ORDENS_DE_SERVICO)
    REFERENCES ORDENS_DE_SERVICO (ID_ORDENS_DE_SERVICO)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT fk_ORDENS_DE_SERVICO_has_PECAS_PECAS1
    FOREIGN KEY (ID_PECA)
    REFERENCES PECAS (ID_PECA)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

-- 
-- Tabela ESPECIALIDADES
-- 
DROP Tabela IF EXISTS ESPECIALIDADES ;

CREATE Tabela IF NOT EXISTS ESPECIALIDADES (
  ID_ESPECIALIDADE INT NOT NULL AUTO_INCREMENT,
  TITULO VARCHAR(45) NOT NULL,
  DESCRICAO VARCHAR(45) NOT NULL,
  PRIMARY KEY (ID_ESPECIALIDADE))
ENGINE = InnoDB;


-- 
-- Tabela MECANICOS_TEM_ESPECIALIDADES
-- 
DROP Tabela IF EXISTS MECANICOS_TEM_ESPECIALIDADES ;

CREATE Tabela IF NOT EXISTS MECANICOS_TEM_ESPECIALIDADES (
  ID_MECANICO_ESPECIALIDADE VARCHAR(45) NOT NULL,
  ID_MECANICO INT NOT NULL,
  ESPECIAID_ESPECIALIDADE INT NOT NULL,
  PRIMARY KEY (ID_MECANICO_ESPECIALIDADE),
  CONSTRAINT fk_MECANICOS_has_ESPECIALIDADES_MECANICOS1
    FOREIGN KEY (ID_MECANICO)
    REFERENCES MECANICOS (ID_MECANICO)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT fk_MECANICOS_has_ESPECIALIDADES_ESPECIALIDADES1
    FOREIGN KEY (ESPECIAID_ESPECIALIDADE)
    REFERENCES ESPECIALIDADES (ID_ESPECIALIDADE)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;
