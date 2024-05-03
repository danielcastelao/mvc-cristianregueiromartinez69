
import cod.mvc.Coche;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class testModel {

    @Test
    @DisplayName("Metodo crear coche")
    public void comprobandoMetodoCrearCoche(String auxMatricula, String auxModelo, int auxVelocidad){
         ArrayList<Coche> parking = new ArrayList<>();
         parking.add(new Coche(auxMatricula, auxModelo, auxVelocidad));


    }

}
