package com.cod.mvc.controller;

import com.cod.mvc.model.Coche;


 /**
  * Clase que implementa la interfaz Observer y comprueba si el coche supera el limite de velocidad
  * @author cristian
  * @version v2.0
  */
public class ObserverLimite implements Observer{

    /**
     * Velocidad maxima
     */
    public final static int VELOCIDAD_LIMITE = 120;

    /**
     * Comprueba si el coche cuya velocidad se a actualizado supera el limite de velocidad
     * @param coche el objeto tipo coche que se a actualizado
     */
    @Override
    public void update(Coche coche) {
        if(coche.velocidad>VELOCIDAD_LIMITE){
            System.out.println("Limite de velocidad sobrepasado");
        }
    }
}