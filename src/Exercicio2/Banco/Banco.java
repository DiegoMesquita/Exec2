package Exercicio2.Banco;

import Exercicio2.Exceptions.BancoException;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author Diego Mesquita, diego.mesquita@dce.ufpb.br
 *         Jessyca Ferreira, jessyca.ferreira@dce.ufpb.br
 * 
 */
public class Banco {

    private Map<String, Conta> contasMap;

    public Banco() {
        contasMap = new HashMap<String, Conta>();
    }

    public void criarConta(Conta conta) {       
        contasMap.put(conta.getNumero(), conta);
    }

    public Conta getConta(String numConta) {

        Conta conta = contasMap.get(numConta);
        if (conta==null) {
            throw new BancoException("Conta Inexistente.");
        }
        return conta;
    }

    public Map<String, Conta> getAllContas() {
        return contasMap;
    }
}
