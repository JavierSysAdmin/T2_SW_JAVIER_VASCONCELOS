CREATE DATABASE BD_CIBERTEC;
USE BD_CIBERTEC;

CREATE TABLE Personaje
(
 IdPersonaje 		INT NOT NULL AUTO_INCREMENT,
 NomPersonaje		VARCHAR(50) NOT NULL,
 ApePersonaje 		VARCHAR(50) NOT NULL,
 FechNacPersonaje	DATE NOT NULL,
 PRIMARY KEY (IdPersonaje)
);

INSERT INTO Personaje (NomPersonaje, ApePersonaje, FechNacPersonaje) VALUES 
('John', 'Doe', '1980-01-01'),
('Jane', 'Doe', '1985-02-02'),
('Luke', 'Skywalker', '1977-03-03'),
('Leia', 'Organa', '1978-04-04'),
('Han', 'Solo', '1979-05-05');

select * from Personaje;

CREATE TABLE ProgramaTv
(
 IdProgramaTv 		INT NOT NULL AUTO_INCREMENT,
 Titulo 			VARCHAR(250) NOT NULL,
 Resumen 			VARCHAR(250) NOT NULL,
 FechaInicio	DATE NOT NULL,
 IdPersonaje 			INT NOT NULL,
 PRIMARY KEY (IdProgramaTv),
 FOREIGN KEY (IdPersonaje) REFERENCES Personaje(IdPersonaje)
 );
 
 INSERT INTO Personaje (NomPersonaje, ApePersonaje, FechNacPersonaje) VALUES 
('John', 'Doe', '1980-01-01'),
('Jane', 'Doe', '1985-02-02'),
('Luke', 'Skywalker', '1977-03-03'),
('Leia', 'Organa', '1978-04-04'),
('Han', 'Solo', '1979-05-05');