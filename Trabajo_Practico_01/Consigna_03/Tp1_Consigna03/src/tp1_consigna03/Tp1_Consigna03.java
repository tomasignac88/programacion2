/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1_consigna03;

/**
 *
 * @author tomas
 */
public class Tp1_Consigna03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Persona p1 = new Persona(39533876,"Masiero","Tomas");
       PersonaConNacimiento p2 = new PersonaConNacimiento("27 de junio de 1996", 39533876,"Masiero", "Tomas");
       System.out.println(p1);
       System.out.println("Actualizando persona");
       System.out.println(p2);
    }
    
}
