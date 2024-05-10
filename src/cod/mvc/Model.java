package cod.mvc;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * clase model con los metodos
 * @author cristian
 * @version v1.0
 */
public class Model {

    /**
     * atributo privado ArrayList de tipo Cohe
     */
    private static ArrayList <Coche> parking = new ArrayList<>();

    /**
     * Metodo para crear un coche
     * @param auxMatricula la matricula del coche
     * @param auxModelo el model del coche
     * @param auxVelocidad la velocidad del coche
     * @return
     */
    public static ArrayList <Coche> crearCoche(String auxMatricula, String auxModelo, int auxVelocidad){

        parking.add(new Coche(auxMatricula, auxModelo, auxVelocidad));
        return parking;
    }

    /**
     * metodo que devuelve el array de coches
     * @return el array de coches
     */
    public static ArrayList<Coche> getMisCoches() {
        return parking;
    }

    /**
     * metodo para cambiar la velocidad del coche según la matrícula proporcionada
     * @param auxMatricula la matricula que ha de encontrar para encontrar la velocidad
     * @param velocidad la nueva velocidad del coche
     */
    public static void cambiarVelocidad(String auxMatricula, int velocidad){

        for (Coche coche:parking){
            if(coche.getMatricula().equalsIgnoreCase(auxMatricula)){
                coche.setVelocidad(velocidad);
            }
        }

    }

    /**
     * metodo para obtener la velocidad del coche según la matrícula proporcionada
     * @param auxMatricula la matrícula del coche que ha de encontrar
     * @return la velocidad del coche
     */
    public static int getVelocidad(String auxMatricula){
        int velocidadActual = 0;
        for (Coche coche:parking){
            if(coche.getMatricula().equalsIgnoreCase(auxMatricula)){
                velocidadActual = coche.getVelocidad();
            }
        }
        return velocidadActual;
    }

    public static ArrayList<Coche> getParking() {
        return parking;
    }

    public static void setParking(ArrayList<Coche> parking) {
        Model.parking = parking;
    }
}
