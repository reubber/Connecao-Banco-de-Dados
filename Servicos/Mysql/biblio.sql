CREATE DATEBASE biblio;

CREATE TABLE biblio.livro(
id BIGINT primary key AUTO_INCREMENT,
nome varchar(255) NOT NULL,
autor varchar(255) NOT NULL,
sinopse varchar(255)
);

