package org.generation.repositories;

import java.util.List;

import org.generation.models.CategoriaModel;
import org.springframework.data.jpa.repository.JpaRepository;
	   //funções				             //interface cheio de funções prontinhas(ex a função save, a findAll)
public interface CategoriaRepository extends JpaRepository<CategoriaModel, Long >{

	List <CategoriaModel> findByDescricao(String descricao);
	
	
	
	
	
	
}
