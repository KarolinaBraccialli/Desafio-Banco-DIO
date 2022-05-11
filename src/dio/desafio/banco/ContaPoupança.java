package dio.desafio.banco;

public class ContaPoupança extends Conta{

    public ContaPoupança(Cliente cliente){
        super(cliente);
    }

    @Override
    protected void extratoComum() {
        System.out.println("### Extrato Conta Poupança ###");
        super.extratoComum();
    }
}
