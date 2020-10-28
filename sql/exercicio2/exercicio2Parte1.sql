CREATE DATABASE db_RH2;

USE db_RH2;

CREATE TABLE tb_Cargo(
id_cargo int primary key not null,
cargo varchar(30),
setor varchar(30)
); 

CREATE TABLE tb_Funcionario(
id_funcionario int primary key not null ,
nome_funcionario varchar(30) not null,
idade_funcionario int, 
sexo enum('M','F','O'),
salario int,
id_cargo int,
 CONSTRAINT fk_funCarg FOREIGN KEY (id_cargo) REFERENCES tb_cargo(id_cargo)
);

