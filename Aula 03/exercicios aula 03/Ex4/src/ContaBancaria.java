public class ContaBancaria {
    private String numConta;
    private double saldo;

    public ContaBancaria(String numConta, double saldoInicial){
        this.numConta = numConta;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor){
        if (valor > 0){
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        }else{
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor){
        if (valor > 0 && valor <= saldo){
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        }else{
            System.out.println("Saldo insuficiente ou valor de saque inválido.");
        }
    }

    public String getNumConta(){
        return numConta;
    }

    public double getSaldo(){
        return saldo;
    }
}
