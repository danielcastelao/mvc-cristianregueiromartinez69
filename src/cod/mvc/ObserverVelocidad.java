package cod.mvc;

/**
 * clase que implementa la interfaz observer para informar de que la velocidad ha sido cambiada
 * @author cristian
 * @version v1.0
 */
public class ObserverVelocidad implements Observer{
    /**
     * Este método es llamado cuando hay un cambio
     * laza todos los update de los Observers
     *
     * @param arg el argumento pasado por el observable, el coche actualizado
     */
    @Override
    public void update(Coche arg) {
        System.out.println("La velocidad ha sido alterada: " + arg.getVelocidad());
        /**
         * le decimos a la vista que muestre la velocidad
         */
        View.muestraVelocidad(arg.getMatricula(), arg.getVelocidad());



    }
}
