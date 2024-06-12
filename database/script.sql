CREATE DATABASE "AcquaTrip";

-- Cria a tabela funcionario
CREATE TABLE IF NOT EXISTS funcionario(
    id SERIAL PRIMARY KEY,
    nome VARCHAR NOT NULL,
    cpf VARCHAR,
    email VARCHAR NOT NULL,
    nivel_acesso VARCHAR,
    senha VARCHAR NOT NULL,
    telefone VARCHAR,
    endereco VARCHAR,
    data_nascimento VARCHAR
);

