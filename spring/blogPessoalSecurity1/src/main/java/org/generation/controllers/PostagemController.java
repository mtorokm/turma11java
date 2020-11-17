package org.generation.controllers;

import java.util.List;

import org.generation.models.Postagem;
import org.generation.repositories.PostagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/postagens")
@CrossOrigin("*")
public class PostagemController {
	
	
	@Autowired //injetou o servico PostagemRepository
	private PostagemRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Postagem>> GetAll()
	{
		return ResponseEntity.ok(repository.findAll());
	
	}
	@GetMapping("/{id}")
	public ResponseEntity<Postagem> GetById(@PathVariable long id){
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/titulo/{titulo}") //nome do metodo          //tipo  nome variavel
	public ResponseEntity<List<Postagem>> GetByTitulo(@PathVariable String titulo){
			return ResponseEntity.ok(repository.findAllByTituloContainingIgnoreCase(titulo));
	}	
	
	@GetMapping(value = "/maior")
	public ResponseEntity<List<Postagem>> findAllMaior(){
		return ResponseEntity.ok(repository.findAllMaior());
	}
    @GetMapping(value = "/ordem")
   	public ResponseEntity<List<Postagem>> anosDesc(){
   		return ResponseEntity.ok(repository.anosDesc());
   	}
    @GetMapping(value = "/intervalo")
   	public ResponseEntity<List<Postagem>> anosIntervalos(){
   		return ResponseEntity.ok(repository.anosIntervalos());
   	}
    @GetMapping(value = "/asc")
   	public ResponseEntity<List<Postagem>> anosAsc(){
   		return ResponseEntity.ok(repository.anosAsc());
   	}

	
	
	
	 @PostMapping						//qnd o obje for grande ou ele for seguro, vc tem q passa-lo pelo corpo da requisição. A gente não precisa necessáriamente mostrar esse dado pro cliente
	 public ResponseEntity<Postagem> post (@RequestBody Postagem postagem){
		 return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(postagem));
	 }
	 @PutMapping				//qnd o obje for grande ou ele for seguro, vc tem q passa-lo pelo corpo da requisição. A gente não precisa necessáriamente mostrar esse dado pro cliente
	 public ResponseEntity<Postagem> put (@RequestBody Postagem postagem){
		 return ResponseEntity.status(HttpStatus.OK).body(repository.save(postagem));
	 }
	
	 @DeleteMapping("/{id}")
	 public void delete(@PathVariable long id) {
		 repository.deleteById(id);
 
	 }
	 
	 
}
