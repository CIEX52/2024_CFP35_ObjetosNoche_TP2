-- Active: 1716500458224@@127.0.0.1@3306
-- DDL Data Definition Language (Lenguaje de Definición de Datos)
-- Definimos las estructuras de datos (Tablas)

select sqlite_version();
drop TABLE if EXISTS autos;
drop TABLE if EXISTS motos;

CREATE TABLE autos (
    id INTEGER NOT NULL,
    marca VARCHAR(50) NOT NULL,
    modelo VARCHAR(50) NOT NULL,
    puertas INTEGER NOT NULL,
    precio FLOAT NOT NULL,
    PRIMARY KEY(id)
);

CREATE TABLE motos (
    id INTEGER NOT NULL,
    marca VARCHAR(50) NOT NULL,
    modelo VARCHAR(50) NOT NULL,
    cilindrada INTEGER NOT NULL,
    precio FLOAT NOT NULL,
    PRIMARY KEY(id)
);