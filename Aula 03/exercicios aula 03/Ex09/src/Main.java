public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Arroz", 20.50, 100);

        produto.exibirInformacoes();

        produto.aumentarEstoque(50);
        System.out.println("Estoque após aumento: " + produto.getQuantidadeEstoque());

        produto.diminuirEstoque(30);
        System.out.println("Estoque após diminuição: " + produto.getQuantidadeEstoque());
    }
}