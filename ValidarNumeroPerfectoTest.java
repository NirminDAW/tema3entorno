import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Nirmin
 */
public class ValidarNumeroPerfectoTest {
    
    public ValidarNumeroPerfectoTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of main method, of class ValidarNumeroPerfecto.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ValidarNumeroPerfecto.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of esNumeroPerfecto method, of class ValidarNumeroPerfecto.
     */
     @Test
    public void testEsNumeroPerfecto() {
        assertTrue(ValidarNumeroPerfecto.esNumeroPerfecto(28));
        assertFalse(ValidarNumeroPerfecto.esNumeroPerfecto(7));
    }

    /**
     * Test of sumaDivisoresPropios method, of class ValidarNumeroPerfecto.
     */
    @Test
    public void testSumaDivisoresPropios() {
       assertEquals(28, ValidarNumeroPerfecto.sumaDivisoresPropios(28));
        assertEquals(3, ValidarNumeroPerfecto.sumaDivisoresPropios(4));
    }

    /**
     * Test of imprimirNumerosPerfectos method, of class ValidarNumeroPerfecto.
     */
    @Test
        public void testEncontrarNumeroPerfecto(){
            // Caso de prueba 1: Número perfecto conocido
        assertEquals(496, ValidarNumeroPerfecto.encontrarNumeroPerfecto(28));

        // Caso de prueba 2: Otro número perfecto conocido
        assertEquals(8128, ValidarNumeroPerfecto.encontrarNumeroPerfecto(496));
        }

    /**
     * Test of esPar method, of class ValidarNumeroPerfecto.
     */
    @Test
    public void testEsPar() {
        assertTrue(ValidarNumeroPerfecto.esPar(2), "2 debería ser par");
        assertFalse(ValidarNumeroPerfecto.esPar(7), "7 no debería ser par");
    }

    /**
     * Test of factorial method, of class ValidarNumeroPerfecto.
     */
    @Test
    public void testFactorial() {
        assertEquals(120, ValidarNumeroPerfecto.factorial(5), "El factorial de 5 debería ser 120");
        assertEquals(1, ValidarNumeroPerfecto.factorial(0), "El factorial de 0 debería ser 1");
    }
}