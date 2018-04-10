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
public class Cargo {
    private String nombre;
    private double basico;

    public Cargo() {
        nombre="Titular";
        basico=17000;
    }

    public Cargo(String nombre, double basico) {
        this.nombre = nombre;
        this.basico = basico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getBasico() {
        return basico;
    }

    public void setBasico(double basico) {
        this.basico = basico;
    }
public String toString(){
        return ""+this.nombre+"-"+this.basico;
    }
}
