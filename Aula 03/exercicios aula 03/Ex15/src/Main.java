//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Loja loja = new Loja("Nike", "Rua 1 de Junho", 44998877);

        System.out.println("Nome: " + loja.getNome());
        System.out.println("Endereço: " + loja.getEndereco());
        System.out.println("Telefone: " + loja.getTelefone());

    loja.abrir();
    loja.fechar();
    }
}