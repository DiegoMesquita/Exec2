package Exercicio2.Exceptions;
/**
 *
 * @author Diego Mesquita, diego.mesquita@dce.ufpb.br
 *         Jessyca Ferreira, jessyca.ferreira@dce.ufpb.br
 * 
 */
public class BancoException extends RuntimeException{
    public BancoException(String msg){
        super(msg);
    }
}
