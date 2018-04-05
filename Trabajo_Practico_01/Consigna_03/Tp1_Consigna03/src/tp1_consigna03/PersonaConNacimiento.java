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
public class PersonaConNacimiento extends Persona{
    private String fechaNacimiento;

    public PersonaConNacimiento(long dni, String apellido, String nombre) {
        super(dni, apellido, nombre);
        fechaNacimiento="27 de junio de 1996";
    }

    public PersonaConNacimiento(String fechaNacimiento, long dni, String apellido, String nombre) {
        super(dni, apellido, nombre);
        this.fechaNacimiento = fechaNacimiento;
    }


    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public void input(String fecha){
        setFechaNacimiento(fechaNacimiento);
    }
    public String show(){
        getFechaNacimiento();
        return String.format("%s",fechaNacimiento);
    }
    public String toString(){
    
        return String.format("%s-%d-%s-%s", fechaNacimiento,dni,apellido,nombre);
    }
}
