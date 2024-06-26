package com.cod.mvc.model;

/**
 * Clase Coche que representa un coche de nuestra aplicación
 * @author cristian
 * @version v4.0
 */
public class Coche {

    /**
     * Matricula del coche
     */
    public String modelo;
    /**
     * Modelo del coche
     */
    public String matricula;
    /**
     * Velocidad del coche
     */
    public Integer velocidad;



    /**
     * Constructor de la clase
     * @param matricula del coche
     * @param modelo del coche
     */
    public Coche(String modelo, String matricula, Integer velocidad) {
        this.modelo = modelo;
        this.matricula = matricula;
        this.velocidad = velocidad;
    }

    /**
     * getter y setter de los atributos del coche
     */
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Integer velocidad) {
        this.velocidad = velocidad;
    }


    /**
     * Método toString
     * @return el coche en formato String
     */
    @Override
    public String toString() {
        return "Coche: " +
                "\nmatricula: " + matricula  +
                "\nmodelo: " + modelo +
                "\nvelocidad: " + velocidad;
    }
}
