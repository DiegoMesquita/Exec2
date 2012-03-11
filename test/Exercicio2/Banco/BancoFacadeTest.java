package Exercicio2.Banco;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author Diego Mesquita, diego.mesquita@dce.ufpb.br
 *         Jessyca Ferreira, jessyca.ferreira@dce.ufpb.br
 * 
 */
public class BancoFacadeTest {
    
    private BancoFacade bancoFacade;
        
    public BancoFacadeTest() {
        bancoFacade = BancoFacade.getInstance();
    }

    @Test
    public void testCriarConta() {
        System.out.println("criarConta");
        Conta conta = new Conta("10",200);
        bancoFacade.criarConta(conta);
        assertNotNull(conta);
    }

    @Test
    public void testGetConta() {
        System.out.println("getConta");
        assertNotNull(bancoFacade.getConta("10"));
    }

    @Test
    public void testGetAllContas() {
        System.out.println("getAllContas");
        Conta conta = new Conta("10",200);
        bancoFacade.criarConta(conta);
        Conta conta1 = new Conta("11", 40000);
        bancoFacade.criarConta(conta1);
        int result = bancoFacade.getAllContas().size();
        int resultExpert = 2;
        assertEquals(result, resultExpert);
    }
}
