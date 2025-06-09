CREATE DATABASE if not exists estoque CHARACTER SET utf8mb4;

USE estoque;

CREATE TABLE categorias (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(50) NOT NULL,
    tamanho VARCHAR(50) NOT NULL,
    embalagem VARCHAR(50) NOT NULL
);

CREATE TABLE produtos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    unidade VARCHAR (50) NOT NULL,
    valor_unitario DOUBLE NOT NULL,
    qtd_min INT NOT NULL,
    qtd_max INT NOT NULL,
    qtd_atual INT NOT NULL,
    id_categoria INT NOT NULL,
    FOREIGN KEY (id_categoria) REFERENCES categorias(id)
);
