package com.example.ti.ti.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Categoria {

    @NotNull (message = "El ID de la Categoria no puede estar vacio")
    private int id;
    
    @NotBlank (message = "El Nombre de la Categoria no puede estar en blanco")
    private String nombre;

    @NotNull ()
   
}
