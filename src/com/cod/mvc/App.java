package com.cod.mvc;

import com.cod.mvc.controller.Controller;
import com.cod.mvc.model.Model;

/**
 * clase app donde ejecutamos el programa
 * @author cristian
 * @version v2.0
 */
public class App {
    public static void main(String[] args) {
        /**
         * Creamos un modelo y un controlador
         */
        Model model = new Model();
        Controller controller = new Controller(model);

        /**
         * Creamos coches y cambiamos la velocidad
         */
        controller.crearCoche("6969-AC", "Peogeot");
        controller.crearCoche("7777-BC", "Volkswagen");
        controller.crearCoche("5189-UJ", "Audi");

        /**
         * Cambiamos la velocidad de los coches
         */
        controller.cambiarVelocidad("6969-AC", 100);
        controller.cambiarVelocidad("7777-BC", 130);
        controller.cambiarVelocidad("5189-UJ", 150);
    }
}