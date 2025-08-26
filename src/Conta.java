public abstract class Conta implements OperacaoBancaria{

    public abstract void imprimirExtrato();

    private static final int AGENCIA_PADRAO =1;
    private static int SEQUENCIAL =1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void depositar(double valor){
        saldo += valor;
    }

    @Override
    public void sacar(double valor){
        saldo -= valor;
    }

    @Override
    public void transferir(double valor, OperacaoBancaria contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
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

    protected void ImprimirInfomacao(){
        System.out.println("Titular: " + cliente.getNome());
        System.out.println("Agencia: " + getAgencia());
        System.out.println("Número: " + getNumero());
        System.out.println("Saldo: " + getSaldo());
    }
}
