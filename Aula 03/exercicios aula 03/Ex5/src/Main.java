//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Cachorro meuCachorro = new Cachorro("Bidu", "Pitbull", 10);

    System.out.println("Nome: " + meuCachorro.getNome());
    System.out.println("Raca: " + meuCachorro.getRaca());
    System.out.println("Idade: " + meuCachorro.getIdade());

    meuCachorro.latir();
    meuCachorro.correr();
    }
}