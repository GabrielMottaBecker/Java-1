import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o tipo de notificação (email / sms): ");
        String tipo = scanner.nextLine();

        Notificacao notificacao;

        if (tipo.equalsIgnoreCase("email")){
            notificacao = new EmailNotificacao();
        }else if (tipo.equalsIgnoreCase("sms")){
            notificacao = new SMSNotificacao();
        }else{
            System.out.println("Tipo de notificação desconhecido.");
            scanner.close();
            return;
        }

        System.out.println("Digite a mensagem a ser enviada: ");
        String mensagem = scanner.nextLine();

        notificacao.enviar(mensagem);

        scanner.close();
    }
}