package com.example.ProyectoTI.model;

import jakarta.annotation.Generated;
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

import java.sql.Date;

@Entity
@Table (name = "empleado")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_empleado;

    @ManyToOne
    @JoinTable(name = "id_tipoEmpleado")
    private TipoEmpleado tipoEmpleado;

    @ManyToOne
    @JoinTable(name = "id_sucursal")
    private Sucursal sucursal;

    @Column(nullable = false)
    @NotBlank(message = "El empleado debe contar con un nombre")
    private String nombre_empleado;

    @Column(nullable = false)
    @NotBlank(message = "El empleado debe contar con un puesto.")
    private String puesto_empleado;

    @Column(unique=true, length = 13, nullable = false)
    @NotBlank(message = "El empleado debe contener un rut.")
    private String rut_empleado;

    @Column(nullable = false)
    @NotBlank(message = "El empleado debe contar con una fecha de ignreso.")
    private Date fecha_ingreso;

}
