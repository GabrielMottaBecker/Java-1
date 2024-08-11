import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite uma temperatura: ");
    int temp = scanner.nextInt();
    System.out.println("Qual conversão deseja realizar: ");
    System.out.println("1 - De Celsius para Fahrenheit ");
    System.out.println("2 - De Fahrenheit para Celsius ");
    int op = scanner.nextInt();

    int CtF = (temp * 9/5) + 32;
    int FtC = (temp - 32) * 5/9;

    switch (op){
        case 1:
            System.out.println("De Celsius para Fahrenheit: " + CtF + " Fahrenheit");
            break;
        case 2:
            System.out.println("De Fahrenheit para Celsius: " + FtC + " Celsius");
            break;
        default:
            System.out.println("Opção inválida...");
    }
    }
}