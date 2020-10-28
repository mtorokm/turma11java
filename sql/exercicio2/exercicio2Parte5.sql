select*from tb_Cargo
inner join tb_Funcionario
where tb_Cargo.id_cargo = tb_Funcionario.id_cargo and tb_Funcionario.salario>2000.00;