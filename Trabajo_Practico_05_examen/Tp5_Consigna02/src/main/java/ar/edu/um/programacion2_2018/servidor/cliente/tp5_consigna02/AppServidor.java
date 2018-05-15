/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.um.programacion2_2018.servidor.cliente.tp5_consigna02;


import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException; 

public class AppServidor {
	
	public AppServidor() {
		
	}
    
	public static void main(String[] args) throws IOException, InterruptedException {
        //Socket_Servidor serv = new Socket_Servidor(); 
		ServerSocket s_serv = null;
                Cliente c1 = new Cliente();
                Cliente c2 = new Cliente();
	
        System.out.println("Iniciando servidor\n");
        //serv.startServer(); //Se inicia el servidor
        
        try {
        	s_serv = new ServerSocket(1234);
                
        	while(true) {
        		Socket s_Cola = s_serv.accept();
                        
        		System.out.println("Nueva cola aceptada");
                        Runnable tmp = new Cajero(s_Cola, c1);
                        Runnable tmp1 = new Cajero(s_Cola, c2);
        		//Cajero tmp = new Cajero(s_Cola);
                        //Cajero tmp1 = new Cajero(s_Cola);
                        //Cajero tmp2 = new Cajero(s_Cola);
                        Thread hilo = new Thread(tmp);
        		hilo.start();
                        Thread hilo2 = new Thread(tmp1);
                        hilo.wait();
                        hilo2.start();
                        hilo2.wait();
                        hilo.notify();
                        hilo2.notify();
                        //tmp2.start();
        	}
        }catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(s_serv != null) {
				s_serv.close();
			}
		}
        
    }
}
