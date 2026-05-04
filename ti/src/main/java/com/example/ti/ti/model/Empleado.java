package com.example.ti.ti.model;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Empleado {

    @NotNull (message = "El ID del Empleado no puede estar vacio")
    private int id;

    @NotBlank (message = "El Nombre del Empleado no puede estar en blanco")
    private String puesto;

    @NotBlank (message = "El Rut no puede estar en blanco")
    private String rut;

    private LocalDate fechaingreso;



}
