
import cod.mvc.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class testModel {


    @Test
    @DisplayName("Metodo crear coche")
    public void testCrearCoche() {

        ArrayList<Coche> parking = Model.crearCoche("1237ABC", "Toyota", 120);


        Coche coche = parking.get(0);
        Assertions.assertEquals("1237ABC", coche.getMatricula());
        Assertions.assertEquals("Toyota", coche.getModelo());
        Assertions.assertEquals(120, coche.getVelocidad());
    }

    @Test
    @DisplayName("Metodo cambiar velocidad")
    public void testCambiarVelocidad() {
        Model.crearCoche("1231ABC", "Toyota", 120);


        Model.cambiarVelocidad("1231ABC", 150);
        Assertions.assertEquals(150, Model.getVelocidad("1231ABC"));
    }

    @Test
    @DisplayName("Metodo obtener velocidad")
    public void testGetVelocidad() {

        Model.crearCoche("1237ABC", "Toyota", 120);


        Assertions.assertEquals(120, Model.getVelocidad("1237ABC"));
    }

}
