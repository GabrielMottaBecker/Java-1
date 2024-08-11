import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numale = random.nextInt(100) + 1;
        int tent = 0;
        int numtent = 0;
        boolean acertou = false;

        System.out.println("Bem-Vindo ao jogo de Adivinhação!");
        System.out.println("Tente adivinhar um número que estou pensando entre 1 a 100:");

        while (!acertou){
            System.out.print("Digite seu palpite: ");
            tent = scanner.nextInt();
            numtent++;

            if(tent < numale){
                System.out.println("Muito baixo! Tente novamente...");
            }else if(tent > numale){
                System.out.println("Muilto alto! Tente novamente...");
            }else{
                acertou = true;
                System.out.println("Parabens! Você adivinhou o número em " + numtent + " tentativas...");
            }
        }

    scanner.close();
    }
}