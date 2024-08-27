public class Pessoa {
    private String nome;
    private int idade;
    private int altura;

    public Pessoa(String nome, int idade, int altura){
    this.nome = nome;
    this.idade = idade;
    this.altura = altura;
    }

    public void apresentacao(){
        System.out.println("Meu nome é " + nome + " tenho " + idade + " anos e " + altura + " de altura");
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public int getAltura(){
        return altura;
    }
}
