package service;

import br.com.alura.leilao.dao.LeilaoDao;
import br.com.alura.leilao.service.FinalizarLeilaoService;
import org.junit.Test;
import org.mockito.Mock;

public class FinalizarLeilaoServiceTest {

    private FinalizarLeilaoService service;

    @Mock
    private LeilaoDao leilaoDao;

    @Test
    void deveriaFinalizarUmLeilao() {
        service = new FinalizarLeilaoService(leilaoDao);
    }
}
