/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.um.programacion2_2018.tp2_consigna01;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author tomas
 */
public class ComunidadDocente {
    private Profesor[] profesores;

    public ComunidadDocente() {
       ArrayList<Object> lista = new ArrayList<>(Arrays.asList(this.profesores)); 
    }

    public ComunidadDocente(Profesor[] profesores) {
        this.profesores = profesores;
    }

    public Profesor[] getProfesores() {
        return profesores;
    }

    public void setProfesores(Profesor[] profesores) {
        this.profesores = profesores;
    }
    
    public void add( Profesor p2){
        
        //profesores.add(p2); /* Agregamos el objeto p2 */
    }
    public void remove(Profesor p2){
        Object[] temp = new Object[profesores.length]; /* Temporal Array*/
        for (int i = 0; i < profesores.length; i++) {
         /* El String.valueOf(array[i]) es para convertir a 
           String el Objecto  comparamos si no es igual a b ,si se cumple 
           lo agregamos al temporal*/
         if(!String.valueOf(profesores[i]).toLowerCase().equals("b"))
        {
            temp[i]=profesores[i]; /* Agregamos al Arreglo Temporal */
        }
    }
       /*ArrayList<Object> lista = new ArrayList<>(Arrays.asList(this.profesores)); 
        lista.remove(p2); /* Eliminamos al objeto p2 */
    }
    public void show(){
         System.out.println(Arrays.toString(profesores));
         /*for (int i = 0; i < profesores.length; i++) {
             System.out.println(profesores[i]);
            }*/
        }
}
