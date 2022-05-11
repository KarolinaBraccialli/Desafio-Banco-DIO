package dio.desafio.banco;

public class Main {
    public static void main(String[] args) {

        Banco bancoDio = new Banco();

        bancoDio.setNomeBanco("Digital DIO");
        bancoDio.criarCliente("Karolina");
        bancoDio.criarCliente("Felipe");
        bancoDio.criarCliente("Raphael");

        bancoDio.listarClientes();

        Cliente karolina = bancoDio.getCliente(0);
        Cliente felipe = bancoDio.getCliente(1);
        Cliente raphael = bancoDio.getCliente(2);

        karolina.criarContaCorrente();
        karolina.criarContaPoupanca();

        felipe.criarContaPoupanca();
        felipe.criarContaCorrente();

        raphael.criarContaCorrente();
        raphael.criarContaPoupanca();

        karolina.getContaCorrente().depositar(200);
        raphael.getContaPoupanca().depositar(100);
        karolina.getContaCorrente().transferir(100, felipe.getContaCorrente());
        karolina.getContaCorrente().extratoComum();
        felipe.getContaCorrente().extratoComum();
        raphael.getContaPoupanca().extratoComum();


    }
}
