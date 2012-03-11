package Exercicio2.Banco;

import java.io.Serializable;
/**
 *
 * @author Diego Mesquita, diego.mesquita@dce.ufpb.br
 *         Jessyca Ferreira, jessyca.ferreira@dce.ufpb.br
 * 
 */
public class Conta implements Serializable{

    private String numConta;
    private double saldo;
    
    public Conta(String numConta, double saldo) {
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public String getNumConta() {
        return this.numConta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta: "+numConta+ "\nSaldo:R$ "+ saldo;
    }
}
