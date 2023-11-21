/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GritonClientSocket;

import java.util.ArrayList;

/**
 *
 * @author lopez
 */
public class Persona {
    
    private String cedula;
    private String nombre;
    private ArrayList gastos = new ArrayList();

    public Persona(String cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    public String getCedula() {
        return cedula;
    }
    
    public void añadirGasto(Gasto gasto){
        gastos.add(gasto); 
    }
    
}
