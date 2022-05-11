package dio.desafio.banco;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nomeCliente;
    private int cpfCliente;
    protected ContaCorrente contaCorrente;
    protected ContaPoupança contaPoupanca;


    public void criarContaCorrente(){
        this.contaCorrente= new ContaCorrente(this);
    }

    public void criarContaPoupanca(){
      this.contaPoupanca = new ContaPoupança(this);
    }

    public ContaCorrente getContaCorrente() {
        return contaCorrente;
    }

    public ContaPoupança getContaPoupanca() {
        return contaPoupanca;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(int cpfCliente) {
        this.cpfCliente = cpfCliente;
    }
}
