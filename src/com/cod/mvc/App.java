package com.cod.mvc;

import com.cod.mvc.controller.Controller;
import com.cod.mvc.model.Model;
/**
 * clase principal de nuestra aplicación
 * @author cristian
 * @version v1.0
 */
public class App {

    /**
     * metodo principal de nuestra aplicación
     * @param args
     */
    public static void main(String[] args) {
        /**
         * instanciamos el modelo y el controlador
         */
       Model miModel = new Model();
       Controller miController = new Controller(miModel);

       /**
        * creamos los coches
        */
       miController.crearCoche("Toyota", "1237ABC", 110);
       miController.crearCoche("Seat", "1238ABC", 90);
       miController.crearCoche("Renault", "1239ABC", 130);
       /**
        * cambiamos la velocidad de los coches
        */
       miController.cambiarVelocidad("1238ABC", 100);
       miController.cambiarVelocidad("1237ABC", 150);
    }
}
