package org.generation.blogPessoalEx.controller;

import java.util.List;

import org.generation.blogPessoalEx.model.Postagens;
import org.generation.blogPessoalEx.repository.PostagensRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/postagens")
@CrossOrigin("*")
public class PostagensController {
	
	
	@Autowired //faz que o spring instancie a interface
	private PostagensRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Postagens>> GetAll(){
	
	return ResponseEntity.ok(repository.findAll());
		}
	
	@GetMapping("/{id}")
	public ResponseEntity<Postagens> GetById(@PathVariable long id){
	return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	
	
	
	}
}

