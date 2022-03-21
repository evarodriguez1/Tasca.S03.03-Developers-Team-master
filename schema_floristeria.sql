

DROP DATABASE IF EXISTS floristeria;
CREATE DATABASE floristeria CHARACTER SET utf8mb4;
USE floristeria;

CREATE TABLE floristeria (
  idFloristeria INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(100) NOT NULL
);

CREATE TABLE arboles (
  tipo CHAR NOT NULL,
  idArticulo INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(100) NOT NULL,
  precio DOUBLE NOT NULL,
  altura DOUBLE NOT NULL
  );
CREATE TABLE decoracion (
  tipo CHAR NOT NULL,
  idArticulo INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(100) NOT NULL,
  precio DOUBLE NOT NULL,
  material VARCHAR (50) NOT NULL
  );
CREATE TABLE flores (
  tipo CHAR NOT NULL,
  idArticulo INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(100) NOT NULL,
  precio DOUBLE NOT NULL,
  color VARCHAR (50) NOT NULL
  );
  CREATE TABLE articulos (
  tipo CHAR NOT NULL,
  idArticulo INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(100) NOT NULL,
  precio DOUBLE NOT NULL  
  );
  
  CREATE TABLE ventas (
  idTicket INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  tipoArticulo char NOT NULL,
  idArticulo INT UNSIGNED,
  FOREIGN KEY ( idArticulo) REFERENCES articulos (idArticulo),
  nombreArticulo varchar (100) NOT NULL,
  precioArticulo DOUBLE NOT NULL  
  );
 



