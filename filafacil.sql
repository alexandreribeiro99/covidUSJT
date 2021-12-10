# Criando a base de dados
CREATE DATABASE filafacil;

# Selecionar o banco de dados
use filafacil;

# Criando tabela de Atendentes
CREATE TABLE tb_atendente (

	id int PRIMARY KEY NOT NULL auto_increment,
    nome varchar(255) NOT NULL,
	senha varchar(20) NOT NULL,
    idade varchar(2) NOT NULL,
    endereco varchar(255) NOT NULL,
    cpf varchar(11)
);

# Mostrar campos da tabela Atendentes
SELECT * FROM  tb_atendente;

# Criando tabela de Administrador
CREATE TABLE tb_administrador(

	id int PRIMARY KEY NOT NULL auto_increment,
    nome varchar(255) NOT NULL,
	senha varchar(20) NOT NULL,
    idade varchar(2) NOT NULL,
    endereco varchar(255) NOT NULL,
    cpf varchar(11)
);

# Mostrar campos da tabela Administrador
SELECT * FROM  tb_administrador;

# Criando tabela de Paciente
CREATE TABLE tb_paciente(
	id int PRIMARY KEY NOT NULL auto_increment,
    nome varchar(255) NOT NULL,
    idade varchar(2) NOT NULL,
    endereco varchar(255) NOT NULL,
    funSaude boolean NOT NULL, 
    dataVac varchar(255)

);

SELECT * FROM tb_paciente;
SELECT nome FROM tb_paciente WHERE dataVac IS NULL  ORDER BY idade desc, funSaude = 1 LIMIT 1;

SELECT * FROM tb_administrador;
INSERT INTO tb_paciente (nome , idade , endereco , funSaude , dataVac) VALUES ("Idoso02", "95" , "enderecoPaciente" , 0 , null);

UPDATE tb_paciente SET dataVac = "2021-12-09" where id = 17;

SELECT * FROM tb_paciente WHERE idade > "90";
SELECT * FROM tb_paciente WHERE idade >= 70 AND idade < 90;
SELECT * FROM tb_paciente WHERE idade >= 50 AND idade < 70;
SELECT * FROM tb_paciente WHERE idade < 50;
SELECT * FROM tb_paciente WHERE idade >= 20 AND idade < 50 AND dataVac >= "2021-12-07" AND dataVac <= "2021-12-09";