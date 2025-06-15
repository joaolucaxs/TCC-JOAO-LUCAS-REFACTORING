package com.tcc.joao.MAPP.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcc.joao.MAPP.models.Peca;

@Repository
public interface PecaRepository extends JpaRepository<Peca, Long> {

	
}
