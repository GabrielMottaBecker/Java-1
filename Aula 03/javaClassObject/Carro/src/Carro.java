public class Carro {
    public String modelo;
    public String marca;
    public int ano;
    public String cor;
    public String potencia;
    public int preco;
    public String veloMax;

    public Carro(String modelo, String marca, int ano, String cor, String potencia, int preco, String veloMax) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.cor = cor;
        this.potencia = potencia;
        this.preco = preco;
        this.veloMax = veloMax;
    }

    public String getModelo(){
        return modelo;
    }

    public String getMarca(){
        return marca;
    }

    public int getAno(){
        return ano;
    }

    public String getCor(){
        return cor;
    }

    public String getPotencia(){
        return potencia;
    }

    public int getPreco(){
        return preco;
    }

    public String getVeloMax(){
        return veloMax;
    }
}