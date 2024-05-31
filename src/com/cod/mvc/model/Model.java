
package com.cod.mvc.model;

import com.cod.mvc.controller.Observer;

import java.util.ArrayList;


/**
 * Clase Model que implementa la interfaz Observable
 * @author cristian
 * @version 3.0
 */
public class Model implements Observable {

    private static Model modelInstance = null;

    private Model() {
    }


    /**
     * Array de coches
     */
    public static ArrayList<Coche> parking = new ArrayList<>();

    /**
     * Array de observadores
     */
    private static final ArrayList<Observer> observers = new ArrayList<Observer>();

    /**
     * Añade un observador
     * @param observer añadido
     */
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    /**
     * Elimina un observador
     * @param observer eliminado
     */
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Notifica a los observadores
     * Se ejecutara el método update() de cada observador
     * @param coche para observar
     */
    @Override
    public void notifyObservers(Coche coche) {
        for (Observer observer : observers) {
            observer.update(coche);
        }
    }


    /**
     * Crea un coche y lo mete en el parking
     * @param modelo del coche
     * @param matricula identificador unico
     * @return el coche creado
     */
    public Coche crearCoche(String modelo, String matricula){
        Coche aux = new Coche(modelo, matricula);
        parking.add(aux);
        return aux;
    }



    /**
     * Devuelve un coche según la matrícula
     * @param matricula identificador del coche
     * @return el coche
     */
    public Coche getDatosCoche(String matricula){
        /**
         * Iniciamos una variable coche a null
         */
        Coche aux = null;
        /**
         * Recorremos el parking
         */
        for (Coche e: parking) {
            /**
             * Si la matrícula coincide con la matrícula del coche devuelve el coche
             */
            if (e.matricula.equals(matricula)) {
                aux = e;
            }
        }
        return aux;
    }



    /**
     * Método que cambia la velocidad, por lo tanto
     * tendrá que avisar al controlador que ha cambiado
     *
     * @param matricula identificador del coche
     * @param v nueva velocidad
     */
    public void cambiarVelocidad(String matricula, Integer v) {
        // busca el coche
        Coche coche = getDatosCoche(matricula);
        if (coche == null) {
            return;
        }

        coche.velocidad = v;

        notifyObservers(coche);
    }

    /**
     * Devuelve la velocidad según la matrícula
     * @param matricula identificador del coche
     * @return velocidad del coche actual
     */
    public Integer getVelocidad(String matricula) {
        return getDatosCoche(matricula).velocidad;
    }

    public static Model getInstance() {
        if (modelInstance == null) {
            modelInstance = new Model();
        }
        return modelInstance;
    }
}
