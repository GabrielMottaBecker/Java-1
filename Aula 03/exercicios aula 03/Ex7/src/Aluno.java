import com.sun.source.tree.BreakTree;

public class Aluno {
    private String nome;
    private int matricula;
    private String curso;
    private double media;

    public Aluno(String nome, int matricula, String curso, double media){
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.media = media;
    }

    public void calcMedia(){
        media = (5 + 8 + 7) / 3;
    }

    public String getNome(){
        return nome;
    }

    public int getMatricula(){
        return matricula;
    }

    public String getCurso(){
        return curso;
    }

    public double getMedia(){
        return media;
    }
}
