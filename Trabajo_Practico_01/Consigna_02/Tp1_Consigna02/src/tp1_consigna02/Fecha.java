/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1_consigna02;
import java.util.ArrayList;

/**
 *
 * @author tomas
 */
public class Fecha {
    
    private int anho;
    private int mes;
    private int dia;

    public Fecha() {
        anho = 2018;
        mes = 4;
        dia = 2;
    }
    
    public Fecha(int dia, int mes, int anho) {
        this.anho = anho;
        this.mes = mes;
        this.dia = dia;
    }

    public int getAnho() {
        return anho;
    }

    public void setAnho(int anho) {
        this.anho = anho;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }
    
   public void input(int dia,int mes, int anho){
        setDia(dia);
        setMes(mes);
        setAnho(anho);
    }
    public String show(){
        getDia();
        getMes();
        getAnho();
        return String.format("%d/%d/%d",dia,mes,anho);
    }
    public int comparar(Fecha f2){
        int a=0;
        //Fechas iguales
        if(this.anho == f2.anho){
            if(this.mes == f2.mes){
                if (this.dia == f2.dia) {
                    System.out.println("Las fechas son iguales");
                    return a=0;
                }
            }
        }
        //Fecha 1 mayor que Fecha 2
        if (this.anho > f2.anho) {
            System.out.println("Comparo año, Fecha 1 es mayor que fecha 2");
            return a=1;}
            else if (this.mes > f2.mes) {
            System.out.println("Comparo mes, Fecha 1 es mayor que fecha 2");
            return a=1;}
            else if (this.dia > f2.dia){
            System.out.println("Comparo dia, Fecha 1 es mayor que fecha 2");
            return a=1;
            }
        
        //Fecha 2 mayor que Fecha 1
        if (this.anho < f2.anho) {
            System.out.println("Comparo año, Fecha 2 es mayor que fecha 1");
            return a=-1;}
            else if (this.mes < f2.mes) {
            System.out.println("Comparo mes, Fecha 2 es mayor que fecha 1");
            return a=-1;}
            else if (this.dia < f2.dia){
            System.out.println("Comparo dia, Fecha 2 es mayor que fecha 1");
            return a=-1;
            }
        return a;
    }
    
    public void desplazar(Fecha f,int cantidad){
        int stop = cantidad;
        int [] losValores = new int[7];
        int [] losValores1 = new int[4];
        //Lleno array
        losValores[0] = 1;
        losValores[1]= 3;
        losValores[2]= 5;
        losValores[3]= 7;
        losValores[4]= 8;
        losValores[5]= 10;
        losValores[6]= 12;
        losValores1[0] = 4;
        losValores1[1] = 6;
        losValores1[2] = 9;
        losValores1[3] = 11;
        
        for (int i = 0; i < cantidad; i++) {
            this.dia ++;
            stop = this.dia;
            //Meses con 31 dias
            for(int j=0; j<= 6 ; j++){
            if (this.mes == losValores[j] ){
                if (stop == 32) {
                this.dia = 1;
                this.mes ++;
                    }
                }
            }
            //Meses con 30
            for(int k=0; k<= 3 ; k++){
            if (this.mes == losValores1[k] ){
                if (stop == 31) {
                this.dia = 1;
                this.mes ++;
                    }
                }
            }
            //Febrero
            if (this.mes == 2 ){
                if (stop == 29) {
                this.dia = 1;
                this.mes ++;
                    }
                }
            if(this.mes == 13){
                this.anho ++;
                this.mes=1;
            }
        }
    
    }
    
    
    public String toString(){
    
        return String.format("%d/%d/%d", dia,mes, anho);
    }
    
}
