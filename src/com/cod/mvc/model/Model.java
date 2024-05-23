
package com.cod.mvc.model;

import com.cod.mvc.controller.Observer;

import java.util.ArrayList;

/**
 * Clase que implementa la interfaz Observable y se encarga de gestionar los coches y notificar a los observers de un cambio
 * @version v2.0
 * @autor cristian
 */
public class Model implements Observable {

    /**
     * Arraylist que contiene los coches de la aplicacion
     */
    public static ArrayList<Coche> parking = new ArrayList<>();

    /**
     * Arraylist que contiene los observers de la aplicacion
     */
    public static ArrayList<Observer> observers = new ArrayList<>();

    /**
     * Añade un objecto de tipo observer al arraylist [observers]
     * @param observer objecto a añadir al list
     */
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * Elimina un objecto de tipo observer del arraylist [observers]
     * @param observer objecto a eliminar del list
     */
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Recorre los observers del arraylist y los notifica de un cambio
     * @param coche el objecto en el que se ha producido un cambio
     */
    public void notifyObservers(Coche coche) {
        for(Observer observer : observers){
            observer.update(coche);
        }
    }

    /**
     * Crea un coche con los parametros especificados
     * @param matricula variable para el nuevo objecto
     * @param modelo variable para el nuevo objecto
     * @return coche creado
     */
    public Coche crearCoche(String matricula,String modelo){
        Coche cocheNuevo = new Coche(matricula,modelo);
        parking.add(cocheNuevo);
        return cocheNuevo;
    }

    /**
     * Busca un coche por matricula y lo retorna de haberlo encontrado
     * @param matricula identificador unico del coche
     * @return coche encontrado o null en caso de no existir el coche
     */
    public Coche getCoche(String matricula) {
        for (Coche coche : parking) {
            if (coche.matricula.equals(matricula)) {
                return coche;
            }
        }
        return null;
    }

    /**
     * Cambia la velocidad del coche cuya matricula a sido especificada
     * @param matricula identificador unico del coche
     * @param velocidad variable por la que cambiar la velocidad
     * @return nueva velocidad
     */
    public Integer cambiarVelocidad(String matricula,Integer velocidad){
        Coche coche = getCoche(matricula);
        coche.velocidad = velocidad;
        notifyObservers(coche);
        return coche.velocidad;
    }

    /**
     * Retorna la velocidad del coche especificado
     * @param matricula identificador unico del coche
     * @return velocidad del coche
     */
    public Integer getVelocidad(String matricula){
        Coche coche = getCoche(matricula);
        return coche.velocidad;
    }
}