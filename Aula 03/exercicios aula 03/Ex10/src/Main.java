//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Veiculo veiculo = new Veiculo("SUV", "AAA333", "Roxo");

        System.out.println("Tipo: " + veiculo.getTipo());
        System.out.println("Placa: " + veiculo.getPlaca());
        System.out.println("Cor: " + veiculo.getCor());

        veiculo.abastecer();
        veiculo.lavar();
    }
}