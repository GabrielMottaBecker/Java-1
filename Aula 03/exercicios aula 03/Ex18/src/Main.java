//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Bicicleta bicicleta = new Bicicleta("Totem", "100", "X");
        System.out.println("Marca: " + bicicleta.getMarca());
        System.out.println("Tamanho da Roda: " + bicicleta.getTamanhoRoda());
        System.out.println("Modelo: " + bicicleta.getModelo());

    bicicleta.pedalar();
    bicicleta.freiar();
        }
    }
