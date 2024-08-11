import java.util.Scanner;

public class CalculaFatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro para calcular o fatorial: ");
        int numero = scanner.nextInt();

        int fatorialIterativo = fatorialIterativo(numero);
        System.out.println("Fatorial (iterativo) de " + numero + " é: " + fatorialIterativo);

        int fatorialRecursivo = fatorialRecursivo(numero);
        System.out.println("Fatorial (recursivo) de " + numero + " é: " + fatorialRecursivo);

        scanner.close();
    }

    public static int fatorialIterativo(int n) {
        int resultado = 1;

        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }

        return resultado;
    }

    public static int fatorialRecursivo(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * fatorialRecursivo(n - 1);
        }
    }
}
