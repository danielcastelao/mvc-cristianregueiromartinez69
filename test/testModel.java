
import cod.mvc.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class testModel {


    @Test
    public void testCrearCoche() {

        ArrayList<Coche> parking = Model.crearCoche("1234ABC", "Toyota", 120);
        Assertions.assertEquals(1, parking.size());

        // Comprobamos que los atributos del coche creado son correctos
        Coche coche = parking.get(0);
        Assertions.assertEquals("1234ABC", coche.getMatricula());
        Assertions.assertEquals("Toyota", coche.getModelo());
        Assertions.assertEquals(120, coche.getVelocidad());
    }

    @Test
    public void testCambiarVelocidad() {
        // Añadimos un coche al parking
        Model.crearCoche("1234ABC", "Toyota", 120);

        // Comprobamos que el método cambiarVelocidad actualiza la velocidad del coche correcto
        Model.cambiarVelocidad("1234ABC", 150);
        Assertions.assertEquals(150, Model.getVelocidad("1234ABC"));
    }

    @Test
    public void testGetVelocidad() {
        // Añadimos un coche al parking
        Model.crearCoche("1234ABC", "Toyota", 120);

        // Comprobamos que el método getVelocidad devuelve la velocidad del coche correcto
        Assertions.assertEquals(120, Model.getVelocidad("1234ABC"));
    }

}
