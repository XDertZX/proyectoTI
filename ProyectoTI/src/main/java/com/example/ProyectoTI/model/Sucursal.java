package com.example.ProyectoTI.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table (name = "sucursal")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Sucursal {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_sucursal;
    
    @Column(nullable = false, length = 100)
    @NotBlank(message = "La calle es obligatoria")
    private String calle;

    @Column(nullable = false, length = 10)
    @NotBlank(message = "El número de calle es obligatorio")
    private String numero_calle;


}
