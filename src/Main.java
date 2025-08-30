public class Main {
    public static void main(String[] args) {
        BancoFacade bancoFacade = new BancoFacade("Banco Digital");

        Conta cc = bancoFacade.abrirContaCorrente("Davi");
        Conta poupanca = bancoFacade.abrirContaPoupanca("Maria");

        bancoFacade.depositar(cc, 1000);
        bancoFacade.transferir(cc, poupanca, 200);

        bancoFacade.mostrarContas();
    }
}