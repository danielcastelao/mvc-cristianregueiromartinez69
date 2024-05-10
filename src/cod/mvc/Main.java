package cod.mvc;

/**
 * clas emain donde ejecutamos el programa
 */
public class Main {
    public static void main(String[] args) {

        /**
         * hacemos un objeto de la clase vista y llamamos al método muestra velocidad
         */
         View vista = new View();
         vista.muestraVelocidad("1234A", 120);
    }
}