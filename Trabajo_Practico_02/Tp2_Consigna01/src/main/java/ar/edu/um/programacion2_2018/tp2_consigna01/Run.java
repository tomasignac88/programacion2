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
public class Run {
    public static void main(String[] args){
    CargoMateria cm1 = new CargoMateria();
        System.out.println(cm1.toString());
    TrabajoPractico tp1 = new TrabajoPractico();
        System.out.println(tp1.toString());
    ProfesorTitular p1 = new ProfesorTitular(); 
    System.out.println(p1.toString());
    ProfesorAdjunto p2 =new ProfesorAdjunto();
    ComunidadDocente cd1 = new ComunidadDocente();
    cd1.add(p1);
    cd1.add(p2);
        System.out.println("Muestro array");
    cd1.show();
    cd1.remove(p2);
        System.out.println("Muestro nuevamente array");
    cd1.show();
    }
}
