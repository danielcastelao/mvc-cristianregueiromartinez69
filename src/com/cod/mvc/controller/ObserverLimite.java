package com.cod.mvc.controller;

import com.cod.mvc.model.Coche;
import com.cod.mvc.model.Model;
import com.cod.mvc.view.Dialog;

/**
 * Clase ObserverLimite
 * @author cristian
 * @version 4.0
 */
public class ObserverLimite implements Observer {
    /**
     * Atributo LIMITE con la velocidad limite permitida
     */
    final static int LIMITE = 120;
    /**
     * Atributo miModel de la clase Model
     */
    private final Model miModel;

    /**
     * Constructor
     * @param miModel el modelo para poder hacer cambios
     */
    public ObserverLimite(Model miModel) {
        this.miModel = miModel;
    }

    /**
     * Método update para avisar a los observers
     * @param coche el argumento que le pasemos
     */
    @Override
    public void update(Coche coche) {
        /**
         * Si la velocidad del coche es mayor que el límite
         */
        if (coche.velocidad > LIMITE) {

            /**
             * Cambiamos la velocidad del coche
             */
            miModel.cambiarVelocidad(coche.matricula, coche.velocidad - 10);
            /**
             * Mostramos un mensaje
             */
            Dialog.mostrarMensaje("Vamos muy rapido pendejo, " + "Velocidad reducida a " + (coche.velocidad - 10) + "km/h");
        }
    }
}