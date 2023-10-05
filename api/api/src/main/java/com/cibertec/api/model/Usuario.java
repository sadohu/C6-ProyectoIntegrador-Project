package com.cibertec.api.model;

import java.sql.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;


@Entity
@Table(name="tb_usuario")
@Data
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idUsuario;
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "idpersona")
	private Persona persona;
	@Column(name ="nombreusuario")
	private String nombreUsuario;
	@Column(name ="claveusuario")
	private String claveUsuario;
	@ManyToOne
	@JoinColumn(name = "idrol")
	private Rol rol;
	@Column(name ="fecharegistro")
	@Temporal(TemporalType.DATE)
	private Date fechaRegistro;
	
	@Column(name ="fechaedicion")
	@Temporal(TemporalType.DATE)
	private Date fechaEdicion;
	private boolean activo;
	

}