package com.example.ti.ti.model;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


public class Region {

    @NotNull (message = "El id de la region no puede estar vacio")
    private int id;
    
    @NotBlank (message = "El Nombre de la Region no puede estar en blanco")
    private String nombre;
    
}
