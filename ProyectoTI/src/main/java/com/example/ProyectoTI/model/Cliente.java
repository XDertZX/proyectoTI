package com.example.ProyectoTI.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table (name = "cliente")
@Data
@AllArgsConstructor
@NoArgsConstructor 

public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_cliente;

    @Column(nullable = false)
    private String nombre_cliente;

    @Column(unique=true, length = 13, nullable = false)
    private String rut_cliente;

    @Column(length = 12, nullable = true)
    private String telefono_cliente;
    
    @Column(nullable = false)
    private String email_cliente;

}
