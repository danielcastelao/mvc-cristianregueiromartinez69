package com.cod.mvc.controller;

import com.cod.mvc.model.Model;

/**
 * clase controller donde tenemos la lógica del programa
 * @author cristian
 * @version v1.0
 */
public class Controler {
    /**
     * atributo estático de tipo Model para llamar a los métodos
     */
   static Model modelo = new Model();
   public static void logicaPrograma(){

       /**
        * instanciamos el observador
        */
       ObserverVelocidad observoVelocidad = new ObserverVelocidad();
       modelo.addObserver(observoVelocidad);

       /**
        * creamos coches
        */
       Model.crearCoche("1234-UH", "Seat", 140);
       Model.crearCoche("1235-UH", "Citroen", 90);
       Model.crearCoche("9876-AB", "Audi", 230);

       /**
        * le cambiamos la velocidad
        */
       modelo.cambiarVelocidad("1235-UH", 100);



   }


}
