package com.cod.mvc.controller;

import com.cod.mvc.model.Coche;
import com.cod.mvc.model.Model;
import com.cod.mvc.view.View;

/**
 * ObserverSubirVelocidad que sube la velocidad del coche al pulsar un boton
 * @author Cristian
 * @version 4.0
 */
public class ObserverSubirVelocidad implements Observer{

    /**
     * Atributo model de la clase Model
     */
    Model model = Model.getInstance();

    /**
     * Constructor de la clase
     * @param model para poder hacer cambios
     */
    public ObserverSubirVelocidad(Model model) {
        this.model = model;
    }

    /**
     * Método update para avisar a los observers
     * @param arg el argumento que le pasemos
     */
    @Override
    public void update(Coche arg) {
        //llamamos a la view para que muestre el mensaje correspondiente
        View.mostrarVelocidad(arg.matricula, arg.velocidad);
    }
}
