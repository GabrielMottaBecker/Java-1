public class Veiculo {
    public String tipo;
    public String placa;
    public String cor;

    public Veiculo(String tipo, String placa, String cor){
        this.tipo = tipo;
        this.placa = placa;
        this.cor = cor;
    }

    public void abastecer(){
        System.out.println("O " + tipo + " está abastecendo...");
    }

    public void lavar(){
        System.out.println("O " + tipo + " está lavando...");
    }

    public String getTipo(){
        return tipo;
    }

    public String getPlaca(){
        return placa;
    }

    public String getCor(){
        return cor;
    }
}
