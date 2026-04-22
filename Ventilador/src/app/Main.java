package app;

import java.util.Scanner;
import model.Ventilador;
import service.VentiladorService;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ventilador ventilador = new Ventilador(0, false);
        VentiladorService service = new VentiladorService();

        int opcao;

        do {
            System.out.println("==========MENU==========");
            System.out.println("1 - Mostrar Informacoes");
            System.out.println("2 - Colocar na tomada");
            System.out.println("3 - Aumentar velocidade");
            System.out.println("4 - Diminuir velocidade");
            System.out.println("5 - Tirar Da Tomada e Sair");

            opcao = sc.nextInt();

            switch (opcao){

                case 1:
                    service.mostrarInfo(ventilador);
                    break;
                case 2:
                    service.colocarNaTomada(ventilador);
                    break;
                case 3:
                    service.aumentarVelocidade(ventilador);
                    break;
                case 4:
                    service.diminuirVelocidade(ventilador);
                    break;
                case 5:
                    service.tirarDaTomada(ventilador);
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }
        } while(opcao!=5);

        }
    }