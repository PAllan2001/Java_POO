package model;

public class Veiculo {

    private String placa;
    private double velocidade;
    private String tipo;

    public Veiculo(String placa, double velocidade, String tipo) {
        this.placa = placa;
        this.velocidade = velocidade;
        this.tipo = tipo;
    }

    public String getPlaca() {
        return placa;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public String getTipo() {
        return tipo;
    }
}
