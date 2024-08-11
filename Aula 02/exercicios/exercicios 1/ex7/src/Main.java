import java.util.Scanner;

public class Main {
    public static int soma(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Digite um número inteiro: ");
        num1 = scanner.nextInt();
        System.out.println("Digite outro número inteiro: ");
        num2 = scanner.nextInt();
        int result = soma(num1, num2);
        System.out.println("A soma de " + num1 + " e " + num2 + " é: " + result);
    }
}
