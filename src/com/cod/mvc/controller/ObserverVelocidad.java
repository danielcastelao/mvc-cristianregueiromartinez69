
package com.cod.mvc.controller;

import com.cod.mvc.model.Coche;
import com.cod.mvc.model.Model;
import com.cod.mvc.view.View;

/**
 * ObserverVelocidad
 * Observer que muestra la velocidad del coche
 * @author Cristian
 * @version 3.0
 */
public class ObserverVelocidad implements Observer {
    private final Model model;

    /**
     * Constructor
     * @param model para poder hacer cambios
     */
    public ObserverVelocidad(Model model) {
        this.model = model;
    }

    /**
     * Método update para avisar a los observers
     * @param arg el argumento que le pasemos
     */
    @Override
    public void update(Coche arg) {
        View.mostrarVelocidad(arg.matricula, arg.velocidad);

    }
}
