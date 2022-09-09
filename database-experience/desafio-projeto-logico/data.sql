--
-- Insert tabela cliente
--
INSERT INTO `cliente` 
VALUES (1,1),(2,2),(3,3),(4,4),(5,5),(6,6),(7,7),(8,8);

--
-- Insert tabela dados_complementares
--
INSERT INTO `dados_complementares` 
VALUES (1,1,'Pietra Ramos','1234412365897412','2026-06-30'),
    (2,2,'Ricardo Camargo','1236654785269632','2022-12-31'),
    (3,1,'Rita de Cassia Sousa','9632852674124569','2023-12-31'),
    (4,3,'Mario Borges','8522333365458545','2024-05-31'),
    (5,2,'Juliano Castro Fiel','7415147885456524','2022-09-15'),
    (6,5,'Olimar Camgro','7896547832569663','2022-09-07'),
    (7,1,'Pietra Ramos','1234412365897412','2026-06-30'),
    (8,1,'Rita de Cassia Sousa','9632852674124569','2026-06-30'),
    (9,6,'Papelaria Silva','9856745814523621','2025-05-15'),
    (10,6,'Papelaria Silva','9856745814523621','2025-05-15');

--
-- Insert tabela endereco
--
INSERT INTO `endereco` 
VALUES (1,'Rua das Flores','Jardins','50',NULL,'São Paulo','SP','01153000'),
    (2,'Rua das Pedras','Pederira Alta','898','Ap. 106','São Paulo','SP','01153000'),
    (3,'Rua dos Anjos','Céu Azul','46',NULL,'Porto Alegre','RS','90010100'),
    (4,'Rua dos Anjos','Céu Azul','896','Ap. 107','Porto Alegre','RS','90010100'),
    (5,'Av. Lagoa','Lagoa','405',NULL,'São Sebastião','MG','31630900'),
    (6,'Av. Lagoa','Loago Sul','98',NULL,'São Sebastião','MG','31630900'),
    (7,'Rua Sobral','Sitio Sul','740',NULL,'São Cristovão','RJ','20021001'),
    (8,'Rua Oliveira','Jardim Botanico','405','Ap. 108','Rio de Janeiro','RJ','20021020');

--
-- Insert tabela estoque
--
INSERT INTO `estoque` 
VALUES (1,'SP'),(2,'RJ'),(3,'RS'),(4,'SC');

--
-- Insert tabela fornecedor
--
INSERT INTO `fornecedor` 
VALUES (1,'Hardware Store','80205035000153'),
    (2,'Food e Drinks Ltda','32205035000180'),
    (3,'Industria Covala','37895035000153'),
    (4,'Agro Matias & Mattos','89205035000154'),
    (5,'California Moveis','85245035000153'),
    (6,'Informativa Ativa','92205035000199'),
    (7,'Eltro Toda Casa','35505035000142'),
    (8,'Lufus Pets','36640489800101'),
    (9,'Bazar Casa Coral ','90084565000101');

--
-- Insert tabela fornecedor_tem_produto
--
INSERT INTO `fornecedor_tem_produto` 
VALUES (1,4,16),(2,4,17),(3,4,18),(4,4,19),
    (5,3,6),(6,5,7),(7,5,8),(8,3,9),(9,3,10),(10,3,11),
    (11,2,12),(12,2,13),(13,2,14),(14,2,15),(15,1,20),(16,1,21),
    (17,1,22),(18,7,1),(19,7,2),(20,6,3),(21,6,4),(22,3,5);

--
-- Insert tabela pedido
--
INSERT INTO `pedido` 
VALUES (1,1,1,9.99,2099.65,'ERT123456','2021-08-01','2021-08-20',NULL),
    (2,2,2,11.99,269.40,'ERT123789','2021-08-01','2021-08-20',NULL),
    (3,3,1,9.99,42.60,'ERT326508','2022-09-02','2022-09-18',NULL),
    (4,4,3,49.89,3501.26,'ERT963410','2022-09-03','2022-09-24',NULL),
    (5,5,2,29.90,388.60,'ERT988085','2022-09-03','2022-09-18',NULL),
    (6,6,5,39.81,5780.99,'ERT909088','2022-09-04','2022-09-25',NULL),
    (7,1,1,23.85,5780.99,'ERT987898','2022-09-05','2022-09-27',NULL),
    (8,3,1,10.88,1500.80,'ERT802469','2022-09-06','2022-09-28',NULL),
    (9,7,6,32.55,1102.70,'ERT105895','2022-09-07','2022-10-01',NULL),
    (10,7,6,51.49,3739.70,'ERT205666','2022-09-08','2022-10-15',NULL);

