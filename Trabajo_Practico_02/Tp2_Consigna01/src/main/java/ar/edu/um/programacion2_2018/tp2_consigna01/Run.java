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
    Materia m1= new Materia("013", "Lengua");
    Cargo c1 = new Cargo("Regular", 19000);
    CargoMateria cm1 = new CargoMateria(m1, c1);
    TrabajoPractico tp1 = new TrabajoPractico();
    //Profesor p1 = new Profesor(3, "Juan", "Segundo", cm1);
    //System.out.println(p1.toString());
    Profesor p3 = new Profesor();
    ProfesorAdjunto p2 =new ProfesorAdjunto();
    ComunidadDocente cd1 = new ComunidadDocente();
    cd1.add(p3);
    cd1.add(p2);
        System.out.println("Muestro array");
    cd1.show();
   // cd1.remove(p2);
     //   System.out.println("Muestro nuevamente array");
    //cd1.show();
    }
}
