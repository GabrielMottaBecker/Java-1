//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Celular meuCelular = new Celular("Iphone", "X Pro Max", 80);

    System.out.println("Marca: " + meuCelular.getMarca());
    System.out.println("Modelo: " + meuCelular.getModelo());
    System.out.println("Capacidade da Bateria: " + meuCelular.getCapacidadeBateria());

    meuCelular.ligar();
    meuCelular.desligar();
    }
}