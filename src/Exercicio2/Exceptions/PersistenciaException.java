package Exercicio2.Exceptions;
/**
 *
 * @author Diego Mesquita, diego.mesquita@dce.ufpb.br
 *         Jessyca Ferreira, jessyca.ferreira@dce.ufpb.br
 * 
 */
public class PersistenciaException extends RuntimeException {
    public PersistenciaException(String msg){
        super(msg);
    }
}
