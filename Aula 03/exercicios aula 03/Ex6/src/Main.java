//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Computador meuComputador = new Computador("i7 9 Geração", "16gb RAM", "1TB");

        System.out.println("Processador: " + meuComputador.getProcessador());
        System.out.println("Memória: " + meuComputador.getMemoria());
        System.out.println("Armazenamento: " + meuComputador.getArmazenamento());

        meuComputador.ligar();
        meuComputador.desligar();
    }
}