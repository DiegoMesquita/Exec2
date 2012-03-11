package Exercicio2.Persistencia;

import Exercicio2.Banco.Conta;
import java.util.Map;

/**
 *
 * @author Diego Mesquita, diego.mesquita@dce.ufpb.br
 *         Jessyca Ferreira, jessyca.ferreira@dce.ufpb.br
 * 
 */
public class PersistenciaFacade {

    private static PersistenciaFacade persistFacade;
    private Persistencia persist;

    public synchronized static PersistenciaFacade getInstance() {
        if (persistFacade == null) {
            persistFacade = new PersistenciaFacade();
        }
        return persistFacade;
    }

    public PersistenciaFacade() {
        persist = new Persistencia();
    }

    public double selecionarSaldo(String numConta) {
        return persist.selecionarSaldo(numConta);
    }
    
    public void salvarContas(Map<String,Conta> contas){
        persist.salvarContas(contas);
    }
    
    public Map<String, Conta> carregarContas() {
        return persist.carregarContas();
    } 
}
