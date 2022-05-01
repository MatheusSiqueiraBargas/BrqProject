package com.brq.brqProject.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brq.brqProject.entities.Candidatos;
import com.brq.brqProject.repositories.CandidatosRepository;

@RestController
@RequestMapping(value = "/candidatos")
public class CadidatosController {
	
	@Autowired
	private CandidatosRepository repository;
	
	@GetMapping
	public List<Candidatos> findAll(){
		List<Candidatos> result = repository.findAll();
		return result;
	}
	
	@GetMapping(value = "/{id}")
	public Candidatos findById(@PathVariable Long id){
		Candidatos result = repository.findById(id).get();
		return result;
	}
	
	@PostMapping
	public Candidatos insert(@RequestBody Candidatos candidatos){
		Candidatos result = repository.save(candidatos);
		return result;
	}
}
