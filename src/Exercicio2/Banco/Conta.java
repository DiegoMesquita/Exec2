package Exercicio2.Banco;

import java.io.Serializable;
/**
 *
 * @author Diego Mesquita, diego.mesquita@dce.ufpb.br
 *         Jessyca Ferreira, jessyca.ferreira@dce.ufpb.br
 * 
 */
public class Conta implements Serializable{

    private double saldo;
    private String numero;

    public Conta(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getNumero() {
        return this.numero;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta: "+numero+ "\nSaldo:R$ "+ saldo;
    }
}
