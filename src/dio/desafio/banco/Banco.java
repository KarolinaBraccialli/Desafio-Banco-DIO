package dio.desafio.banco;
import java.util.ArrayList;
import java.util.List;

public class Banco {
    protected List<Cliente> listaClientes = new ArrayList<>();
    protected String nomeBanco;

    public void criarCliente(String nomeCliente){
        Cliente cliente = new Cliente();
        cliente.setNomeCliente(nomeCliente);
        listaClientes.add(cliente);
    }

    public void listarClientes(){
        System.out.println("Clientes do banco " + nomeBanco + ":");
        listaClientes.stream().forEach(c -> System.out.println(c.getNomeCliente()));
    }

    public Cliente getCliente(int numeroCliente){
        return listaClientes.get(numeroCliente);
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }
}
