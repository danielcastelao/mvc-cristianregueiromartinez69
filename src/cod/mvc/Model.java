package cod.mvc;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Model {

    private static ArrayList <Coche> parking = new ArrayList<>();

    public static ArrayList <Coche> crearCoche(String auxMatricula, String auxModelo, int auxVelocidad){

        parking.add(new Coche(auxMatricula, auxModelo, auxVelocidad));
        return parking;
    }

    public static ArrayList<Coche> getMisCoches() {
        return parking;
    }

    public static void cambiarVelocidad(String auxMatricula, int velocidad){

        for (Coche coche:parking){
            if(coche.getMatricula().equalsIgnoreCase(auxMatricula)){
                coche.setVelocidad(velocidad);
            }
        }

    }

    public static int getVelocidad(String auxMatricula){
        int velocidadActual = 0;
        for (Coche coche:parking){
            if(coche.getMatricula().equalsIgnoreCase(auxMatricula)){
                velocidadActual = coche.getVelocidad();
            }
        }
        return velocidadActual;
    }

   
}
