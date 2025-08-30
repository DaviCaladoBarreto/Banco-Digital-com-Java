import java.util.ArrayList;

public class BancoFacade {
    private Banco banco;

    public BancoFacade(String nomeBanco) {
        this.banco = new Banco();
        this.banco.setNome(nomeBanco);
        this.banco.setContas(new ArrayList<>());
    }

    public Conta abrirContaCorrente(String nomeCliente) {
        Cliente cliente = new Cliente();
        cliente.setNome(nomeCliente);

        Conta conta = new ContaCorrente(cliente);
        banco.getContas().add(conta);

        return conta;
    }

    public Conta abrirContaPoupanca(String nomeCliente) {
        Cliente cliente = new Cliente();
        cliente.setNome(nomeCliente);

        Conta conta = new ContaPoupanca(cliente);
        banco.getContas().add(conta);

        return conta;
    }

    public void depositar(Conta conta, double valor) {
        conta.depositar(valor);
    }

    public void sacar(Conta conta, double valor) {
        conta.sacar(valor);
    }

    public void transferir(Conta origem, Conta destino, double valor) {
        origem.transferir(valor, destino);
    }

    public void mostrarContas() {
        for (Conta conta : banco.getContas()) {
            conta.imprimirExtrato();
        }
    }
}
