package com.tcs.examen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.examen.model.Nota;
import com.tcs.examen.repository.INotaRepository;

@Service
public class NotaServiceImpl implements INotaService{

	@Autowired
	private INotaRepository repo;
	
	
	@Override
	public List<Nota> listarNotas() {
		return repo.findAll();
	}

	@Override
	public void guardarNota(Nota nota) {
		repo.save(nota);
	}


	
}
