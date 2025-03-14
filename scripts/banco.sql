CREATE DATABASE produtos_maquiagem;
USE produtos_maquiagem;

-- Tabela para armazenar os produtos de maquiagem
CREATE TABLE produtos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    categoria VARCHAR(50) NOT NULL,
    preco DECIMAL(10,2) NOT NULL
);

SELECT * FROM produtos;