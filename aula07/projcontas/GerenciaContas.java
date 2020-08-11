package projcontas;

import java.util.ArrayList;

public class GerenciaContas {

    private ArrayList<Conta> listaContas;

    public GerenciaContas(){
        listaContas = new ArrayList<>();
    }

    public void novaConta(Conta conta){
        listaContas.add(conta);
    }

    public String getInfo(int numeroConta){
        for (Conta c : listaContas) {
            if (c.getNumero() == numeroConta) {
                return c.exibir();
            }
        }
        return ("Conta não encontrada.");
    }

    public String fazSaque(int numeroConta, double valor){
        for (Conta c : listaContas) {
            if (c.getNumero() == numeroConta) {
                if (c.saque(valor)){
                    return ("Saque efetuado com sucesso!");
                } else {
                    return("Saque não efetuado!");
                }
            }
        }
        return ("Conta não encontrada!");
    }

    public String fazDeposito(int numeroConta, double valor){
        for (Conta c : listaContas) {
            if (c.getNumero() == numeroConta) {
                if (c.depositar(valor)){
                    return ("Depósito efetuado com sucesso!");
                } else {
                    return("Depósito não efetuado!");
                }
            }
        }
        return ("Conta não encontrada!");
    }

}