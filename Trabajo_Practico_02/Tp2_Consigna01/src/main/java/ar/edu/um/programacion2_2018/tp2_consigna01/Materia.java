/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.um.programacion2_2018.tp2_consigna01;

/**
 *
 * @author tomas
 */
public class Materia {
    private String codigoMateria;
    private String nombre;

    public Materia() {
        codigoMateria= "003";
        nombre= "Programacion 2";
    }

    public Materia(String codigoMateria, String nombre) {
        this.codigoMateria = codigoMateria;
        this.nombre = nombre;
    }

   
    public String getCodigoMateria() {
        return codigoMateria;
    }

    public void setCodigoMateria(String codigoMateria) {
        this.codigoMateria = codigoMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /* public String toString(){
    
        return String.format("%s-%s", codigoMateria,nombre);
    }*/
    public String toString(){
        return ""+this.codigoMateria+"-"+this.nombre;
    }
}
