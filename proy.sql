create database tiendaRopaP;
drop database tiendaRopaP;

use tiendaRopaP;
create table tipo_usuarios(
	idtipo_usuarios int auto_increment,
    nombre varchar(30) not null,
    primary key (idtipo_usuarios)
);

insert into tipo_usuarios(nombre)values('Administrador');
insert into tipo_usuarios(nombre)values('Usuario');

select * from tipo_usuarios;

create table usuarios(
	idusuario int auto_increment,
    usuario varchar(50) not null,
    contra varchar(50) not null,
    nombre varchar(50) not null,
    correo varchar(50) not null,
    last_session datetime,
    id_tipo int(11),
    primary key (idusuario),
    FOREIGN KEY (id_tipo) REFERENCES tipo_usuarios(idtipo_usuarios)
);

select * from usuarios;
drop table usuarios;


create table ClasePrenda(
	idClasePrenda int auto_increment,
    nombre varchar(50) not null,
	primary key (idClasePrenda)
);

insert into ClasePrenda (nombre) value('Superior');
insert into ClasePrenda (nombre) value('Inferior');
insert into ClasePrenda (nombre) value('Calzado');

select * from ClasePrenda;

create table TipoPrenda(
	idTipoPrenda int auto_increment,
    nombre varchar(50) not null,
    idclaseprenda int not null,
	primary key (idTipoPrenda),
	FOREIGN KEY (idclaseprenda) REFERENCES ClasePrenda(idClasePrenda)
);
insert into TipoPrenda(nombre,idclaseprenda)values('Camiseta',1);
insert into TipoPrenda(nombre,idclaseprenda)values('Camisa',1);
insert into TipoPrenda(nombre,idclaseprenda)values('Sudadera',1);
insert into TipoPrenda(nombre,idclaseprenda)values('Chaqueta',1);
insert into TipoPrenda(nombre,idclaseprenda)values('Sueter',1);
insert into TipoPrenda(nombre,idclaseprenda)values('Abrigo',1);

insert into TipoPrenda(nombre,idclaseprenda)values('Pantalon de Vestir',2);
insert into TipoPrenda(nombre,idclaseprenda)values('Pantalon Deportivo',2);
insert into TipoPrenda(nombre,idclaseprenda)values('Shorts',2);
insert into TipoPrenda(nombre,idclaseprenda)values('Bermudas',2);

insert into TipoPrenda(nombre,idclaseprenda)values('Casual',3);
insert into TipoPrenda(nombre,idclaseprenda)values('Deportivo',3);
insert into TipoPrenda(nombre,idclaseprenda)values('Formal',3);
insert into TipoPrenda(nombre,idclaseprenda)values('Sandalias',3);

select * from TipoPrenda;

drop table Tallas;

create table Tallas(
	idtalla int auto_increment,
    nombre varchar(50) not null,
    idclasePrenda int not null,
	primary key (idtalla),
	FOREIGN KEY (idclasePrenda) REFERENCES ClasePrenda(idClasePrenda)
);

insert into Tallas (nombre,idclasePrenda) value('CH',1);
insert into Tallas (nombre,idclasePrenda) value('M',1);
insert into Tallas (nombre,idclasePrenda) value('GR',1);
insert into Tallas (nombre,idclasePrenda) value('XG',1);

insert into Tallas (nombre,idclasePrenda) value('32',2);
insert into Tallas (nombre,idclasePrenda) value('34',2);
insert into Tallas (nombre,idclasePrenda) value('36',2);
insert into Tallas (nombre,idclasePrenda) value('38',2);


insert into Tallas (nombre,idclasePrenda) value('3',3);
insert into Tallas (nombre,idclasePrenda) value('4',3);
insert into Tallas (nombre,idclasePrenda) value('5',3);
insert into Tallas (nombre,idclasePrenda) value('6',3);
SELECT * from Tallas;


SELECT * FROM tropa.usuarios;
SELECT * FROM tiendaropa.tipo_usuarios;

create table ropa(
	idropa int auto_increment,
    nombre varchar(50) not null,
    descripcion varchar(300) not null,
    precio_costo double not null,
    precio_venta double not null,
    ganancia double not null,
    genero varchar(9) not null,
    marca varchar(30) not null,
    idtipoprenda int not null,
    primary key(idropa),
    FOREIGN KEY (idtipoprenda) REFERENCES TipoPrenda(idTipoPrenda)
);
select * from ropa;

drop table ropa;

create table ropa_talla(
	idRopaTalla int auto_increment,
	idropa int not null,
	idtalla int not null,
	existencias int not null default 0,
    primary key(idRopaTalla),
	FOREIGN KEY (idropa) REFERENCES ropa(idropa),
	FOREIGN KEY (idtalla) REFERENCES Tallas(idtalla)
);

drop table ropa_talla;
 
 select * from TipoPrenda;
 insert into ropa(nombre,descripcion,precio,genero,marca,idtipoprenda) values ('Nike Drifit Pro','Casisa fabricada en Indonesia',899.00,'Masculino','Nike',2);
 insert into ropa(nombre,descripcion,precio,genero,marca,idtipoprenda) values ('Nike SportSwaer Fit','Pantalon Deposrtivo fabricada en Indonesia',1299.00,'Masculino','Nike',8);

select * from ropa;
select * from Tallas;

insert into ropa_talla(idropa,idtalla,existencias)values(1,1,10);
insert into ropa_talla(idropa,idtalla,existencias)values(1,3,5);
insert into ropa_talla(idropa,idtalla,existencias)values(1,4,2);
 select * from ropa_talla;
 select * from ropa;

select distinct r.idropa, r.nombre, r.descripcion, r.precio, GROUP_CONCAT('Talla: ',t.nombre,' Existencias: ',rp.existencias SEPARATOR ', ') As Tallas, r.genero, r.marca, cp.nombre, tp.nombre
from ropa r inner join ropa_talla rp on r.idropa = rp.idropa inner join Tallas t on rp.idtalla=t.idtalla 
    inner join ClasePrenda cp on t.idclasePrenda=cp.idClasePrenda
    INNER JOIN TipoPrenda tp ON cp.idClasePrenda = tp.idclaseprenda
where r.idropa=11;

select distinct r.idropa, r.nombre, r.descripcion, r.genero, r.marca, cp.nombre, tp.nombre 
from ropa r inner join ropa_talla rp on r.idropa = rp.idropa inner join Tallas t on rp.idtalla=t.idtalla 
    inner join ClasePrenda cp on t.idclasePrenda=cp.idClasePrenda
    INNER JOIN TipoPrenda tp ON r.idtipoprenda = tp.idTipoPrenda;


SELECT DISTINCT r.idropa, r.nombre, r.descripcion, r.genero, r.marca, cp.nombre, tp.nombre FROM ropa r INNER JOIN ropa_talla rp ON r.idropa = rp.idropa INNER JOIN Tallas t ON rp.idtalla=t.idtalla INNER JOIN ClasePrenda cp ON t.idclasePrenda=cp.idClasePrenda INNER JOIN TipoPrenda tp ON r.idtipoprenda = tp.idTipoPrenda;

select * from ropa_talla;

select * from ropa;

drop table ropa;

select * from TipoPrenda;

Select MAX(idropa) from ropa;


SELECT t.nombre, rt.existencias FROM Tallas t INNER JOIN ropa_talla rt ON t.idtalla = rt.idtalla INNER JOIN ropa r ON rt.idropa = r.idropa WHERE r.idropa=10;