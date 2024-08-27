public class Animal {
    public String especie;
    public int idade;
    public String peso;

    public Animal(String especie, int idade, String peso) {
        this.especie = especie;
        this.idade = idade;
        this.peso = peso;
    }

    public String getEspecie() {
        return especie;
    }

    public int getIdade() {
        return idade;
    }

    public String getPeso() {
        return peso;
    }

    public void alimentar(){
        System.out.println("O " + getEspecie() + " está com fome. Alimente-o...");
    }

    public void dormir(){
        System.out.println("O " + getEspecie() + " está com sono. Deixe dormir...");
    }
}
