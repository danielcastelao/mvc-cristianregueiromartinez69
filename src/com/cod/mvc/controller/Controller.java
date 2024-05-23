
package com.cod.mvc.controller;

import com.cod.mvc.model.Model;

/**
 * Clase controlador de la aplicacion
 * @version v1.0
 * @autor cristian
 * @version v1.0
 */
public class Controller {

    /**
     * Objeto de tipo Model
     */
    private final Model miModel = new Model();

    /**
     * Constructor de la clase
     * @param miModel objeto de tipo Model
     */
    public Controller(Model miModel) {

        /**
         * Añadimos los observadores al modelo
         */
        ObserverVelocidad ObVelocida = new ObserverVelocidad();
        miModel.addObserver(ObVelocida);

        /**
         * Añadimos los observadores al modelo
         */
        ObserverLimite ObLimite = new ObserverLimite();
        miModel.addObserver(ObLimite);

    }

    /**
     * Crea un coche
     * @param modelo del coche
     * @param matricula por la que buscar el coche
     */
    public void crearCoche(String modelo, String matricula){
        miModel.crearCoche(modelo, matricula);
    }

    /**
     * Cambiar la velocidad de un coche
     * @param matricula por la que buscar el coche
     * @param velocidad nueva
     */
    public void cambiarVelocidad(String matricula, Integer velocidad){
        miModel.cambiarVelocidad(matricula, velocidad);
    }
}