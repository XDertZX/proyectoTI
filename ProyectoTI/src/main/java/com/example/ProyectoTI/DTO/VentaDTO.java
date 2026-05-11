package com.example.ProyectoTI.DTO;

import lombok.Data;

@Data

public class VentaDTO {

    private Integer DTO_id_venta;
    private Integer DTO_id_cliente;
    private Integer DTO_id_empleado;
    private Date DTO_fechaVenta;
    private Integer DTO_id_producto;
    private Integer DTO_cantidadProducto;
    private Double DTO_precioProducto;
    private Double DTO_precioFinal;

}
