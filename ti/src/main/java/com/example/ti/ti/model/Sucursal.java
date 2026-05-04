package com.example.ti.ti.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Sucursal {
    
    @NotNull (message = "El ID de la Sucursal no puede estar vacio")
    private int id;
    
    @NotBlank (message = "La Calle no puede estar en blanco")
    private String calle;

    @NotBlank (message = "El Numero de la direccion no puede estar en blanco")
    private String numero;


}
