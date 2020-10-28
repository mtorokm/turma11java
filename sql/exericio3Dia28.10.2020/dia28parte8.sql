select*from tb_categoria
inner Join tb_produto
on tb_categoria.id_categoria = tb_produto.id_categoria where tb_categoria.area_curso = "Exatas";