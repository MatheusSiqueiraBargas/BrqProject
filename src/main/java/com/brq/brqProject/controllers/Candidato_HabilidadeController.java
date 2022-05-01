package com.brq.brqProject.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brq.brqProject.entities.Candidato_Habilidade;
import com.brq.brqProject.repositories.Candidato_HabilidadeRepository;

@RestController
@RequestMapping(value = "/candidato_habilidade")
public class Candidato_HabilidadeController {

	@Autowired
	private Candidato_HabilidadeRepository repository;
	
	@GetMapping
	public List<Candidato_Habilidade> findAll(){
		List<Candidato_Habilidade> result = repository.findAll();
		return result;
	}
	
	
}
