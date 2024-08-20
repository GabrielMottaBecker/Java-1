import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Carro bmwAzul = new Carro("320i", "BMW", 2024, "Roxo", "500cv", 180000, "300KM/h");


        System.out.println("Modelo: " + bmwAzul.modelo);
        System.out.println("Marca: " + bmwAzul.marca);
        System.out.println("Ano: " + bmwAzul.ano);
        System.out.println("Cor: " + bmwAzul.cor);
        System.out.println("Potência: " + bmwAzul.potencia);
        System.out.println("Preço: " + bmwAzul.preco);
        System.out.println("Velocidade Máxima: " + bmwAzul.veloMax);

    }
}