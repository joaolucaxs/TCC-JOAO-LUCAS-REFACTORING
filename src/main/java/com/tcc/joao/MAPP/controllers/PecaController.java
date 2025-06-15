package com.tcc.joao.MAPP.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcc.joao.MAPP.models.Peca;
import com.tcc.joao.MAPP.services.PecaService;

@RestController
@RequestMapping(value = "/pecas")
public class PecaController {
	
	@Autowired
	private PecaService pecaService;

	@GetMapping()
	public List<Peca> findAll() {
		return pecaService.findAll();
	}

	@GetMapping("/{id}")
	public ResponseEntity<Peca> buscarPeca(@PathVariable Long id) {
		return pecaService.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
	}

	@PostMapping()
	public Peca criarPeca(@RequestBody Peca peca) {
		return pecaService.insert(peca);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deletarPeca(@PathVariable Long id) {
		pecaService.delete(id);
		return ResponseEntity.noContent().build();
	}
}
