import com.cod.mvc.model.Model;
import com.cod.mvc.model.Coche;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * clase renovada con los nuevos test de la aplicacion
 * @author cristian
 * @version v2.0

 */
public class TestModel {
    /**
     * Modelo de la aplicacion
     */
    private Model model;

    @BeforeEach
    public void setUp() {
        model = new Model();
    }

    /**
     * Test para crear un coche
     */
    @Test
    @DisplayName("Test para crear un coche")
    public void testCrearCoche() {
        Coche coche = model.crearCoche("1234ABC", "Toyota");
        assertNotNull(coche);
        assertEquals("1234ABC", coche.getMatricula());
        assertEquals("Toyota", coche.getModelo());
    }

    /**
     * Test para comprobar que tenemos el coche
     */
    @Test
    @DisplayName("Test para comprobar que tenemos el coche")
    public void testGetCoche() {
        model.crearCoche("1234ABC", "Toyota");
        Coche coche = model.getCoche("1234ABC");
        assertNotNull(coche);
        assertEquals("1234ABC", coche.getMatricula());

        Coche cocheNoExistente = model.getCoche("0000XXX");
        assertNull(cocheNoExistente);
    }

    /**
     * Test para cambiar la velocidad de un coche
     */
    @Test
    @DisplayName("Test para cambiar la velocidad de un coche")
    public void testCambiarVelocidad() {
        model.crearCoche("1234ABC", "Toyota");
        model.cambiarVelocidad("1234ABC", 100);
        Coche coche = model.getCoche("1234ABC");
        assertEquals(100, coche.getVelocidad());
    }

    /**
     * Test para comprobar que se ha reducido la velocidad del coche
     */
    @Test
    @DisplayName("Test para comprobar que se ha reducido la velocidad del coche")
    public void testReducirVelocidad() {
        model.crearCoche("1234ABC", "Toyota");
        model.cambiarVelocidad("1234ABC", 130);
        model.reducirVelocidad("1234ABC", 10);
        Coche coche = model.getCoche("1234ABC");
        assertEquals(120, coche.getVelocidad());
    }
}