package com.example.ProyectoTI.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table (name = "tipoEmpleado")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class TipoEmpleado {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id_tipoEmpleado;

    @Column(nullable = false)
    private String puesto;

    @Column(nullable = false)
    private String tipo_empleado;
    
    @Column(nullable = false)
    @Min(value = 500000, message = "El minimo de salario debe de ser igual o mayor a clp $500.000")
    private Double salario;

}
