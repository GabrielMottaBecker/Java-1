import java.util.Scanner;

public class Empresa {
    public String nome;
    public String cnpj;
    public int numFuncionarios;

    public Empresa(String nome, String cnpj, int numFuncionarios) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.numFuncionarios = numFuncionarios;
    }

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public int getNumFuncionarios() {
        return numFuncionarios;
    }

    public void contratar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos funcionários quer contratar: ");
        int valor = scanner.nextInt();
        if(valor <= numFuncionarios || valor >= numFuncionarios){
            numFuncionarios += valor;
            System.out.println(valor + " novos funcionários contratados. Novo número de funcionários: " + this.getNumFuncionarios());
        }else{
            System.out.println("Número inválido...");
        }
    }

    public void demitir(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos funcionários quer demitir: ");
        int valor = scanner.nextInt();
        if(valor < numFuncionarios){
            numFuncionarios -= valor;
            System.out.println(valor + " funcionários demitidos. Novo número de funcionários: " + this.getNumFuncionarios());
        }else {
            System.out.println("Número inválido...");
        }
    }
}
