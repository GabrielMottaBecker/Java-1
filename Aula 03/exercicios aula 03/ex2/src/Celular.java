public class Celular {
    private String marca;
    private String modelo;
    private int capacidadeBateria;

    public Celular(String marca, String modelo, int capacidadeBateria){
    this.marca = marca;
    this.modelo = modelo;
    this.capacidadeBateria = capacidadeBateria;
    }

    public void ligar(){
        System.out.println("O celular ligou...");
    }

    public void desligar(){
        System.out.println("O celular desligou...");
    }

    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public int getCapacidadeBateria(){
        return capacidadeBateria;
    }
}
