-- Geração de Modelo físico
-- Sql ANSI 2003 - brModelo.



CREATE TABLE Doacao (
doacao_id VARCHAR(40) PRIMARY KEY,
data_doacao DATETIME,
aparelho VARCHAR(40),
marca VARCHAR(40),
descricao VARCHAR(40),
CPF INTEGER,
CNPJ INTEGER
)

CREATE TABLE Doador (
CPF INTEGER PRIMARY KEY,
Endereco VARCHAR(40),
Nome VARCHAR(40)
)

CREATE TABLE Instituicao (
Nome VARCHAR(40),
Endereco VARCHAR(40),
Cep INTEGER,
Oficio VARCHAR(40),
CNPJ INTEGER PRIMARY KEY
)

ALTER TABLE Doacao ADD FOREIGN KEY(CPF) REFERENCES Doador (CPF)
ALTER TABLE Doacao ADD FOREIGN KEY(CNPJ) REFERENCES Instituicao (CNPJ)
