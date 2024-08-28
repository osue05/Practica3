CREATE DATABASE Panaderia;

USE Panaderia;

CREATE TABLE Funcionario (
    idFuncionario INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50),
    usuario VARCHAR(50) UNIQUE,
    contraseña VARCHAR(50)
);

CREATE TABLE Producto (
    idProducto INT AUTO_INCREMENT PRIMARY KEY,
    nombreProducto VARCHAR(50),
    precio DECIMAL(10,2)
);

CREATE TABLE Compra (
    idCompra INT AUTO_INCREMENT PRIMARY KEY,
    idFuncionario INT,
    fecha DATETIME,
    total DECIMAL(10,2),
    FOREIGN KEY (idFuncionario) REFERENCES Funcionario(idFuncionario)
);

CREATE TABLE DetalleCompra (
    idDetalle INT AUTO_INCREMENT PRIMARY KEY,
    idCompra INT,
    idProducto INT,
    cantidad INT,
    subtotal DECIMAL(10,2),
    FOREIGN KEY (idCompra) REFERENCES Compra(idCompra),
    FOREIGN KEY (idProducto) REFERENCES Producto(idProducto)
);
