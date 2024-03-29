--
-- inserção tabela clientes
---
INSERT INTO `clientes` VALUES 
(1,'JOELMA CASTRO','11991475895','JOELMA@EMAIL.COM'),
(2,'PIETRA RAMOS','11991474040','PIETRA@EMAIL.COM.BR'),
(3,'RICARDO MATTOS','11991478088','RMATTOS@EMAIL.COM'),
(4,'JULIO CESAR GOMES','11991477077','JCESAR@EMAIL.COM'),
(5,'MARCUS PETRI','11991474040','MPETRI@EMAIL.COM.BR'),
(6,'ANA LUCIA NAVARRO','11991477740','ANA.LUCIA@EMAIL.COM.BR'),
(7,'CARMEN SANTOS PEREIRA','11991478899','CARMEN@EMAIL.COM'),
(8,'OTAVIO LUIS DEC ASTRO','11991473340','OTV.LUIS@EMAIL.COM.BR'),
(9,'ANTONIO RIOS','11991474477','OT.RIOS@EMAIL.COM.BR'),
(10,'MARIA JOANA SPEBET','11991472203','MJSPEBRT@EMAIL.COM.BR');

--
-- inserção tabela veiculos
--
INSERT INTO `veiculos` VALUES 
(1,1,'FIAT','PALIO 1.0','2005','BRANCO','9BRBLWHEXG0140772'),
(2,1,'FIAT','PALIO 1.0','2002','PRETO','9BRBLWHEXG0144488'),
(3,2,'HONDA','FIT 1.4','2009','PRATA','9BRBLWHEXG0144479'),
(4,3,'CHEVROLET','PRISMA 1.0','2012','VINHO','9BRBLTYEXG0140772'),
(5,4,'CHEVROLET','ONIX 1.4','2015','VERDE','9BRBLWHEXG8540772'),
(6,5,'FORD','FOCUS 1.8','2008','PRETO','9BRBLRTEXG0140772'),
(7,5,'HONDA','CIVIC 1.8','2010','BRANCO','9BRBLWHEXG0880772'),
(8,6,'FORD','KA 1.0','2012','PRATA','9BRBLWHEXG0150772'),
(9,7,'HYUNDAI','HB20 1.0','2014','BRANCO','9BRBLWGFXG0150872'),
(10,8,'HYUNDAI','HB20','2016','VERMELHO','9BRBLWHEZG0188002'),
(11,9,'TOYOTA','ETIOS X','2018','AZUL','9BRBLXHFXG0150792'),
(12,10,'RENAULT','SANDERO','2009','AZUL','9BRBLWHEXG0122452'),
(13,7,'FIAT','ARGO','2017','BRANCO','9BRBLWHEXG0659712'),
(14,4,'PEUGEOT','106','1996','CINZA','9BRBLWTTXJ0150772');

--
-- inserção tabela enderecos
---
INSERT INTO `enderecos` VALUES 
(1,'SÃO PAULO','RUA DAS GINCANAS','MOEMA','101','21040360',NULL),
(2,'SÃO PAULO','RUA DAS APOSTAS','MORUMBI','302','21050680','AP. 20'),
(3,'SÃO PAULO','AV. LAGO AZUL','TATUAPÉ','99','21080680','FUNDOS'),
(4,'OSASCO','AV. PAI DO CÉU','MINISTÉRIO','986','22040689',NULL),
(5,'DIADEMA','RUA DOS MILAGRES','MORRO ALTO','75','23041750','AP. 108'),
(6,'SANTO ANDRÉ','RUA DOS LAGOS','LAGOA','655','24040978',NULL),
(7,'SÃO PAULO','RUA DAS ESCORAS','BARRA FUNDA','743','21050680',NULL),
(8,'SÃO PAULO','RODOVIA 116','BARRA FUNDA','903','21050670',NULL),
(9,'SÃO PAULO','RUA ESPERANÇA','BRÁS','660','21050640','FUNDOS'),
(10,'DIADEMA','AV. PRESIDENTE VARGAS','ALTOS VERDES','462','23060804',NULL),
(11,'DIADEMA','AV.PRESIDENTE VARGAS','MORRO ALTO','11','23060804','AP. 201'),
(12,'SANTO ANDRÉ','RUA PERÓLA BRANCA','LADEIRA SUL','505','24040978','CONJ. 10'),
(13,'OSASCO','RUA OLHO MÁGICO','CARROCEL','322','22040688','AP. 03'),
(14,'SÃO BERNARDO','RUA VITÓRIA','LARGO DA VIAÇÃO','78','29050680',NULL),
(15,'SAO BERNARDO','RUA DOS PASSÁROS','AVIÁRIO','66','29050680','AP. 101');

--
-- inserção tabela equipe_de_mecanicos
--
INSERT INTO `equipe_de_mecanicos` VALUES (1,'MEC1'),(2,'MEC2'),(3,'MEC3');

