package Exercicio2.Banco;

import Exercicio2.Persistencia.Persistencia;
import java.util.Map;
/**
 *
 * @author Diego Mesquita, diego.mesquita@dce.ufpb.br
 *         Jessyca Ferreira, jessyca.ferreira@dce.ufpb.br
 * 
 */
public class BancoFacade {

    private Banco banco;
    private Persistencia persist;
    private static BancoFacade bancoFacade;
    
    //Singleton
    public synchronized static BancoFacade getInstance(){
        if(bancoFacade == null){
            bancoFacade = new BancoFacade();
        }
        return bancoFacade;
    }
    
    public BancoFacade(){
        persist = new Persistencia();
        banco = new Banco();
    }
    
    public void criarConta(Conta conta) {
        banco.criarConta(conta);
    }

    public Conta getConta(String numConta) {
        return banco.getConta(numConta);
    }
    
    public Map<String,Conta> getAllContas(){
        return banco.getAllContas();
    }
}