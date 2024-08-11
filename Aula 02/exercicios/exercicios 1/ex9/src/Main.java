import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite um número: ");
    int num1 = scanner.nextInt();
    System.out.println("Digite outro número: ");
    int num2 = scanner.nextInt();
    System.out.println("Informe a operação que deseja realizar: ");
    System.out.println("1 - Adição");
    System.out.println("2 - Subtração");
    System.out.println("3 - Multiplicação");
    System.out.println("4 - Divisão");
    int op = scanner.nextInt();

    int soma = num1 + num2;
    int sub = num1 - num2;
    int multi = num1 * num2;
    double div = (double) num1 / num2;

    switch (op){
        case 1:
            System.out.println("Adição: " + soma);
            break;
        case 2:
            System.out.println("Subtração: " + sub);
            break;
        case 3:
            System.out.println("Multiplicação: " + multi);
            break;
        case 4:
            System.out.println("Divisão: " + div);
            break;
        default:
            System.out.println("Opção Inválida...");
    }
    }
}