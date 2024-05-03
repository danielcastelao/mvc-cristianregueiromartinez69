package cod.mvc;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Model {

    private ArrayList <Coche> misCoches = new ArrayList<>();

    public ArrayList <Coche> crearCoche(String auxMatricula, String auxModelo, int auxVelocidad){

        misCoches.add(new Coche(auxMatricula, auxModelo, auxVelocidad));
        return misCoches;
    }



    public ArrayList<Coche> getMisCoches() {
        return misCoches;
    }
}
