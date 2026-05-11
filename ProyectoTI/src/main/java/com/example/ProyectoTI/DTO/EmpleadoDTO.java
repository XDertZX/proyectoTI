package com.example.ProyectoTI.DTO;
import java.sql.Date;
import lombok.Data;
@Data

public class EmpleadoDTO {
    private Integer DTO_id_empleado;
    private Integer DTO_id_puestoEmpleado;
    private Integer DTO_id_sucursal;
    private String DTO_puestoEmpleado;
    private String DTO_nombreEmpleado;
    private String DTO_rutEmpleado;
    private Date DTO_fechaIngreso;
}
