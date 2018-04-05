/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

/**
 *
 * @author tomas
 */
public class Tp1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1 = new Persona(39533876,"Masiero","Tomas");
        System.out.println(p1);
        System.out.println("Actualizando persona");
        p1.input(40345034, "Masiero", "Martina");
        System.out.println(p1);
    }
    
}
