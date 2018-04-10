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
public class ContenidoTeorico {
    private String tema;
    private String descripcion;
    private int horasPresenciales;

    public ContenidoTeorico() {
        tema = "Diferenciales";
        descripcion= "Teorico";
        horasPresenciales= 3;
    }

    public ContenidoTeorico(String tema, String descripcion, int horasPresenciales) {
        this.tema = tema;
        this.descripcion = descripcion;
        this.horasPresenciales = horasPresenciales;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getHorasPresenciales() {
        return horasPresenciales;
    }

    public void setHorasPresenciales(int horasPresenciales) {
        this.horasPresenciales = horasPresenciales;
    }
    public String toString(){
    
        return String.format("%s-%s-%d",tema,descripcion,horasPresenciales);
    }
    
    
}
