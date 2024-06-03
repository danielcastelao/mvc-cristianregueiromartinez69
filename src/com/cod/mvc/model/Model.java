package com.cod.mvc.model;

import com.cod.mvc.controller.Observer;

import java.util.ArrayList;


/**
 * Clase Model que contiene los datos y métodos de la aplicación
 * @author Cristian
 * @version 4.0
 */
public class Model implements Observable {

    /**
     * Atributo modelInstance de la clase Model para hacer el Singleton
     */
    private static Model modelInstance = null;

    /**
     * Constructor privado
     */
    private Model() {
    }



    /**
     * Atributo parking que es un ArrayList de Coche
     */
    public static ArrayList<Coche> parking = new ArrayList<>();

    /**
     * Atributo observers que es un ArrayList de Observer
     */
    private static final ArrayList<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Coche coche) {
        for (Observer observer : observers) {
            observer.update(coche);
        }
    }

    /**
     * Método que crea un coche y lo añade al parking
     * @param modelo del coche
     * @param matricula del coche
     * @param velocidad del coche
     * @return el coche creado
     */
    public Coche crearCoche(String modelo, String matricula, Integer velocidad) {
        Coche aux = new Coche(modelo, matricula, velocidad);
        parking.add(aux);
        return aux;
    }

    /**
     * Método que busca un coche por matrícula
     * @param matricula del coche
     * @return el coche buscado
     */
    public Coche getDatosCoche(String matricula) {
        for (Coche e : parking) {
            if (e.getMatricula().equalsIgnoreCase(matricula)) {
                return e;
            }
        }
        return null;
    }

    /**
     * Método que cambia la velocidad de un coche
     * @param matricula del coche
     * @param v velocidad a cambiar
     */
    public void cambiarVelocidad(String matricula, Integer v) {
        Coche coche = getDatosCoche(matricula);
        if (coche != null) {
            coche.setVelocidad(v);
            notifyObservers(coche);
        }
    }

    /**
     * Método que devuelve la velocidad del coche
     * @param matricula del coche
     * @return la velocidad del coche
     */
    public Integer getVelocidad(String matricula) {
        Coche coche = getDatosCoche(matricula);
        if (coche != null) {
            return coche.getVelocidad();
        }
        return null;
    }

    /**
     * Método que sube la velocidad de un coche en una cantidad
     * @param matricula del coche a subir velocidad
     * @param incremento a subir velocidad
     */
    public void subirVelocidad(String matricula, Integer incremento) {
        Coche coche = getDatosCoche(matricula);
        if (coche != null) {
            coche.setVelocidad(coche.getVelocidad() + incremento);
            //notificamos a los observers
            notifyObservers(coche);
        }
    }

    /**
     * Método que baja la velocidad de un coche en una cantidad
     * @param matricula del coche a bajar velocidad
     * @param decremento a bajar velocidad
     */
    public void bajarVelocidad(String matricula, Integer decremento) {
        Coche coche = getDatosCoche(matricula);
        if (coche != null) {
            coche.setVelocidad(coche.getVelocidad() - decremento);
            //notificamos a los observers
            notifyObservers(coche);
        }
    }

    /**
     * Metodo para hacer el Singleton
     * @return la instancia de Model que será unica
     */
    public static Model getInstance() {
        if (modelInstance == null) {
            modelInstance = new Model();
        }
        return modelInstance;
    }


}
