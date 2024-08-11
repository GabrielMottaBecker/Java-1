import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int num = scanner.nextInt();

        if(num % 2 == 0){
            System.out.println("O número é par...");
        }else{
            System.out.println("O número é ímpar...");
        }
    }
}