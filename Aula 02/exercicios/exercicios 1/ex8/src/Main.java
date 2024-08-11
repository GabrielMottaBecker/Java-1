import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        int idade;

        System.out.println("Digite seu nome: ");
        nome = scanner.next();
        System.out.println("Digite sua idade: ");
        idade = scanner.nextInt();

        System.out.println("O nome digitado é: " +nome);
        System.out.println("A idade digitada é: " +idade);
    }
}