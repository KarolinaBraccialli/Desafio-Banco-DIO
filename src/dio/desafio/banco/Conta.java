package dio.desafio.banco;

public class Conta {
    private static int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public void sacar(double valor){
        if (this.saldo >= valor){
            this.saldo -=valor;
        } else System.out.println("Saldo insuficiente");
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void transferir(double valor, Conta contaDestino){
        if (this.saldo >= valor){
            this.sacar(valor);
            contaDestino.depositar(valor);
        } else System.out.println("Saldo insuficiente");
    }

    protected void extratoComum(){
        System.out.printf("Titular: %s%n", this.cliente.getNomeCliente());
        System.out.printf("Agencia: %d%n", this.agencia);
        System.out.printf("Numero da conta: %d%n", this.numero);
        System.out.printf("Saldo: %.2f%n", this.saldo);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
}
