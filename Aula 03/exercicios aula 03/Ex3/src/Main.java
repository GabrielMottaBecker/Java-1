
public class Main {
    public static void main(String[] args) {
    Pessoa minhaPessoa = new Pessoa("Gabriel", 17, 175);

    System.out.println("Nome: " + minhaPessoa.getNome());
    System.out.println("Idade: " + minhaPessoa.getIdade());
    System.out.println("Altura: " + minhaPessoa.getAltura());

    minhaPessoa.apresentacao();
    }
}