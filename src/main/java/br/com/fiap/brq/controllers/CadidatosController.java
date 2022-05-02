package br.com.fiap.brq.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.PagedModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.brq.entities.Candidatos;
import br.com.fiap.brq.services.CandidatosService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value="CadidatosEndpoint", tags={"CadidatosController"})
@RestController
@RequestMapping(value="/api/v1/candidatos")
public class CadidatosController {
	
	/* PROPERTIES */
	
	@Autowired
	private CandidatosService service;
	
	@Autowired
	private PagedResourcesAssembler<Candidatos> assembler;
	
	/* ACTIONS */
	
	@ResponseBody
	@ApiOperation(value="Retornar todos candidatos")
	@GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity<?> findAll(
			@RequestParam(required=false) Map<String, String> filters,
			@RequestParam(value="page", defaultValue="0") int page,
			@RequestParam(value="limit", defaultValue="10") int limit,
			@RequestParam(value="direction", defaultValue="desc") String direction) {
		var sortDirection = "desc".equalsIgnoreCase(direction) ? Direction.DESC : Direction.ASC;
		Pageable pageable = PageRequest.of(page, limit, Sort.by(sortDirection, "nome"));
		
		Page<Candidatos> candidatos = service.findAll(filters, pageable);

		PagedModel<?> resources = assembler.toModel(candidatos);
		return new ResponseEntity<>(resources, HttpStatus.OK);
	}
	
	@ResponseBody
	@ApiOperation(value="Buscar candidato pelo id")
	@GetMapping(value="/{id}", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public Candidatos findById(@PathVariable Long id) {
		Candidatos result = service.findById(id).get();
		return result;
	}
	
	@ResponseBody
	@ApiOperation(value="Criar um candidato")
	@PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
			consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity<?> create(@RequestBody Candidatos candidatos) {
		Candidatos result = service.create(candidatos);
		return ResponseEntity.ok(result);
	}
	
	@ResponseBody
	@ApiOperation(value="Atualizar um candidato")
	@PutMapping(produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
			consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity<?> update(@RequestBody Candidatos candidatos) {
		Candidatos result = service.update(candidatos);
		return ResponseEntity.ok(result);
	}
	
	@ApiOperation(value="Remover um candidato")
	@DeleteMapping(value="/{id}")
	public ResponseEntity<?> delete(@PathVariable("id") Long id) {
		service.delete(id);
		return ResponseEntity.ok().build();
	}
}
