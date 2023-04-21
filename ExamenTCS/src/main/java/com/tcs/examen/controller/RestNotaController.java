package com.tcs.examen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.examen.model.Nota;
import com.tcs.examen.service.NotaServiceImpl;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/Notas")
public class RestNotaController {

	@Autowired
	private NotaServiceImpl service;
	
	@GetMapping
	public List<Nota> listaNotas(){
	return service.listarNotas();
	}
	
	@PostMapping
	public String guardar(@Valid Nota nota,BindingResult result) {
		if(result.hasErrors()) {
			return result.getAllErrors().toString();
		}
		service.guardarNota(nota);
		return "Nota registrada";
	}
	
}
