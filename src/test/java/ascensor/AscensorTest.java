package ascensor;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

public class AscensorTest {

    Ascensor a;

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Before
    public void before() {
        a = new Ascensor();
    }

    @Test
    public void VerificarAscensorPiso1() {
        //Preparacion de la prueba
        Ascensor a = new Ascensor();

        assertEquals("1", a.IniciarAscensor());
    }

    @Test
    public void VerificarAscensorPisoDestino() throws Exception {

        exception.expect(Exception.class);
        a.PisoDestinoDiferentePisoPersona(2);
    }
    
    @Test
    public void VerificarDesplazamientoAscensor() {
        //Preparacion de la prueba
        Ascensor a = new Ascensor();

        assertEquals("0", a.LlegadaAscensor(1));
        assertEquals("1", a.LlegadaAscensor(2));
        assertEquals("2", a.LlegadaAscensor(3));
    }

}
