
package com.cod.mvc.controller;

import com.cod.mvc.model.Coche;
import com.cod.mvc.model.Model;
import com.cod.mvc.view.View;

public class ObserverVelocidad implements Observer {
    private final Model model;

    /**
     * Constructor
     * @pram el model para poder hacer cambios
     */
    public ObserverVelocidad(Model model) {
        this.model = model;
    }

    /**
     * Este método es llamado siempre que hay un cambio
     * El observable cuando hace el notifyObservers
     * 'dispara' todos los update de los Observers
     *
     * @param arg el argumento pasado por el observable, el coche actualizado
     */
    @Override
    public void update(Coche arg) {
        View.mostrarVelocidad(arg.matricula, arg.velocidad);



    }
}