--
-- Insert tabela pedido_tem_produto
--
INSERT INTO `pedido_tem_produto` 
VALUES (1,1,1,1),(2,1,2,1),(3,2,16,3),(4,3,14,10),
    (5,3,13,2),(6,4,1,1),(7,4,22,1),(8,4,7,1),(9,5,10,2),
    (10,5,12,10),(11,5,20,1),(12,6,4,1),(13,7,4,1),(14,8,22,1),
    (15,9,21,1),(16,9,8,1),(17,9,6,1),(18,10,20,1),(19,10,3,1);


--
-- Insert tabela pedido_tem_status
--
INSERT INTO `pedido_tem_status` 
VALUES (1,1,2,'2021-08-01',NULL),
    (2,2,2,'2021-08-01',NULL),
    (3,3,3,'2022-09-02',NULL),
    (4,4,2,'2022-09-03',NULL),
    (5,5,1,'2022-09-03','2022-09-04'),
    (6,6,2,'2022-09-04',NULL),
    (7,7,3,'2022-09-05',NULL),
    (8,8,1,'2022-09-06','2022-09-07'),
    (9,9,2,'2022-09-07',NULL),
    (10,10,2,'2022-09-08',NULL);

--
-- Insert tabela pessoa_fisica
--
INSERT INTO `pessoa_fisica` 
VALUES (1,'96385274198','Pietra Ramos','1990-05-10','F'),
    (2,'96385274140','Ricardo Camargo','1998-04-14','M'),
    (3,'85385274198','Rita de Cassia Sousa','1985-03-07','F'),
    (4,'96854274198','Mario Borges','2001-04-06','M'),
    (5,'74285274198','Jussara da Silva','2000-09-10','O'),
    (6,'74566920078','Otavio Santos','1995-02-08','M');

--
-- Insert tabela pessoa_juridica
--
INSERT INTO `pessoa_juridica` 
VALUES (7,'32205035000153','Papelaria Silva','10190588','2009-05-04','Papelaria Silva'),
    (8,'32205035000455','Pizzaria Belo Sabor','10508988','2015-04-08','Pizzaria Belo Sabor');

--
-- Insert tabela produto
--
INSERT INTO `produto` 
VALUES (1,'Eletrodomestico','Refrigerador',1200.66),
    (2,'Eletrodomestico','Fogão',898.99),
    (3,'Informatica','PC Lenovo XX45',3588.90),
    (4,'Informatica','PC ACER T99',5780.99),
    (5,'Bazar','Jogo de Mesa',199.80),
    (6,'Bazar','Jogo de Cama',450.80),
    (7,'Moveis','Roupeiro 3 Portas',799.80),
    (8,'Moveis','Ropeiro 2 Portas',599.40),
    (9,'Vestuario','Camisa Polo',99.00),
    (10,'Vestuario','Camisa Regata',49.90),
    (11,'Vestuario','Bermuda Surfista',69.49),
    (12,'Alimentos','Caixa Bombom Garoto',13.80),
    (13,'Alimentos','Barra Ao Leite Garoto',8.80),
    (14,'Alimentos','Kit Kat Dark',2.50),
    (15,'Alimentos','Cebolitos Elma Chips',4.50),
    (16,'Pets','Anti Pulga 1 dose',89.80),
    (17,'Pets','Coleira e Guia',44.52),
    (18,'Pets','Talco Banho',19.90),
    (19,'Pets','Sabonete ',10.50),
    (20,'Eletronico','Microfone',150.80),
    (21,'Eletronico','Radio Relógio',52.50),
    (22,'Eletronico','TV Led LG 50',1500.80);

--
-- Insert tabela produto_tem_estoque
--
INSERT INTO `produto_tem_estoque` 
VALUES (1,1,1,50),(2,2,1,100),(3,3,1,80),(4,4,1,50),(5,5,2,30),
    (6,6,2,50),(7,7,2,100),(8,8,3,5),(9,9,3,10),(10,10,4,45),(11,11,1,200),
    (12,12,1,80),(13,13,1,25),(14,14,1,32),(15,15,1,28),(16,16,1,12),
    (17,17,1,19),(18,18,2,20),(19,19,4,0),(20,20,4,0),(21,21,1,8),(22,22,3,45);

--
-- Insert tabela status
--
INSERT INTO `status` 
VALUES (1,'CANCELADO'),(2,'CONFIRMADO'),(3,'EM PROCESSAMENTO');

--
-- Insert tabela tipo_pagamento
--
INSERT INTO `tipo_pagamento` 
VALUES (1,'CARTAO VISA'),(2,'CARTAO MASTERCARD'),
    (3,'CARTAO ELO'),(4,'CARTAO BANRICOMRAS'),
    (5,'BOLETO'),(6,'PIX');

--
-- Insert tabela
--


--
-- Insert tabela
--