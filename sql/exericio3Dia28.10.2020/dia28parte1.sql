create database db_cursoDaMinhaVida;
use db_cursoDaMinhaVida;

create table tb_categoria(
id_categoria int primary key not null,
area_curso varchar(90),  #EXATAS, HUMANAS OU BIOLÓGICAS
pago_gratuito enum ("pago","gratuito"),
tipo_curso varchar(30) #normal ou Pós-Graduação
);

create table tb_produto(
id_produto int primary key auto_increment not null,
nome_curso varchar(90),
preco_curso int,
carga_horaria varchar(30),
quantidade_alunos int,
quantidade_modulos int,
id_categoria int,
constraint fk_produto foreign key (id_categoria)  REFERENCES tb_categoria(id_categoria)
);
