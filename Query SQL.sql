/*Sentencias DDL*/
/* CREATE */
create  database prueba;
use prueba;
create table user(
id int, 
name varchar(255),
last_name varchar(255),
documento_cliente_empresa varchar(255)
);

/* DROP*/
drop database prueba2;
drop table usuario;

/* ALTER */
ALTER TABLE usuario add tipo_documento varchar(45);
use prueba;
/*Sentencias DML - CRUD*/

/* INSERT */
insert into prueba.usuario(id, name, last_name, tipo_documento) values (4, 'Néstor Andrés', 'Rodríguez', 'CC'), (5, 'Carlos', 'Perz', 'CC'); 
insert into prueba.usuario(id, name, last_name, tipo_documento) values (2, 'Carlos', 'Perz', 'CC'); /* Create */

/*SELECT */
select * from  prueba.usuario; /* Read */
select name, last_name from prueba.usuario; /* read */

/* UPDATE */
update prueba.usuario set name = "Pedro" where id = 4 or id = 3; /* Update */

/* DELETE */
delete from usuario where id = 5; /* delete */

/*Sentencias DCL*/