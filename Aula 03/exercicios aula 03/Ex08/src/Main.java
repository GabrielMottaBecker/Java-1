//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Professor prof = new Professor("Gerson", "Matemática" , 5000.00);

        System.out.println("Nome: " + prof.getNome());
        System.out.println("Disciplina: " + prof.getDisciplina());
        System.out.println("Salário: " + prof.getSalario());

    prof.darAula();
    prof.corrigirProvas();
    }
}