package service;
import model.Ventilador;

    public class VentiladorService {
    private static final int VELOCIDADE_MAX = 3;

    public void mostrarInfo(Ventilador v) {
        System.out.println("Velocidade: " + v.getVelocidade());
        System.out.println("Esta na tomada? " + v.isNaTomada());
    }
    public void colocarNaTomada(Ventilador v) {
        if (v.isNaTomada()) {
            System.out.println("Ja esta na tomada");
            return;
        }

        v.setNaTomada(true);
        System.out.println("Esta na tomada");
    }
    public void tirarDaTomada(Ventilador v) {
        if (!v.isNaTomada()) {
            System.out.println("Ventilador fora da tomada");
            return;
        }
        v.setNaTomada(false);
        v.setVelocidade(0);
        System.out.println("Ventilador desligado");
    }
    public void aumentarVelocidade(Ventilador v) {
        if (!v.isNaTomada()) {
            System.out.println("Ventilador fora da tomada");
        }
        if (v.getVelocidade() >= VELOCIDADE_MAX) {
            System.out.println("Velocidade maxima ");
            return;
        }
        if (v.isNaTomada()) {
            v.aumentarVelocidade();
            System.out.println("Velocidade aumentada");
        }
    }
    public void diminuirVelocidade(Ventilador v) {
        if (!v.isNaTomada()) {
            System.out.println("Ventilador fora da tomada");
            return;
        }
        if(v.getVelocidade() <= 0) {
            System.out.println("Ventilador desligado");
            return;
        }
        v.diminuirVelocidade();
        System.out.println("Velocidade diminuida");

    }

    }