--
-- inserção tabela especialidades
--
INSERT INTO `especialidades` VALUES 
(1,'MECANICO GERAL','CONHECIMENTO GERAL SOBRE MECANICA AUTOMOTIVA'),
(2,'INJEÇÃO ELETRÔNICA','DOMINIO EM INJEÇÃO ELETRÔNICA'),
(3,'CHAPEAMENTO OU LANTERNAGEM','ESPECIALISTA EM LATARIA'),
(4,'ELETRECISTA','CONHECIMENTO DA PARTE ELETRICA AUTOMOTIVA'),
(5,'MOTOR','DOMINIO EM MANUTENÇÃO DE MOTERES'),
(6,'MONTAGEM E DESMONTAGEM DE INTEIROR','COLOCAÇÃO DE PEÇAS DO INTERIOR DO VEÍCULO'),
(7,'CARBURADOR','CONHECIMENTO EM CARBURADORES'),
(8,'HOMOCINÉTICA','DOMINIO EM HOMOCINÉTICA'),
(9,'REGULAGEM DE FAROIS','RAGULAGEM DE FAROIS'),
(10,'ALINHAMENTO','REGULAGEM DOS ANGULOS DE DIREÇÃO E SUSPENSÃO'),
(11,'BALANCEAMENTO','BALANCEAMENTO DE RODAS'),
(12,'SUSPENSÃO','TROCA E REGULAGEM'),
(13,'TRANSMISSÃO MANUAL','MANUTENÇÃO DE TRANSMISSÃO MANUAL'),
(14,'TRANSMISSÃO AUTOMÁTICA','MANUTENÇÃO DE TRANSMISSÃO AUTOMÁTICA'),
(15,'DIREÇÃO HIDRAULICA','MANUTENÇÃO DIREÇÃO HIDRAULICA'),
(16,'DIREÇÃO ELÉTRICA','MANUTENÇÃO DEDIREÇÃO ELÉTRICA'),
(17,'SOLDADOR','REALIZA O SERVIÇO DE SOLDA EM METAIS');

--
-- inserção tabela mecanicos
--
INSERT INTO `mecanicos` VALUES (1,1,1,'KBR001','JOÃO PAULO SANTOS'), 
(2,1,2,'KBR002','CRISTIAN SOUSA'),
(3,1,3,'KBR003','MARCUS JUNIOR'),
(4,1,4,'KBR004','VILSON PERES'),
(5,1,5,'KBR005','MARIA ONÓRIO'),
(6,2,6,'KBR006','JULIO OTO PEREIRA'),
(7,2,7,'KBR007','CARLOS CARVALHAL'),
(8,2,8,'KBR008','GILSON SILVA'),
(9,2,9,'KBR009','LUANA CRISTOVÃO'),
(10,3,10,'KBR010','LUCIO NUNES'),
(11,3,11,'KBR011','JEFERSON RIBEIRO'),
(12,3,12,'KBR012','RIBAMAR SILVA SANTOS'),
(13,3,13,'KBR013','SILVIA BARRO'),
(14,3,14,'KBR014','MARIANO LOPES'),
(15,3,15,'KBR015','TOBIA CANTO MARIN');

--
-- inserção tabela mecanicos_tem_especialidades
--
INSERT INTO `mecanicos_tem_especialidades` VALUES 
(1,1,1),(2,2,2),(3,3,3),(4,4,4),(5,5,5),(6,6,6),(7,7,7),
(8,8,8),(9,9,9),(10,10,10),(11,11,11),(12,12,12),(13,13,13),
(14,14,14),(15,15,15),(16,15,16),(17,1,5),(18,2,6),(19,5,10),
(20,10,15),(21,8,2),(22,7,4),(23,1,13),(24,1,11),(25,3,14),(26,3,12);

--
-- inserção tabela tipos_de_servicos
--
INSERT INTO `tipos_de_servicos` VALUES 
(1,'CHAPEAMENTO',' ',350.00),
(2,'REGULAGEM DE FAROIS',' ',150.00),
(3,'TROCA DE PNEUS',' ',80.00),
(4,'TROCA DE RODAS',' ',135.00),
(5,'TROCA DE VIDRO DIANTEIRO',' ',220.00),
(6,'TROCA DE VIDRO TRASEIRO',' ',240.00),
(7,'TROCA DE VIDRO LATERAL',' ',180.00),
(8,'TROCA DE SINALEIRA',' ',45.00),
(9,'TROCA DE OLEO MOTOR',' ',49.90),
(10,'TROCA DE OLEO TRANSMISSÃO MANUAL',' ',59.90),
(11,'TROCA DE OLEO TRANSMISSAO AUTOM',' ',89.90),
(12,'ALINHAMENTO',' ',280.80),
(13,'TROCA DE PAINEL',' ',480.80),
(14,'TROCA DE TRANSMISSAO MANUAL',' ',520.00),
(15,'TROCA DE TRANSMISSAO AUTOM',' ',680.90),
(16,'MANUTENÇÃO ELÉTRICA',' ',260.40),
(17,'REGULAGEM CENTRAL INJEÇÃO ELETRONICA',' ',280.80),
(18,'REGULAGEM DE CARBURADOR',' ',129.00),
(19,'TROCA DE PISTÃO',' ',100.00),
(20,'TROCA DE VELAS',' ',29.90),
(21,'TROCA DE FUSIVEL DO PAINEL',' ',19.90);


