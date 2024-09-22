import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Cliente cliente = new Cliente("Cliente 01", new Endereco("Rua 10", 100, 1001));
        System.out.println(cliente);

        Produto produto = new Produto("1", "Produto 01", 30.50);
        System.out.println(produto);

        Endereco endereco = new Endereco("Rua 01", 1122, 1001);
        System.out.println(endereco);

        ItemPedido itemPedido = new ItemPedido("Produto 01", 3);
        System.out.println(itemPedido);

        Pedido pedido = new Pedido(10, LocalDate.now());
        System.out.println(pedido);

        pedido.calcularValorTotal();
    }
}
