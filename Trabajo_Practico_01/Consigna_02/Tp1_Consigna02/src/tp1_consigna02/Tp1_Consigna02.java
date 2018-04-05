/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1_consigna02;

/**
 *
 * @author tomas
 */
public class Tp1_Consigna02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fecha f1 = new Fecha();
        Fecha f2 = new Fecha(1,4,2018);
        System.out.println("Fecha 1: ");
        System.out.println(f1);
        System.out.println("Fecha 2: ");
        System.out.println(f2);
        f1.comparar(f2);
        f2.desplazar(f2, 400);
        System.out.println(f2);
    }
    
}
