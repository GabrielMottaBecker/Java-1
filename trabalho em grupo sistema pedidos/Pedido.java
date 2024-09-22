import java.time.LocalDate;

public class Pedido {
    private int numero;
    private LocalDate dataHora;

    public Pedido(int numero, LocalDate dataHora) {
        this.numero = numero;
        this.dataHora = dataHora;
    }

    public int getNumero() {
        return numero;
    }

    public LocalDate getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDate dataHora) {
        this.dataHora = dataHora;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void calcularValorTotal(){
        System.out.println("O valor total é de R$ 91,50");
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "numero=" + numero +
                ", dataHora=" + dataHora +
                '}';
    }
}
