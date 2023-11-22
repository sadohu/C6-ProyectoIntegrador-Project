package com.cibertec.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="tb_tipo_comprobante")
@Data
public class TipoComprobante {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTipoComprobante;
	private String descripcion;
	
}
