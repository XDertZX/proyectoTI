package com.example.ti.ti.model;



import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor 

public class Cliente {

    @NotNull (message = "El id no puede estar vacio")
    private int id;

    @NotBlank (message = "El Nombre del Cliente no puede estar en blanco")
    private String nombre;

    @NotBlank (message = "El Rut del Cliente no puede estar en blanco")
    private String rut;

    @NotBlank (message = "El Telefono del Cliente no puede estar vacio")
    private String telefono;
    
    @NotBlank (message = "El Mail del Cliente no puede estar vacio")
    private String email;


}
