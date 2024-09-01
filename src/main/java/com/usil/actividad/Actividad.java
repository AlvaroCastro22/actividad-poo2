/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.usil.actividad;

import java.util.Scanner;

/**
 *
 * @author alvar
 */
public class Actividad {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        while(!salir){
            System.out.println("--Menu de Gestion de Empleados--");
            System.out.println("Ingresa una opcion:");
            int opcion = scanner.nextInt();
            scanner.nextLine();
            switch(opcion){
                case 1 -> {
                    System.out.println("Ingrese el nombre del empleado");
                    String nombre = scanner.nextLine();
                    System.out.println("Ingrese el cargo del empleado");
                    String apellido = scanner.nextLine();
                    
                    salir = true;
                }
                default->{
                    System.out.println("Elige un numero correcto");
                }
            }
            
        }
        scanner.close();
    }
}
