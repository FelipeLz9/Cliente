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
public class GestionDeGrupo {
    
    private ArrayList<Persona> personas;

    public GestionDeGrupo() {
        this.personas = new ArrayList<>();
    }
    
    public void agregarGasto(Gasto gasto, String cedula){
        for(Persona actual:personas){
            if(actual.getCedula().equals(cedula)){
                actual.añadirGasto(gasto);
            }
        }
    }
    
    public boolean validarCedula(String cedula){
        for(Persona actual:personas){
            if(actual.getCedula().equals(cedula)){
                return true;
            }
        }
        return false;
    }
    
    public void agregarPersona(String nombre, String cedula){
        personas.add(new Persona(nombre, cedula));
    }
    
    public void listarGastos(){
        
    }
    
    public void listarPersonas(){
        
    }
}
