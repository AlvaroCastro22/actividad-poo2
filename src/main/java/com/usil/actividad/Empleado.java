
package com.usil.actividad;
import lombok.Data;

@Data
public class Empleado {
    private int id;
    private String nombre;
    private String cargo;
    private float SalarioBase;
    private int horasExtra;
}
