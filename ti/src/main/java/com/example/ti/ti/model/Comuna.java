package com.example.ti.ti.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Comuna {

    @NotNull (message = "El ID de la Comuna no puede estar vacio")
    private int id;
    
    @NotBlank (message = "El Nombre de la Comuna no puede estar en blanco")
    private String nombre;

}
