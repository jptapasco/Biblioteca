CREATE DATABASE biblioteca;

USE biblioteca;


CREATE TABLE usuarios (
    id_usuario INT AUTO_INCREMENT PRIMARY KEY,
    cedula VARCHAR(10),
    rol VARCHAR(10),
    nombre VARCHAR(30),
    apellido VARCHAR(30),
    telefono INT UNIQUE,
    direccion VARCHAR(200)  
);


CREATE TABLE libros (
    id_libro INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(200) UNIQUE,
    autor VARCHAR(200),
    descripcion VARCHAR(300),
    genero VARCHAR(15),
    cantidad_disponible VARCHAR(10),
    valor_prestamo VARCHAR(10),
    estado VARCHAR(20)
);

CREATE TABLE prestamo (
    id_prestamo INT AUTO_INCREMENT PRIMARY KEY,
    usuario INT,
    libro INT,
    fecha_prestamo DATE,
    fecha_devolucion DATE,
    cantidad_llevada INT,
    FOREIGN KEY (usuario) REFERENCES usuarios(id_usuario),
    FOREIGN KEY (libro) REFERENCES libros(id_libro)
);

CREATE TABLE estado_pago (
    id_estado_pago INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(10)
);

CREATE TABLE devolucion (
    id_devolucion INT AUTO_INCREMENT PRIMARY KEY,
    usuario INT,
    id_libro INT
);

CREATE TABLE multas (
    id_multas INT AUTO_INCREMENT PRIMARY KEY,
    prestamo INT,
    dias_multados INT,
    valor_pagado INT,
    estado INT,
    FOREIGN KEY (estado) REFERENCES estado_pago(id_estado_pago)
);


