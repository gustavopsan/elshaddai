CREATE DATABASE elshaddai;
USE elshaddai;

CREATE TABLE tbusuarios(
  iduser int(11) NOT NULL PRIMARY KEY,
  usuario varchar(50) NOT NULL,
  fone varchar(15) DEFAULT NULL,
  login varchar(15) UNIQUE NOT NULL,
  senha varchar(15) NOT NULL,
  perfil varchar(20) NOT NULL
) ENGINE = InnoDB;

insert into tbusuarios(iduser, usuario, fone, login, senha, perfil)
values (1, "Administrador", "+5579988162053", "admin", "admin", "admin");

CREATE TABLE tbclientes(
	idcli int(11) NOT NULL PRIMARY KEY auto_increment,
    nomecli varchar(50) NOT NULL,
    nickcli  varchar(20),
    fonecli varchar(15),
    endcli varchar(100)
) ENGINE = InnoDB;

drop table tbprodutos;

CREATE TABLE tbprodutos(
	idprod int(11) NOT NULL PRIMARY KEY auto_increment,
    nomeprod varchar(50) NOT NULL,
    tipoprod varchar(20) NOT NULL,
    dataprod varchar(10),
    pesoprod decimal(5,3),
    precoprod decimal(5,2),
    disponibilidade varchar(30)
) ENGINE = InnoDB;

describe tbusuarios;
describe tbvendas;

CREATE TABLE tbvendas(
	idvenda int(11) NOT NULL PRIMARY KEY auto_increment,
    datavenda varchar(10),
    clivenda varchar(50),
    precovenda decimal(5,2),
    tipovenda varchar(20) NOT NULL,
    quantparc int,
    statusvenda varchar(20) NOT NULL
) ENGINE = InnoDB;

select idcli as ID, nomecli as Nome, nickcli as Apelido, fonecli as Telefone, endcli as Endereço from tbclientes;
select idprod as ID, nomeprod as Produto, tipoprod as Tipo, dataprod as 'Data de Produção', pesoprod as 'Peso (Kg)', precoprod as Preço, disponibilidade as Disponibilidade from tbprodutos;
select idvenda as ID, datavenda as 'Data', clivenda as Cliente, precovenda as 'Valor Total', tipovenda as Tipo, quantparc as Parcelamento, statusvenda as 'Status' from tbvendas;

delete from tbprodutos where idprod = 2;

select nomecli from tbclientes where idcli = 3;
