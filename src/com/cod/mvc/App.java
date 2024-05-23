package com.cod.mvc;

import com.cod.mvc.controller.Controller;
import com.cod.mvc.model.Model;

/**
 * clase app donde ejecutamos el programa
 * @autor cristian
 * @version v2.0
 */
public class App {
    public static void main(String[] args) {
        /**
         * Creamos un objeto de tipo Model
         */
        Model miModel = new Model();

        /**
         * Creamos un objeto de tipo Controller
         */
        Controller miController = new Controller(miModel);

        /**
         * Creamos un coche
         */
        miController.crearCoche("LaFerrari", "SBC 1234");
        miController.crearCoche("Alpine", "HYU 4567");

        /**
         * Cambiamos la velocidad de los coches
         */
        miController.cambiarVelocidad("SBC 1234", 30);
        miController.cambiarVelocidad("HYU 4567", 150);

    }
}