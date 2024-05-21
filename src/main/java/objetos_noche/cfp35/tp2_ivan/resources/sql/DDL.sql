-- Active: 1716238361971@@127.0.0.1@3306
-- DDL Data Definition Language (Lenguaje de Definición de Datos)
-- Definimos las estructuras de datos (Tablas)

select sqlite_version();

-- drop table if exists alumnos;
-- drop table if exists cursos;

-- create table cursos(
--     id integer not null,
--     titulo text check(length(titulo)>=3 and length(titulo)<=35) not null,
--     profesor text check(length(profesor)>=3 and length(profesor)<=25) not null,
--     dia text check(dia in('LUNES','MARTES','MIERCOLES' ,'JUEVES', 'VIERNES')) not null,
--     turno text check(turno in('MAÑANA', 'TARDE', 'NOCHE')) not null,
--     primary key(id)
-- );

-- create table alumnos(
--     id integer not null,
--     nombre text not null,
--     apellido text not null,
--     edad integer check(edad>=18 and edad<=120) not null,
--     id_curso integer references cursos(id),
--     primary key(id)
-- );


drop TABLE if EXISTS vehiculos;

CREATE TABLE vehiculos (
    id INTEGER NOT NULL,
    marca VARCHAR(50) NOT NULL,
    modelo VARCHAR(50) NOT NULL,
    precio FLOAT NOT NULL
)