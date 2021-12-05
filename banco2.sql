# Criando a base de dados

CREATE DATABASE filafacil;

# Verificando bases cadastradas
SHOW databases;

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

drop table tb_atendente;

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

drop table tb_administrador;

# Mostrar campos da tabela Administrador
SELECT * FROM  tb_administrador;

INSERT INTO tb_administrador(nome,senha,idade,endereco,cpf) VALUES ("admin","admin","12","rua","4564545");


# Criando tabela de Paciente

CREATE TABLE tb_paciente(
	id int PRIMARY KEY NOT NULL auto_increment,
    nome varchar(255) NOT NULL,
    idade varchar(2) NOT NULL,
    endereco varchar(255) NOT NULL,
    funSaude boolean NOT NULL, 
    dataVac varchar(255)

);

drop table tb_paciente;

# Mostrar campos da tabela Administrador
SELECT * FROM tb_paciente;

SELECT * FROM tb_administrador;

INSERT INTO tb_paciente (nome , idade , endereco , funSaude , dataVac) VALUES ("Namorado5", "25" , "enderecoPaciente" , 1 , null);


SELECT nome FROM tb_paciente WHERE dataVac IS NULL  ORDER BY idade desc, funSaude = 1 LIMIT 1;


UPDATE tb_paciente SET dataVac="05122021" WHERE id = 1;

INSERT INTO tb_atendente(nome , idade , endereco , cpf) VALUES ("nomeAtendente" , idadeAtendente , "enderecoAtendente" , cpfAtendente);
INSERT INTO tb_administrador(nome , idade , endereco , cpf) VALUES ("nomeAdministrador" , idadeAdministrador , "enderecoAdministrador" , cpfAdministrador);
INSERT INTO tb_paciente (nome , idade , endereco , funSaude , dataVac) VALUES ("nomePaciente", idadePaciente , "enderecoPaciente" , 1 , "dataVacina");


