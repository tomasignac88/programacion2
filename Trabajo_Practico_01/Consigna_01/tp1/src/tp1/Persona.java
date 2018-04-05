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
public class Persona {
    private long dni;
    private String apellido;
    private String nombre;

    public Persona(long dni, String apellido, String nombre) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void input(long dni,String apellido, String nombre){
        setApellido(apellido);
        setDni(dni);
        setNombre(nombre);
    }
    public String toString(){
    
        return String.format("%d %s %s", dni,apellido, nombre);
    }
    
    
}
