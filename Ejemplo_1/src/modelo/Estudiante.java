/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author DANIEL
 */
public class Estudiante extends Persona {
    
    private String carreraEstudiante;
    private String codigoEstudiante;

    public Estudiante() {
    }

    public Estudiante(String carreraEstudiante, String codigoEstudiante, String nombrePersona, String direccionPersona, String correoPersona) {
        super(nombrePersona, direccionPersona, correoPersona);
        this.carreraEstudiante = carreraEstudiante;
        this.codigoEstudiante = codigoEstudiante;
    }
    
    

    /**
     * Get the value of codigoEstudiante
     *
     * @return the value of codigoEstudiante
     */
    public String getCodigoEstudiante() {
        return codigoEstudiante;
    }

    /**
     * Set the value of codigoEstudiante
     *
     * @param codigoEstudiante new value of codigoEstudiante
     */
    public void setCodigoEstudiante(String codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }


    /**
     * Get the value of carreraEstudiante
     *
     * @return the value of carreraEstudiante
     */
    public String getCarreraEstudiante() {
        return carreraEstudiante;
    }

    /**
     * Set the value of carreraEstudiante
     *
     * @param carreraEstudiante new value of carreraEstudiante
     */
    public void setCarreraEstudiante(String carreraEstudiante) {
        this.carreraEstudiante = carreraEstudiante;
    }

    @Override
    public String toString() {
        return super.toString()+ carreraEstudiante+", " + codigoEstudiante + "";
    }

   

    
}
