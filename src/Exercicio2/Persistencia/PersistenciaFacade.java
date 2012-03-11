package Exercicio2.Persistencia;
/**
 *
 * @author Diego Mesquita, diego.mesquita@dce.ufpb.br
 *         Jessyca Ferreira, jessyca.ferreira@dce.ufpb.br
 * 
 */
public class PersistenciaFacade {

    Persistencia persist = new Persistencia();
    
    public double selecionarSaldo(String numConta) {
        return persist.selecionarSaldo(numConta);
    }
}
