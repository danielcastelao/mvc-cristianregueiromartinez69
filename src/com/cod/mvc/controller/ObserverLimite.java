package com.cod.mvc.controller;

import com.cod.mvc.model.Coche;

public class ObserverLimite implements Observer{
    private final static int LIMITE = 120;
    @Override
    public void update(Coche arg) {
     if(arg.getVelocidad() > LIMITE){
         System.out.println("has superado el limite de velocidad, INFRACCION!!");
     }
    }
}
