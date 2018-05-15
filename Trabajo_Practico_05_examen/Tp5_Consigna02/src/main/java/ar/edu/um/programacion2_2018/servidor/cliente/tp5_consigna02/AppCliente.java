/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.um.programacion2_2018.servidor.cliente.tp5_consigna02;

import java.io.IOException;

/**
 *
 * @author arnal
 */

public class AppCliente {
	//private Persona per1= new Persona ("pepe",2);
    public static void main(String[] args) throws IOException{  
        System.out.println("Inicia el cliente");
    	
                Producto pr1 = new Producto("Arroz",40);
		Producto pr2 = new Producto("Carne",120);
		Producto pr3 = new Producto("Gaseosa",60);
		Producto pr4 = new Producto("Galletas",20);
				
		
		//CLIENTES
		Cliente cl1_1 = new Cliente(1,"Pepe");
		cl1_1.add(pr1);
                cl1_1.add(pr2);
                cl1_1.add(pr4);
		Cliente cl2 = new Cliente(2,"Carlos");
		cl2.add(pr4);
                cl2.add(pr3);
                cl2.add(pr1);
		Cliente cl3 = new Cliente(3,"Jose");
		cl3.add(pr4);
                Cliente cl4= new Cliente(4,"Franco");
                cl4.add(pr2);
                Cliente cl5 = new Cliente(5, "Tomas");
                cl5.add(pr1);
                Cliente cl6 = new Cliente(6,"Agustin");
                cl6.add(pr4);
                
		ColaCaja cola = new ColaCaja();
		
		
        cola.getClientes().add(cl1_1);
        cola.getClientes().add(cl3);
        cola.getClientes().add(cl2);
        cola.getClientes().add(cl4);
        cola.getClientes().add(cl5);
        cola.getClientes().add(cl6);    
        
        cola.start();
       	
        
    }
   
}