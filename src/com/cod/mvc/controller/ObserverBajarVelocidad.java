package com.cod.mvc.controller;

import com.cod.mvc.model.Coche;
import com.cod.mvc.model.Model;
import com.cod.mvc.view.View;

/**
 * clase ObserverBajarVelocidad que baja la velocidad del coche
 * @author Cristian
 * @version 4.0
 */
public class ObserverBajarVelocidad  implements Observer{
    /**
     * Atributo model de la clase Model
     */
    Model model = Model.getInstance();
    /**
     * Atributo BAJAR que bajará la velocidad del coche
     */
    private static final int BAJAR = 10;
    /**
     * Constructor de la clase
     * @param model para poder hacer cambios
     */
    public ObserverBajarVelocidad(Model model) {
        this.model = model;
    }

    /**
     * Método update para avisar a los observers
     * @param arg el argumento que le pasemos
     */
    @Override
    public void update(Coche arg) {
        View.mostrarVelocidad(arg.matricula, arg.velocidad + BAJAR);
    }
}
