package com.example.ti.ti.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class TipoEmpleado {

    @NotNull (message = "El ID del tipo de Empleado no puede estar vacio")
    private int id;

    @NotBlank (message = "El Puesto del Empleado no puede estar en blanco")
    private String puesto;

    @NotBlank (message = "El Tipo de Empleado no puede estar en blanco")
    private String tipo;
    
    @Min(value = 500000, message = "El minimo de salario debe de ser igual o mayor a clp $500.000")
    private Double salario;

}
