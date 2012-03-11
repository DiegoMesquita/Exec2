package Exercicio2.Persistencia;

import Exercicio2.Banco.BancoFacade;
import Exercicio2.Banco.Conta;
import java.util.Map;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author Diego Mesquita, diego.mesquita@dce.ufpb.br
 *         Jessyca Ferreira, jessyca.ferreira@dce.ufpb.br
 * 
 */
public class PersistenciaFacadeTest {

    private PersistenciaFacade persistFacade;
    private BancoFacade bancoFacade;
    private Conta conta1;
    
    public PersistenciaFacadeTest() {
        persistFacade = PersistenciaFacade.getInstance();
        bancoFacade = BancoFacade.getInstance();
        conta1 = new Conta("1001",200);
    }

    @Test
    public void testSelecionarSaldo() {
        System.out.println("selecionarSaldo");
        bancoFacade.criarConta(conta1);
        double result = persistFacade.selecionarSaldo("1001");
        double resultExpert = 200;
        assertEquals(result, resultExpert,200);
    }

    @Test
    public void testSalvarContas() {
        System.out.println("salvarContas");
        bancoFacade.criarConta(conta1);
        Map<String, Conta> contas = bancoFacade.getAllContas();
        persistFacade.salvarContas(contas);
        assertNotNull(contas);
    }

    @Test
    public void testCarregarContas() {
        System.out.println("carregarContas");
        bancoFacade.criarConta(conta1);
        Map<String, Conta> contas = persistFacade.carregarContas();
        assertTrue(contas.containsKey(conta1.getNumConta()));
    }
}