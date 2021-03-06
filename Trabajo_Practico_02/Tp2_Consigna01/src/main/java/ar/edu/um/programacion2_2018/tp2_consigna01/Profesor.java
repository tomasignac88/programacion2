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
public class Profesor implements Cursable{
    protected int profesor_id;
    protected String nombre;
    protected String apellido;
    protected CargoMateria[] cargomateria;

    public Profesor() {
        profesor_id=1;
        nombre= "Fernando";
        apellido= "Villareal";
        cargomateria= new CargoMateria[3];
    }

    public Profesor(int profesor_id, String nombre, String apellido, CargoMateria[] cargomateria) {
        this.profesor_id = profesor_id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargomateria = cargomateria;
    }

    public int getProfesor_id() {
        return profesor_id;
    }

    public void setProfesor_id(int profesor_id) {
        this.profesor_id = profesor_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public CargoMateria[] getCargomateria() {
        return cargomateria;
    }

    public void setCargomateria(CargoMateria[] cargomateria) {
        this.cargomateria = cargomateria;
    }
    
     public String toString(){
        return ""+this.profesor_id+"-"+this.nombre+"-"+this.apellido+"-"+this.cargomateria;
    }

    @Override
    public void asignaCurso(Curso curso) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
