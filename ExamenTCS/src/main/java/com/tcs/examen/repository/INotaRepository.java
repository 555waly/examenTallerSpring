package com.tcs.examen.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.examen.model.Nota;

public interface INotaRepository extends JpaRepository<Nota, Integer>{

}
