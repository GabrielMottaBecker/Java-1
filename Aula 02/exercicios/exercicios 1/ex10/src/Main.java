import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite um número: ");
    int num1 = scanner.nextInt();

    if(ehPrimo(num1)){
        System.out.println(num1 + " é um número primo...");
    }else{
        System.out.println(num1 + " não é um número primo...");
    }
    }
    public static boolean ehPrimo(int num1){
        if(num1 <=1){
            return false;
        }
        for (int i=2; i<=Math.sqrt(num1); i++){
            if(num1 % i == 0){
                return false;
            }
        }
        return true;
    }
}