--
-- inserção tabela status_servico
--
INSERT INTO `status_servico` VALUES 
(1,'EM ANDAMENTO'),(2,'CANCELADO'),(3,'FINALIZADO'),(4,'EM ESPERA');

--
-- inserção tabela ordens_de_servico
--
INSERT INTO `ordens_de_servico` VALUES 
(1,1,1,3,'OS0001','2021-02-05','2021-03-15',1888.90,1),
(2,1,2,3,'OS0002','2021-02-07','2021-02-22',3075.00,1),
(3,2,3,3,'OS0003','2021-03-08','2021-03-31',722.00,1),
(4,2,4,3,'OS0004','2021-04-02','2021-04-30',982.30,1),
(5,3,5,3,'OS0005','2021-05-15','2021-06-15',2083.59,1),
(6,3,6,2,'OS0006','2021-06-01','2021-06-05',1371.70,0),
(7,1,7,4,'OS0007','2021-06-29',NULL,129.00,1);

--
-- inserção tabela pecas
--
INSERT INTO `pecas` VALUES 
(1,'ROD9850','RODA 15','2018',234.80),
(2,'ROD4466','RODA 17','2018',334.80),
(3,'ROD6360','RODA 14','2015',198.50),
(4,'VOL3065','VOLANTE C1','2019',135.80),
(5,'VOL3044','VOLANTE X2','2015',230.81),
(6,'CAM9980','TRANSMISSAO MANUAL','2000',1205.99),
(7,'CAM8066','TRANSMISSAO AUTOMATICO CVT','2010',3489.66),
(8,'CAM7090','TRANSMISSAO AUTOMATICO CVT','2020',4950.55),
(9,'VIR4023','VIRABREQUIM','2015',320.60),
(10,'VIR4012','VIRABREQUIM','2000',115.50),
(11,'ROL9078','ROLAMENTO RODA','2005',99.80),
(12,'ROL1044','ROLAMENTO CAMBIO MANUAL','2010',88.90),
(13,'ROL5202','GARFO CAMBIO FIAT ','2009',458.66),
(14,'LAT1012','LANTERNA TRASEIRA PALIO','2005',469.60)
(15,'LAT1326','LANTERNA TRASEIRA FIT','2009',869.00),
(16,'CAP1636','CAPO FORD','2008',488.90),
(17,'FRE0989','LUZ DE FREIO','2005',46.80),
(18,'FRE9098','LUZ DE FREIO','2010',66.00),
(19,'PAI7782','PAINEL FRONTAL ','2005',890.99),
(20,'PAI1012','PAINEL LATERAL DIANTEIRO','2009',498.80),
(21,'PAI6603','PAINEL LATERAL TRASEIRO','2009',501.80),
(22,'VID1020','VIDRO FRONTAL','2019',680.00),
(23,'VID9699','VIDRO LATERAL','2019',480.00),
(24,'VID7050','VIDRO TRASEIRO','2019',880.40),
(25,'SIN1022','SINALEIRA TRASEIRA','2020',82.90),
(26,'TET1036','TETO SOLAR AUTOMÁTICO','2020',2400.50),
(27,'FUS1099','FUSIVEL PAINEL','2020',5.99),
(28,'VEL9980','VELA','2020',16.90),
(29,'PIT7046','PISTAO','2020',49.80),
(30,'FAR8080','FAROL','2020',350.49),
(31,'PNU7070','PNEU FIRESTONE 15','2020',410.00),
(32,'PNU7071','PNEU FIRESTONE 17','2020',510.00),
(33,'PNU7072','PNEU FIRESTONE 14','2020',360.00),
(35,'OLE4114','OLEO DE MOTOR','2020',180.80),
(36,'OLE3626','OLEO DE TRANSMISSAO','2020',200.20);

--
-- inserção tabela ordens_de_servico_tem_pecas
--
INSERT INTO `ordens_de_servico_tem_pecas` VALUES 
(1,1,22),(2,1,30),(3,1,16),(4,2,1),(5,2,1),(6,2,1),(7,2,1),(8,2,31),
(9,2,31),(10,2,31),(11,2,31),(12,3,35),(13,4,25),(14,4,35),(15,4,36),
(16,5,6),(17,5,36),(18,5,28),(19,5,28),(20,5,28),(21,5,28),(22,6,19);

--
-- inserção tabela ordens_servico_tem_tipos_de_servicos
--
INSERT INTO `ordens_servico_tem_tipos_de_servicos` VALUES 
(1,1,1),(2,2,1),(3,5,1),(4,4,2),(5,12,2),(6,3,2),(7,16,3),
(8,17,3),(9,9,3),(10,8,4),(11,9,4),(12,10,4),(13,12,4),
(14,14,5),(15,10,5),(16,20,5),(17,13,6),(18,18,7);

