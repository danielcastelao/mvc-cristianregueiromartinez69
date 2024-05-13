package cod.mvc.model;

import cod.mvc.controller.Observer;

/**
 * Interface observable de nuestra aplicación
 * @author cristian
 * @version v1.0
 */
public interface Observable {


    /**
     * metodo para añadir un observador
     * @param observer el objeto de tipo Observer
     */
        void addObserver(Observer observer);

    /**
     * metodo para eliminar un observador
     * @param observer el objeto de tipo observer
     */
    void removeObserver(Observer observer);

    /**
     * metodo para notificar a nuestros observadores
     * @param coche el Objeto de tipo Coche
     */
        void notifyObservers(Coche coche);
    }

