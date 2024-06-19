public class Main {
    public static void main(String[] args) {
        Cliente gabriel = new Cliente();
        gabriel.setNome("Gabriel Souza");
        Conta cc = new ContaCorrente(gabriel);
        cc.depositar(100);

        Conta poupança = new ContaPoupança(gabriel);

        cc.transferir(100, poupança);
        cc.imprimirExtrato();
        poupança.imprimirExtrato();
    }
}

