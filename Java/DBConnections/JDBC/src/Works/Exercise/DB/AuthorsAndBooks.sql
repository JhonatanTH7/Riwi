CREATE TABLE authors(
	id int PRIMARY KEY AUTO_INCREMENT,
    name varchar(40) NOT NULL,
    nationality varchar(50) NOT NULL
);

CREATE TABLE books(
	id int PRIMARY KEY AUTO_INCREMENT,
    title varchar(80) NOT NULL,
    year_publication DATE NOT NULL,
    price DOUBLE NOT NULL,
    id_author int NOT NULL,
    FOREIGN KEY (id_author) REFERENCES authors(id)
);

INSERT INTO authors (name, nationality) VALUES
('Gabriel García Márquez', 'Colombiana'),
('Mario Vargas Llosa', 'Peruana'),
('Julio Cortázar', 'Argentino'),
('Jorge Luis Borges', 'Argentino'),
('Pablo Neruda', 'Chileno'),
('Isabel Allende', 'Chilena'),
('Carlos Fuentes', 'Mexicano'),
('Octavio Paz', 'Mexicano'),
('Miguel de Cervantes', 'Español'),
('Federico García Lorca', 'Español'),
('Jorge Amado', 'Brasileño'),
('Clarice Lispector', 'Brasileña'),
('José Saramago', 'Portugués'),
('Fernando Pessoa', 'Portugués'),
('Gustavo Adolfo Bécquer', 'Español'),
('Antonio Machado', 'Español'),
('Rubén Darío', 'Nicaragüense'),
('Horacio Quiroga', 'Uruguayo'),
('Juan Rulfo', 'Mexicano'),
('Alfonsina Storni', 'Argentino'),
('Pablo de Rokha', 'Chileno'),
('José Martí', 'Cubano'),
('César Vallejo', 'Peruano'),
('Mariano Azuela', 'Mexicano'),
('Rosario Castellanos', 'Mexicano'),
('Javier Marías', 'Español'),
('Manuel Puig', 'Argentino'),
('Camilo José Cela', 'Español'),
('Juan Carlos Onetti', 'Uruguayo'),
('Leopoldo Marechal', 'Argentino');

INSERT INTO books (title, year_publication, price, id_author) VALUES
('Cien años de soledad', '1967-01-01', 25.99, 1),
('La casa verde', '1966-01-01', 20.50, 2),
('Rayuela', '1963-01-01', 18.75, 3),
('Ficciones', '1944-01-01', 15.25, 4),
('Veinte poemas de amor y una canción desesperada', '1924-01-01', 12.99, 5),
('La casa de los espíritus', '1982-01-01', 21.50, 6),
('Aura', '1962-01-01', 17.95, 7),
('El laberinto de la soledad', '1950-01-01', 14.75, 8),
('Don Quijote de la Mancha', '1605-01-01', 10.99, 9),
('Bodas de sangre', '1933-01-01', 13.50, 10),
('Dona Flor y sus dos maridos', '1966-01-01', 19.75, 11),
('La hora de la estrella', '1977-01-01', 16.95, 12),
('Ensayo sobre la ceguera', '1995-01-01', 23.95, 13),
('El libro del desasosiego', '1982-01-01', 20.25, 14),
('Rimas y leyendas', '1871-01-01', 11.99, 15),
('Soledades, galerías y otros poemas', '1907-01-01', 9.75, 16),
('Azul...', '1888-01-01', 12.50, 17),
('Cuentos de la selva', '1918-01-01', 10.95, 18),
('Pedro Páramo', '1955-01-01', 16.25, 19),
('La playa', '1954-01-01', 15.75, 20),
('Los gemidos', '1922-01-01', 11.25, 21),
('Versos sencillos', '1891-01-01', 8.99, 22),
('Los heraldos negros', '1918-01-01', 10.75, 23),
('Los de abajo', '1915-01-01', 9.95, 24),
('Balún Canán', '1957-01-01', 17.50, 25),
('Mañana en la batalla piensa en mí', '1994-01-01', 22.25, 26),
('El beso de la mujer araña', '1976-01-01', 19.99, 27),
('La colmena', '1951-01-01', 18.25, 28),
('El astillero', '1961-01-01', 19.50, 29),
('Adán Buenosayres', '1948-01-01', 16.75, 30);

SELECT * FROM authors;
SELECT * FROM books;
DROP TABLE authors;
DROP TABLE books;