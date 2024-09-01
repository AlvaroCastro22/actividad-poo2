/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usil.actividad;
import java.util.ArrayList;
/**
 *
 * @author alvar
 */
public class GestionEmpleados {
    private double tarifaExtra = 4.2;
    private ArrayList<Empleado> list;
    
    public GestionEmpleados(){
        list = new ArrayList<>();
    }
    
    public void agregarEmpleado(Empleado empleado){
        list.add(empleado);
    }
    public double salarioTotal(){
        double totalSueldo = 0;
        for(Empleado empleado : list){
            totalSueldo += empleado.getSalarioBase()+(empleado.getHorasExtra()*tarifaExtra);
        }
        return totalSueldo;
    }

}
