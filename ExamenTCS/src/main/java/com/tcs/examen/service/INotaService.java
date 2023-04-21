package com.tcs.examen.service;

import java.util.List;

import com.tcs.examen.model.Nota;

public interface INotaService {

	public List<Nota> listarNotas();
	
	public void guardarNota(Nota nota);
}
