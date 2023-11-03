package com.cibertec.api.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "tb_banco")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Banco {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private int idBanco;
    private String nombre;

    @OneToMany(mappedBy = "idBancoCuenta")
    @ToString.Exclude
    private List<Cuenta> cuentaList;
}
