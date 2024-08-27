
public class Main {
    public static void main(String[] args) {
    ContaBancaria minhaConta = new ContaBancaria("112233", 5000);

        System.out.println("Conta: " + minhaConta.getNumConta());
        System.out.println("Saldo Inicial: " + minhaConta.getSaldo());

        minhaConta.depositar(500.00);
        System.out.println("Saldo após depósito: R$ " + minhaConta.getSaldo());

        minhaConta.sacar(200.00);
        System.out.println("Saldo após saque: R$ " + minhaConta.getSaldo());
    }
}