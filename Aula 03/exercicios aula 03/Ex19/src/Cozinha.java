public class Cozinha {
    public String tipo;
    public int qntdPessoas;
    public String cor;

    public Cozinha(String tipo, int qntdPessoas, String cor) {
        this.tipo = tipo;
        this.qntdPessoas = qntdPessoas;
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public int getQntdPessoas() {
        return qntdPessoas;
    }

    public String getCor() {
        return cor;
    }

    public void cozinhar(){
        System.out.println("Estão cozinhando...");
    }

    public void limpar(){
        System.out.println("Estão limpando a cozinha...");
    }
}
