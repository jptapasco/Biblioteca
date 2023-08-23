CREATE DATABASE biblioteca;

USE biblioteca;


CREATE TABLE usuarios (
    id_usuario INT AUTO_INCREMENT PRIMARY KEY,
    cedula VARCHAR(10) UNIQUE,
    rol VARCHAR(15),
    nombre VARCHAR(30),
    apellido VARCHAR(30),
    telefono VARCHAR(10) UNIQUE,
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
    usuario VARCHAR(30),
    libro VARCHAR(200),
    fecha_prestamo DATE,
    fecha_devolucion DATE,
    cantidad_llevada INT,
    estado VARCHAR(10)
);


CREATE TABLE devolucion (
    id_devolucion INT AUTO_INCREMENT PRIMARY KEY,
    usuario VARCHAR(10),
    nombre_libro VARCHAR(200),
    fecha_devolucion DATE
);


CREATE VIEW vista_libros AS
SELECT
    id_libro,
    titulo,
    autor,
    descripcion,
    genero,
    cantidad_disponible,
    valor_prestamo,
    estado,
    CASE WHEN cantidad_disponible > 0 THEN 'Disponible' ELSE 'No Disponible' END AS estado_calculado
FROM libros;

INSERT INTO usuarios (cedula, rol, nombre, apellido, telefono, direccion)
VALUES
    ('1059696896', 'Bibliotecario', 'Jp', 'Tapasco', '3136320559', 'Salamanca'),
    ('1111100000', 'Bibliotecario', 'Erick', 'Valvuena', '3876543210', 'Avenida XYZ, Pueblo'),
    ('1234567891', 'Cliente', 'Alejandro', 'Serna', '3555555555', 'Salamanca'),
    ('1222222222', 'Cliente', 'Ana', 'Martínez', '3222222222', 'Carrera 456, Aldea'),
    ('1999999999', 'Cliente', 'Luis', 'Rodríguez', '9999999999', 'Calle 789, Municipio');


INSERT INTO libros (titulo, autor, descripcion, genero, cantidad_disponible, valor_prestamo, estado)
VALUES
    ('Cien años de soledad', 'Gabriel García Márquez', 'Una novela que cuenta la historia de la familia Buendía a lo largo de varias generaciones.', 'Ficción', '5', '2500', 'Disponible'),
    ('El Señor de los Anillos', 'J.R.R. Tolkien', 'Una épica historia de fantasía que sigue las aventuras de un grupo de personajes en su lucha contra el mal.', 'Fantasía', '10', '3000', 'Disponible'),
    ('1984', 'George Orwell', 'Una novela distópica que presenta una sociedad totalitaria y el conflicto de un individuo contra el régimen opresivo.', 'Ciencia Ficción', '5', '2000', 'Disponible'),
    ('Orgullo y Prejuicio', 'Jane Austen', 'Una historia romántica que explora las relaciones sociales y los prejuicios en la Inglaterra del siglo XIX.', 'Romance', '12', '1700', 'Disponible'),
    ('Crónica de una muerte anunciada', 'Gabriel García Márquez', 'Una novela que relata los eventos que llevaron a la muerte de Santiago Nasar.', 'Ficción', '3', '1500', 'Disponible');

