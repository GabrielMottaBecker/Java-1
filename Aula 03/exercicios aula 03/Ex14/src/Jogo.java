public class Jogo {
    public String nome;
    public String genero;
    public double preco;

    public Jogo(String nome, String genero, double preco) {
        this.nome = nome;
        this.genero = genero;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public double getPreco() {
        return preco;
    }

    public void iniciar(){
        System.out.println("O " + getNome() + " iniciou...");
    }

    public void pausar(){
        System.out.println("O " + getNome() + " está pausado...");
    }
}
