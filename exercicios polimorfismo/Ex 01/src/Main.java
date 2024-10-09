//Implemente uma classe Forma com um método calcularArea(). Crie subclasses Circulo e Retangulo,
// cada uma com sua própria implementação de calcularArea().//

public class Main {
    public static void main(String[] args) {
        Forma forma = new Forma();
        forma.calcularArea();
        Retangulo retangulo = new Retangulo();
        retangulo.calcularArea();

        Circulo circulo = new Circulo();
        circulo.calcularArea();
    }
}