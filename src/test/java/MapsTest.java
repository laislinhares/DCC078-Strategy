import org.example.Pessoa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MapsTest {

    @Test
    public void deveCalcularTempoCarro() {
        Pessoa pessoa = new Pessoa();
        pessoa.calcularTempoCarro(10);
        assertEquals(50, pessoa.getTempo());
    }

    @Test
    public void deveCalcularTempoTransportePublico() {
        Pessoa pessoa = new Pessoa();
        pessoa.calcularTempoTransportePublico(10);
        assertEquals(80, pessoa.getTempo());
    }

    @Test
    public void deveCalcularTempoBicicleta() {
        Pessoa pessoa = new Pessoa();
        pessoa.calcularTempoBicicleta(10);
        assertEquals(110, pessoa.getTempo());
    }

    @Test
    public void deveCalcularTempoAndando() {
        Pessoa pessoa = new Pessoa();
        pessoa.calcularTempoApe(10);
        assertEquals(150, pessoa.getTempo());
    }
}
