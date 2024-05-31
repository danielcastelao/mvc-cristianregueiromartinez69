package com.cod.mvc.controller;

import com.cod.mvc.model.Model;

/**
 * Clase Controller
 * @author cristian
 * @version 3.0
 */
public class Controller{

    /**
     * Atributo miModel de la clase Model
     */
    private Model miModel;

    /**
     * Constructor de la clase Controller
     * @param miModel de la clase Model
     */
    public Controller(Model miModel){
        this.miModel = miModel;

        /**
         * Añadimos los observadores
         */
        ObserverVelocidad observoVelocidad = new ObserverVelocidad(miModel);
        miModel.addObserver(observoVelocidad);

        /**
         * Añadimos los observadores
         */
        ObserverLimite observoLimite = new ObserverLimite(miModel);
        miModel.addObserver(observoLimite);
    }

    /**
     * Crea un coche
     * @param nombre del coche
     * @param matricula del coche
     */
    public void crearCoche(String nombre, String matricula){
        miModel.crearCoche(nombre, matricula);
    }

    /**
     * Cambia la velocidad de un coche
     * @param matricula del coche
     * @param velocidad a cambiar
     */
    public void cambiarVelocidad(String matricula, Integer velocidad){
        miModel.cambiarVelocidad(matricula, velocidad);
    }

    /**
     * Busca un coche y nos muestra sus datos
     * @param matricula del coche
     */
    public void buscarCoche(String matricula){
        miModel.getDatosCoche(matricula);
    }
}