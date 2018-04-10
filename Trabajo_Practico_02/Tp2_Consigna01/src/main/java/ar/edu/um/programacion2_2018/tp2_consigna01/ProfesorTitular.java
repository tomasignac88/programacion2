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
public class ProfesorTitular extends Profesor implements Cursable{
    private ContenidoTeorico contenidoTeorico;

    public ProfesorTitular() {
        contenidoTeorico= new ContenidoTeorico();
    }

    public ProfesorTitular(ContenidoTeorico contenidoTeorico) {
        this.contenidoTeorico = contenidoTeorico;
    }

    public ProfesorTitular(ContenidoTeorico contenidoTeorico, int profesor_id, String nombre, String apellido, CargoMateria[] cargomateria) {
        super(profesor_id, nombre, apellido, cargomateria);
        this.contenidoTeorico = contenidoTeorico;
    }

    public ContenidoTeorico getContenidoTeorico() {
        return contenidoTeorico;
    }

    public void setContenidoTeorico(ContenidoTeorico contenidoTeorico) {
        this.contenidoTeorico = contenidoTeorico;
    }
    
    @Override
  public String toString(){
    
        return String.format("%s-%d-%s-%s-%s",contenidoTeorico,profesor_id,nombre,apellido,cargomateria);
    }
    
    @Override
    public void asignaCurso(Curso curso) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
