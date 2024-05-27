
package com.cod.mvc.model;

import com.cod.mvc.controller.Observer;
import com.cod.mvc.model.Coche;

/**
 * Interfaz Observable
 * @author cristian
 * @version 3.0
 */
public interface Observable {

    /**
     * Añade un observador
     * @param observer a añadir

     */
    void addObserver(Observer observer);

    /**
     * Elimina un observador
     * @param observer a eliminar
     */
    void removeObserver(Observer observer);

    /**
     * Notifica a los observadores
     * @param coche para observar
     */
    void notifyObservers(Coche coche);
}
