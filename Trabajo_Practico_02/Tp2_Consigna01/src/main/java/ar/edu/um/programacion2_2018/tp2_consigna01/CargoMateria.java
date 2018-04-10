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
public class CargoMateria {

    private Materia materia;
    private Cargo cargo;

    public CargoMateria() {
        materia= new Materia();
        cargo= new Cargo();
    }

    public CargoMateria(Materia materia, Cargo cargo) {
        this.materia = materia;
        this.cargo = cargo;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
    
   public String toString(){
        return "Materia: "+this.materia+"- Cargo: "+this.cargo;
    }
}
