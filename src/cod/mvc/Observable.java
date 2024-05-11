package cod.mvc;

/**
 * Interface observable de nuestra aplicación
 * @author cristian
 * @version v1.0
 */
public interface Observable {



        void addObserver(Observer observer);

        void removeObserver(Observer observer);

        void notifyObservers(Coche coche);
    }

