package cod.mvc;

/**
 * Interface observer de la aplicacion
 * @author cristian
 * @version v1.0
 */
public interface Observer {


    /**
     * metodo que se ejecuta si cambian las propiedades de nuestro objeto de tipo coche
     * @param arg el atributo que cambia
     */
    void update(Coche arg);
}
