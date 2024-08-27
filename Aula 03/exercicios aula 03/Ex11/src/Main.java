//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Cidade cidade = new Cidade("Palotina", 40000, "Paraná");

        System.out.println("Nome da Cidade: " + cidade.getNome());
        System.out.println("População: " + cidade.getPopulacao());
        System.out.println("Estado: " + cidade.getEstado());

        cidade.aumentar();
        cidade.diminuir();
    }
}