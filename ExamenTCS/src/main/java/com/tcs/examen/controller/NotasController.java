package com.tcs.examen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tcs.examen.model.Nota;
import com.tcs.examen.repository.INotaRepository;

@Controller
public class NotasController {

	@Autowired
	private INotaRepository repo;
	
	@GetMapping("/nuevaNota")
	public String nuevaNota(@RequestParam(name = "id", required = true) String id,@RequestParam(name = "curso", required = true) String curso,@RequestParam(name = "nota", required = true) Double nota, Model model) {
		Nota n= new Nota();
		n.setId(Integer.parseInt(id));
		n.setCurso(curso);
		n.setNota(nota);
		repo.save(n);
				
		return "Notas";

	}
	
	@GetMapping("/listarNotas")
	public String listarNotas(Model model) {
			
		List<Nota> lst = repo.findAll();
		model.addAttribute("lstNotas", lst);
		
		return "Notas";

	}
}
