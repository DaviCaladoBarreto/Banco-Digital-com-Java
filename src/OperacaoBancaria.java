public interface OperacaoBancaria {
    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, OperacaoBancaria contaDestino);

    void imprimirExtrato();
}
