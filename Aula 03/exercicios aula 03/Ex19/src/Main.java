//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Cozinha cozinha = new Cozinha("Restaurante", 100, "Rosa");

        System.out.println("Tipo: " + cozinha.getTipo());
        System.out.println("Quantidade de pessoas: " + cozinha.getQntdPessoas());
        System.out.println("Cor: " + cozinha.getCor());

    cozinha.cozinhar();
    cozinha.limpar();
    }
}