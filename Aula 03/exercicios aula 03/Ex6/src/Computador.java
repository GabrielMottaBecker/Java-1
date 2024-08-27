public class Computador {
    private String processador;
    private String memoria;
    private String armazenamento;

    public Computador(String processador, String memoria, String armazenamento){
        this.processador = processador;
        this.memoria = memoria;
        this.armazenamento = armazenamento;
    }

    public void ligar(){
        System.out.println("O computador está ligando...");
    }

    public void desligar(){
        System.out.println("O computador está desligando...");
    }

    public String getProcessador(){
        return processador;
    }

    public String getMemoria(){
        return memoria;
    }

    public String getArmazenamento(){
        return armazenamento;
    }
}
