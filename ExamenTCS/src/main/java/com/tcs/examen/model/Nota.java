package com.tcs.examen.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

@Entity
public class Nota {
	
	@Id
	@NotNull(message="El campo Id no puede ser nulo")
	private int Id;
	@NotNull(message="El campo curso no puede ser nulo")
	private String curso;
	@NotNull(message="El campo nota no puede ser nulo")
	private double nota;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	
	
	
}
