package org.generation.blogPessoalEx.repository;

import java.util.List;

import org.generation.blogPessoalEx.model.Postagens;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostagensRepository extends JpaRepository<Postagens, Long> {
	public List<Postagens> findAllByTituloContainingIgnoreCase (String titulo);
}
