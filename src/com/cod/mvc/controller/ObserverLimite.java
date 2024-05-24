package com.cod.mvc.controller;

import com.cod.mvc.model.Coche;
import com.cod.mvc.model.Model;

/**
 * Clase que implementa la interfaz Observer y comprueba si el coche supera el limite de velocidad
 * @version v2.0
 * @autor cristian
 */
public class ObserverLimite implements Observer {

    /**
     * Velocidad maxima
     */
    public static final int VELOCIDAD_LIMITE = 120;

    public static final int VELOCIDAD_REDUCIR = 10;

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
        if (coche.velocidad > VELOCIDAD_LIMITE) {
            System.out.println("Limite de velocidad sobrepasado, vamos a reducirla");
            model.reducirVelocidad(coche.matricula, VELOCIDAD_REDUCIR);

        }
    }
}
