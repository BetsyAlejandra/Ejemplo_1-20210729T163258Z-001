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
public class Persona {
    private String nombrePersona;
    private String direccionPersona;
    private String correoPersona;

    public Persona() {
    }

    public Persona(String nombrePersona, String direccionPersona, String correoPersona) {
        this.nombrePersona = nombrePersona;
        this.direccionPersona = direccionPersona;
        this.correoPersona = correoPersona;
    }
    
    

    /**
     * Get the value of correoPersona
     *
     * @return the value of correoPersona
     */
    public String getCorreoPersona() {
        return correoPersona;
    }

    /**
     * Set the value of correoPersona
     *
     * @param correoPersona new value of correoPersona
     */
    public void setCorreoPersona(String correoPersona) {
        this.correoPersona = correoPersona;
    }

    

    /**
     * Get the value of Direccion
     *
     * @return the value of Direccion
     */
    public String getDireccion() {
        return direccionPersona;
    }

    /**
     * Set the value of Direccion
     *
     * @param Direccion new value of Direccion
     */
    public void setDireccion(String Direccion) {
        this.direccionPersona = Direccion;
    }


    /**
     * Get the value of Nombre
     *
     * @return the value of Nombre
     */
    public String getNombre() {
        return nombrePersona;
    }

    /**
     * Set the value of Nombre
     *
     * @param Nombre new value of Nombre
     */
    public void setNombre(String Nombre) {
        this.nombrePersona = Nombre;
    }

    @Override
    public String toString() {
        return nombrePersona+", " + direccionPersona+", " + correoPersona+", ";
    }

    
    
}
