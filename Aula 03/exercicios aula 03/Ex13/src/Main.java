//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Time meutime = new Time("São Paulo Futebol Clube", "Rogério Ceni", 24);

        System.out.println("Nome do time: " + meutime.getNome());
        System.out.println("Técnico do time: " + meutime.getTecnico());
        System.out.println("Número de Jogadores: " + meutime.getNumJogadores());

        meutime.remove();
        meutime.adicionar();
    }
}