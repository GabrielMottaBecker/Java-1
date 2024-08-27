public class Cachorro {
    private String nome;
    private String raca;
    private int idade;

    public Cachorro(String nome, String raca, int idade){
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
    }

    public void latir(){
        System.out.println("Au Au AUu");
    }

    public void correr(){
        System.out.println("O " + nome + " está correndo...");
    }

    public String getNome(){
        return nome;
    }

    public String getRaca(){
        return raca;
    }

    public int getIdade(){
        return idade;
    }

}
