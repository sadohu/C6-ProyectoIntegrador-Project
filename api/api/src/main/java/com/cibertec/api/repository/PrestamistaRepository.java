package com.cibertec.api.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.api.model.Prestamista;

@Repository
public interface PrestamistaRepository extends JpaRepository<Prestamista,Integer> {
	Prestamista findByIdPrestamistaAndActivo (int idPresmita, boolean activo);
	Prestamista findByPrestamistaDni(String dni);
	

} //fin de PrestamistaRepository
