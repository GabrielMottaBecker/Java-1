//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Jogo meujogo = new Jogo("Lol", "Moba", 20);

        System.out.println("Nome do jogo: " + meujogo.getNome());
        System.out.println("Gênero do jogo: " + meujogo.getGenero());
        System.out.println("Preço do jogo: " + meujogo.getPreco());

    meujogo.iniciar();
    meujogo.pausar();
    }
}