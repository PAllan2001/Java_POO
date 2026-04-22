package model;

public class Ventilador {
    private int velocidade;
    private boolean naTomada;

    public Ventilador(int velocidade, boolean naTomada) {
        this.velocidade = velocidade;
        this.naTomada = naTomada;

    }

    public void aumentarVelocidade() {
        this.velocidade++;
    }

    public void diminuirVelocidade() {
        this.velocidade--;
    }

    public int getVelocidade() {
        return this.velocidade;
    }

    public int setVelocidade(int velocidade) {
        this.velocidade = velocidade;
        return velocidade;
    }

    public boolean isNaTomada() {
        return this.naTomada;
    }
    public void setNaTomada(boolean naTomada) {
        this.naTomada = naTomada;
    }

}
