//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    LivroDigital livro = new LivroDigital("Diário de um Banana", "Jeff Kinney", "125Gb");

        System.out.println("Título: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Tamanho Arquivo: " + livro.getTamanhoArquivo());

    livro.abrir();
    livro.fechar();
    }
}