package Exercicio2.Persistencia;

import Exercicio2.Banco.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;
/**
 *
 * @author Diego Mesquita, diego.mesquita@dce.ufpb.br
 *         Jessyca Ferreira, jessyca.ferreira@dce.ufpb.br
 * 
 */
public class Persistencia {
    
    public Persistencia(){
        
    }

    public void salvarContas(Map<String, Conta> contas) {        
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream("arquivo.txt"));
            out.writeObject(contas);
            out.close();           
        } catch (IOException io) {
            io.getMessage();
        }
    }

    public Map<String, Conta> carregarContas() {
        Map<String, Conta> contas = null;
        ObjectInputStream in = null;        
        try {
            in = new ObjectInputStream(new FileInputStream("arquivo.txt"));
            contas = (Map<String, Conta>) in.readObject();
            in.close();
        } catch (ClassNotFoundException cnf) {
            cnf.getMessage();
        } catch (FileNotFoundException fnf) {
            fnf.getMessage();
        } catch (IOException io) {
            io.getMessage();
        }
        return contas;
    }
    
    public double selecionarSaldo(String numConta){
        Map<String, Conta> contas = carregarContas();
        Conta conta = contas.get(numConta);
        return conta.getSaldo();
    }
}