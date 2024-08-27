//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Filme meufilme = new Filme("Homem Aranha", "Jose", "2 horas");

        System.out.println("Título: " + meufilme.getTitulo());
        System.out.println("Diretor: " + meufilme.getDiretor());
        System.out.println("Duração: " + meufilme.getDuracao());

        meufilme.iniciar();
        meufilme.parar();
    }
}