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
public class TrabajoPractico {
    private int numero;
    private String ejercitacion;
    private int horasLaboratorio;

    public TrabajoPractico() {
        numero=1;
        ejercitacion="Ecuaciones";
        horasLaboratorio=3;
    }

    public TrabajoPractico(int numero, String ejercitacion, int horasLaboratorio) {
        this.numero = numero;
        this.ejercitacion = ejercitacion;
        this.horasLaboratorio = horasLaboratorio;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEjercitacion() {
        return ejercitacion;
    }

    public void setEjercitacion(String ejercitacion) {
        this.ejercitacion = ejercitacion;
    }

    public int getHorasLaboratorio() {
        return horasLaboratorio;
    }

    public void setHorasLaboratorio(int horasLaboratorio) {
        this.horasLaboratorio = horasLaboratorio;
    }
    
    public String toString(){
    
        return String.format("%d-%s-%d",numero,ejercitacion,horasLaboratorio);
    }
    
    
}
