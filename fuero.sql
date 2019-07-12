----------------------------
--CREANDA LA BASE DE DATOS--
----------------------------
create database fuero
go
use fuero
go
-----------------------
--CREANDO LAS TABLAS---
-----------------------
create table perfiles(
	id_perfil char(3) primary key,
	desc_perf varchar(50),
)
go
insert into perfiles values(001,'Jefe Logistica')
insert into perfiles values(002,'Dlogistico')
insert into perfiles values(003,'directivos')
insert into perfiles values(004,'conductor')



create table privilegios(
	id_privilegios char(5) primary key,
	tipo_privilegio varchar(20),
    descripcion varchar(max)
)
go

insert into privilegios values(00001,'administrador','tendra acceso total al sistema')
insert into privilegios values(00002,'director logistico','usara el sistema')
insert into privilegios values(00003,'directores de areas','solicitara las comisiones')
insert into privilegios values(00004,'conductor','tendra acceso a los horarios')

create table usuario(
	id_usuario int primary key,
	contraseña varchar(20),
	nombre varchar(50),
	nivel int,
	cargo varchar(30),
	id_privilegios char(5) references privilegios,
	id_perfil char(3) references perfiles
)
go	

insert into usuario values(1,'123','Sam',1,'Administrador',1,1)
insert into usuario values(2,'123','Ana',2,'Director',2,2)
insert into usuario values(3,'123','Dan',3,'Directores de area',3,3)
insert into usuario values(4,'123','Jun',4,'Conductor',4,4)

create table vehiculo(
	id_vehiculo char(5) primary key,
	tipo_de_vehiculo varchar(50),
	marca_vehiculo varchar(30),
	modelo_vehiculo varchar(40),
	estado_soat char(1),
	servicio_tecnico char(1),
	seguro_vehic char(1),
	nuemero_placa int
)
go

create table directores(
 id_director char(5)primary key,
 nombre varchar(50),
 apellidos varchar(210),
 dni char(8),
 area varchar(20)
);
go
create table conductor(
	id_conductor char(5) primary key,
	nombre varchar(30),
	apell_pat varchar(20),
	apell_mat varchar(20) null,
	DNI char(8),
	tipo_licencia varchar(10),
	numero_bevete varchar(10),
	estado_conduc varchar(10),
	tipo_conductor varchar(20),
	nacionalidad varchar(30),
	pasaporte bigint
);
go
truncate table conductor

alter table conductor alter column pasaporte bigint

insert into conductor values('2000','james','muñoz','garcia','75784478','A-I','Q75784478','Inactivo','Civil','Peruano',12345678910)

create table alertas_vehic_conduc(
	id_alerta int primary key,
	id_vehiculo char(5)  references vehiculo,
	id_conductor char(5)  references conductor,
	tipo_alerta varchar(10),
	tiempo int
)
go

create table solicitud_comision(
	id_soli char(5)primary key ,
	area_soli varchar(30),
	nombre_soli varchar(40),
	lugar_comision varchar(40),
	fecha_de_uso date ,
	tiempo_uso varchar(20),
   	hora_salida varchar(20),
	n_pasajeros int ,
	detalle varchar(200)
);
go
truncate table solicitud_comision;
select*from solicitud_comision;
insert into solicitud_comision values('1','Recursos Humanos','Juan','Las flores 1042',getdate(),'02:30:00','12:00:00',4,'Es para el recogo de un administrador')
insert into solicitud_comision values('2','Administracion','Pedro','Av.Sol 322',getdate(),'03:00:00','12:00:00',2,'Es para el recogo de militar retirado')

create table asignar_comision(
	id_asig char(5) primary key,
	id_vehiculo char(5)  references vehiculo,
	id_conductor char(5)  references conductor,
	id_soli char(5) references solicitud_comision,
	estado char(1)
);
go


