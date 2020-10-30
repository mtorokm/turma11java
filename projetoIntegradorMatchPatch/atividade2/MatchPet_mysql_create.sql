CREATE TABLE `tb_temas` (
	`id` bigint NOT NULL AUTO_INCREMENT,
	`nomeTemas` varchar(50) NOT NULL,
	`tipoAnimal` varchar(50) NOT NULL,
	`tamanhoAnimal` enum NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `tb_usuarios` (
	`id` bigint NOT NULL AUTO_INCREMENT,
	`nomeCompleto` varchar(50) NOT NULL,
	`email` varchar(50) NOT NULL,
	`senha` varchar(25) NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `tb_postagens` (
	`id` bigint NOT NULL AUTO_INCREMENT,
	`media` longblob NOT NULL,
	`descricao` TEXT NOT NULL,
	`data` DATE NOT NULL,
	`localizacao` varchar(255) NOT NULL,
	`fk_tema` bigint NOT NULL,
	`fk_usuario` bigint NOT NULL,
	PRIMARY KEY (`id`)
);

ALTER TABLE `tb_postagens` ADD CONSTRAINT `tb_postagens_fk0` FOREIGN KEY (`fk_tema`) REFERENCES `tb_temas`(`id`);

ALTER TABLE `tb_postagens` ADD CONSTRAINT `tb_postagens_fk1` FOREIGN KEY (`fk_usuario`) REFERENCES `tb_usuarios`(`id`);

