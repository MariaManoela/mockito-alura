package service;

import br.com.alura.leilao.service.FinalizarLeilaoService;
import org.junit.Test;

public class FinalizarLeilaoServiceTest {

    private FinalizarLeilaoService service;

    @Test
    void deveriaFinalizarUmLeilao() {
        service = new FinalizarLeilaoService();
    }
}
