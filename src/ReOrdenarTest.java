import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReOrdenarTest {

    @Test
    public void test_ordenarDesc_4213() {
        int entrada = 4213;
        int salidaEsperada = 4321;
        assertEquals(salidaEsperada, ReOrdenar.ordenarDesc(entrada));
    }

    @Test
    public void test_ordenarDesc_9870() {
        int entrada = 9870;
        int salidaEsperada = 9870;
        assertEquals(salidaEsperada, ReOrdenar.ordenarDesc(entrada));
    }

    @Test
    public void test_ordenarDesc_1023() {
        int entrada = 1023;
        int salidaEsperada = 3210;
        assertEquals(salidaEsperada, ReOrdenar.ordenarDesc(entrada));
    }
}
