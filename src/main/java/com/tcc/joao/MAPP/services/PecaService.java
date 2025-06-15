package com.tcc.joao.MAPP.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcc.joao.MAPP.models.Peca;
import com.tcc.joao.MAPP.repositories.PecaRepository;

@Service
public class PecaService {

	@Autowired
	private PecaRepository repo;

	public List<Peca> findAll() {
		return repo.findAll();
	}

	public Optional<Peca> findById(Long id) {
		return repo.findById(id);
	}

	public Peca insert(Peca obj) {
		return repo.save(obj);
	}

	public void delete(Long id) {
		repo.deleteById(id);
	}

}
