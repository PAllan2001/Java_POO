package model;

import java.time.LocalDateTime;

public class Multa {

    private String placa;
    private String tipo;
    private String local;
    private LocalDateTime horario;

    public Multa(String placa, String tipo, String local) {
        this.placa = placa;
        this.tipo = tipo;
        this.local = local;
        this.horario = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Placa: " + placa +
                " | Infração: " + tipo +
                " | Local: " + local +
                " | Horário: " + horario;
    }
}
