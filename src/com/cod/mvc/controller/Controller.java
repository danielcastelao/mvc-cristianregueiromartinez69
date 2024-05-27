package com.cod.mvc.controller;

import com.cod.mvc.model.Model;

public class Controller{

    // remove the static keyword
    private Model miModel;

    public Controller(Model miModel){
        this.miModel = miModel;

        ObserverVelocidad observoVelocidad = new ObserverVelocidad(miModel);
        miModel.addObserver(observoVelocidad);

        ObserverLimite observoLimite = new ObserverLimite(miModel);
        miModel.addObserver(observoLimite);
    }

    // remove the static keyword
    public void crearCoche(String nombre, String matricula){
        miModel.crearCoche(nombre, matricula);
    }

    // remove the static keyword
    public void cambiarVelocidad(String matricula, Integer velocidad){
        miModel.cambiarVelocidad(matricula, velocidad);
    }
}