package com.cod.mvc.controller;

import com.cod.mvc.model.Coche;
import com.cod.mvc.model.Model;

/**
 * Clase que implementa la interfaz Observer y comprueba si el coche supera el limite de velocidad
 * @author cristian
 * version v2.0
 */
public class ObserverLimite implements Observer {

    /**
     * Velocidad maxima
     */
    public static final int VELOCIDAD_LIMITE = 120;

    /**
     * Velocidad a reducir
     */
    public static final int VELOCIDAD_REDUCIR = 10;

    /**
     * Modelo de la aplicacion
     */
    private Model model;

    public ObserverLimite(Model model) {
        this.model = model;
    }
    /**
     * Comprueba si el coche cuya velocidad se ha actualizado supera el limite de velocidad
     * si supera el limite de velocidad, se le reduce la velocidqad actual en 10
     * @param coche el objeto tipo coche que se ha actualizado
     */
    @Override
    public void update(Coche coche) {
        /**
         * Si la velocidad del coche supera el limite de velocidad, se reduce la velocidad
         */
        if (coche.velocidad > VELOCIDAD_LIMITE) {
            System.out.println("Limite de velocidad sobrepasado, vamos a reducirla");
            model.reducirVelocidad(coche.matricula, VELOCIDAD_REDUCIR);

        }
    }
}
