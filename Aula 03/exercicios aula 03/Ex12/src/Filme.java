public class Filme {
    public String titulo;
    public String diretor;
    public String duracao;

    public Filme(String titulo, String diretor, String duracao) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public String getDuracao() {
        return duracao;
    }

    public void iniciar(){
        System.out.println("O Filme " + titulo + " começou...");
    }

    public void parar(){
        System.out.println("O Filme " + titulo + " parou restando 45 minutos para o fim...");
    }
}
