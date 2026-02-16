package model;

public class Radar {

    private String localizacao;

    public Radar(String localizacao) {
        this.localizacao = localizacao;
    }

    public Multa verificarVeiculo(Veiculo v) {

        double limiteMax;
        double limiteMin;

        if (v.getTipo().equalsIgnoreCase("caminhao")) {
            limiteMax = 90;
            limiteMin = 55;
        } else {
            limiteMax = 110;
            limiteMin = 55;
        }

        double velocidade = v.getVelocidade();

        if (velocidade > limiteMax + 10) {
            return new Multa(v.getPlaca(), "Multa GRAVE", localizacao);
        }

        else if (velocidade > limiteMax) {
            return new Multa(v.getPlaca(), "Multa LEVE", localizacao);
        }

        else if (velocidade < limiteMin) {
            return new Multa(v.getPlaca(), "Abaixo da velocidade mínima", localizacao);
        }

        return null;
    }
}
