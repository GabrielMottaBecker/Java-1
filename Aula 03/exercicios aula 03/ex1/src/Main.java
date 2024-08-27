public class Main {
    public static void main(String[] args) {
        Livro meuLivro = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1178);

        System.out.println("Título: " + meuLivro.getTitulo());
        System.out.println("Autor: " + meuLivro.getAutor());
        System.out.println("Número de Páginas: " + meuLivro.getNumeroDePaginas());

        meuLivro.abrir();
        meuLivro.lerPagina();
        meuLivro.lerPagina();
        meuLivro.lerPagina();
    }
}