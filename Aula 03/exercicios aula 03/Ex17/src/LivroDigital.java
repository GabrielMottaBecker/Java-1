public class LivroDigital {
    public String titulo;
    public String autor;
    public String tamanhoArquivo;

    public LivroDigital(String titulo, String autor, String tamanhoArquivo) {
        this.titulo = titulo;
        this.autor = autor;
        this.tamanhoArquivo = tamanhoArquivo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getTamanhoArquivo() {
        return tamanhoArquivo;
    }

    public void abrir(){
        System.out.println("O livro " + getTitulo() + " está aberto...");
    }

    public void fechar(){
        System.out.println("O livro " + getTitulo() + " está fechado...");
    }
}
