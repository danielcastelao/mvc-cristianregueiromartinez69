package com.cod.mvc.controller;

import com.cod.mvc.model.Model;

/**
 * clase controller donde tenemos la lógica del programa
 * @author cristian
 * @version v1.0
 */
public class Controller {
   private final Model miModel;
   public Controller(Model miModel) {
      this.miModel = miModel;
       /**
        * instanciamos el observador
        */
       ObserverVelocidad observoVelocidad = new ObserverVelocidad();
       miModel.addObserver(observoVelocidad);

       ObserverLimite observoElLimite = new ObserverLimite();
       miModel.addObserver(observoElLimite);


   }

   /**
    * metodo que crea un coche
    * @param nombre el nombre del coche
    * @param matricula la matricula del coche
    * @param velocidad la velocidad del coche
    */
   public void crearCoche(String nombre, String matricula, int velocidad){
       Model.crearCoche(nombre, matricula, velocidad);
   }

   /**
    * metodo que cambia la velocidad del coche
    * @param matricula la matricula del coche
    * @param velocidad la velocidad del coche
    */
   public void cambiarVelocidad(String matricula, int velocidad){
       miModel.cambiarVelocidad(matricula, velocidad);
   }



}
