import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();

        int soma = num1 + num2;
        int sub = num1 - num2;
        int mult = num1 * num2;
        double div = (double) num1 / num2;

        System.out.println("Soma " + soma);
        System.out.println("Sub " + sub);
        System.out.println("Mult " + mult);
        System.out.println("Div " + div);
    }
}