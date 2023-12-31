package com.cibertec.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.api.model.Prestamista;
import com.cibertec.api.model.Prestatario;

@Repository
public interface PrestatarioRepository extends JpaRepository<Prestatario, Integer> {
	List<Prestatario> findByPrestamistaPrestatarioAndActivo(Prestamista Prestamista, boolean activo);

	Prestatario findByPrestatarioDni(String dni);

	Prestatario findByPrestatarioRuc(String ruc);

	Prestatario findByPrestatarioDniOrPrestatarioRuc(String dni, String ruc);

}
