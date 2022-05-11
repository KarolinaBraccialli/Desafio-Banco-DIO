package dio.desafio.banco;

public class ContaCorrente  extends Conta{
    public ContaCorrente(Cliente cliente){
        super(cliente);
    }

    @Override
    protected void extratoComum() {
        System.out.println("### Extrato Conta Corrente ###");
        super.extratoComum();
    }
}
