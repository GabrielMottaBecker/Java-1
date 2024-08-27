//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Empresa empresa = new Empresa("BagriLTDA", "01050908", 5000);

        System.out.println("Nome da Empresa: " + empresa.getNome());
        System.out.println("CNPJ: " + empresa.getCnpj());
        System.out.println("Número de funcionários: " + empresa.getNumFuncionarios());

    empresa.contratar();
    empresa.demitir();
    }
}