# Criando a base de dados

CREATE DATABASE filafacil;

# Verificando bases cadastradas
SHOW DATABAES;

# Selecionar o banco de dados
use filafacil;

# Criando tabela de Atendentes

CREATE TABLE tb_atendente (

    nome varchar(255) NOT NULL,
    idade int NOT NULL,
    endereco varchar(255) NOT NULL,
    cpf int
);


# Mostrar campos da tabela Atendentes
SELECT * FROM  tb_atendente;



# Criando tabela de Administrador

CREATE TABLE tb_administrador(

	id int PRIMARY KEY NOT NULL auto_increment,
    nome varchar(255) NOT NULL,
	senha varchar(20) NOT NULL,
    idade int NOT NULL,
    endereco varchar(255) NOT NULL,
    cpf varchar(11)
);

# Mostrar campos da tabela Administrador
SELECT * FROM  tb_administrador;


# Criando tabela de Paciente

CREATE TABLE tb_paciente(

    nome varchar(255) NOT NULL,
    idade int NOT NULL,
    endereco varchar(255) NOT NULL,
    funSaude boolean NOT NULL, 
    dataVac varchar(255) NOT NULL

);

# Mostrar campos da tabela Administrador
SELECT * FROM tb_paciente;

INSERT INTO tb_atendente(nome , idade , endereco , cpf) VALUES ("nomeAtendente" , idadeAtendente , "enderecoAtendente" , cpfAtendente);
INSERT INTO tb_administrador(nome , idade , endereco , cpf) VALUES ("nomeAdministrador" , idadeAdministrador , "enderecoAdministrador" , cpfAdministrador);
INSERT INTO tb_paciente (nome , idade , endereco , funSaude , dataVac) VALUES ("nomePaciente", idadePaciente , "enderecoPaciente" , 1 , "dataVacina");



