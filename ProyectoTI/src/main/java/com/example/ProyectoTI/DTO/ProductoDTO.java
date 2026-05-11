package com.example.ProyectoTI.DTO;

import lombok.Data;

@Data

public class ProductoDTO {
    private Integer DTO_id_producto;
    private String DTO_nombreProducto;
    private String DTO_descripcionProducto;
    private Double DTO_precioProducto;
    private Integer DTO_id_categoria;
    private Integer DTO_id_marca;

}
