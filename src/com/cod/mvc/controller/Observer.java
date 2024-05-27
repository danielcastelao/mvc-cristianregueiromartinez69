
package com.cod.mvc.controller;

import com.cod.mvc.model.Coche;


/**
 * Interfaz Observer
 * @author cristian
 * @version 3.0
 */
public interface Observer {
    /**
     * Método update
     * @param arg el argumento que le pasemos
     */
    void update(Coche arg);

}
