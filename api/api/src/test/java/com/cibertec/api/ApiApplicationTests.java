package com.cibertec.api;

import java.sql.Date;
import java.util.Objects;

import javax.swing.JOptionPane;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cibertec.api.model.Prestamista;
import com.cibertec.api.service.PrestamistaService;
import com.cibertec.api.serviceImpl.PrestamistaServiceImpl;

@SpringBootTest
class ApiApplicationTests extends PrestamistaServiceImpl {
	
	@Autowired
	PrestamistaService prestamistaService;

	@Test
	void contextLoads() {
		agregar();
	}
	
	
	private void agregar () {
		
		Prestamista model = new Prestamista();
		model.getPrestamista().setNombres("Luis");
		model.getPrestamista().setApellidos("Ruiz");
		model.getPrestamista().setEmail("test@gmail");
		model.getPrestamista().setFechaRegistro(new Date(new java.util.Date().getTime()));
		model.getPrestamista().setFechaEdicion(new Date(new java.util.Date().getTime()));
		model.setFechaRegistro(new Date(new java.util.Date().getTime()));
		model.setFechaEdicion(new Date(new java.util.Date().getTime()));
		model.setActivo(true);
		
		model = this.guardar(model);
		
		if(Objects.isNull(model)) {
			JOptionPane.showMessageDialog(null, "ERROR !!!");
		}else {
			JOptionPane.showMessageDialog(null, "REGISTRADO OK");	
		}
		
		
	}
}
