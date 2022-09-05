create database flyusagencia;

CREATE TABLE Site (
Nome VARCHAR(20)
);

CREATE TABLE Agência (
Atributo1 VARCHAR(10),
Endereço VARCHAR(20),
ID_Loja VARCHAR(10) PRIMARY KEY
);

CREATE TABLE Cliente (
ID_Cliente VARCHAR(15) PRIMARY KEY,
Telefone NUMERIC(15),
Nome VARCHAR(50),
Senha VARCHAR(10),
Endereço VARCHAR(80),
Email VARCHAR(50)
);

CREATE TABLE Itens (
ID_Pacote VARCHAR(15) PRIMARY KEY,
NomePacote VARCHAR(30),
DataCompra DATETIME,
Quantidade NUMERIC(4)
);

CREATE TABLE Pacote (
ID_Destinos VARCHAR(10)
);

CREATE TABLE DestinosMaisPromoções (
ID_Destinos VARCHAR(10) PRIMARY KEY,
ID_Lista_1 VARCHAR(10),
ID_Lista_2 VARCHAR(10)
);

CREATE TABLE Lista_2 (
Destinos VARCHAR(60),
Voos VARCHAR(50),
Data_Ida DATETIME,
Data_Volta DATETIME,
ID_Lista_2 VARCHAR(15) PRIMARY KEY
);

CREATE TABLE Lista_1 (
Destinos VARCHAR(60),
Data_Ida DATETIME,
Data_Volta DATETIME,
Voos VARCHAR(50),
ID_Lista_1 VARCHAR(15) PRIMARY KEY
);

CREATE TABLE Hospeda (
ID_Cliente VARCHAR(10),
FOREIGN KEY(ID_Cliente) REFERENCES Cliente (ID_Cliente)
);

CREATE TABLE Compra (
ID_Cliente VARCHAR(10),
FOREIGN KEY(ID_Cliente) REFERENCES Cliente (ID_Cliente)
);

CREATE TABLE Contém (
ID_Pacote VARCHAR(10),
FOREIGN KEY(ID_Pacote) REFERENCES Itens (ID_Pacote)
);
