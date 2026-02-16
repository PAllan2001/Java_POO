import model.*;
import service.SistemaRadar;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SistemaRadar sistema = new SistemaRadar();


        Radar radar = new Radar("RODOVIA ANHANGUERA KM 99");

        int opcao;

        do {
            System.out.println("\n===== RADAR =====");
            System.out.println("1 - Passagem de veículo");
            System.out.println("2 - Listar multas");
            System.out.println("3 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:

                    System.out.print("Velocidade: ");
                    double velocidade = sc.nextDouble();
                    sc.nextLine();

                    Veiculo teste = new Veiculo("", velocidade, "carro");
                    Radar radarTeste = new Radar("teste");

                    Multa resultado = radarTeste.verificarVeiculo(teste);

                    if (resultado == null) {
                        System.out.println("Radar monitorou. Nenhuma infração.");
                        break;
                    }

                    System.out.print("Tipo do veículo (carro/caminhao): ");
                    String tipo = sc.nextLine();

                    System.out.print("Placa: ");
                    String placa = sc.nextLine();


                    Veiculo veiculo = new Veiculo(placa, velocidade, tipo);


                    Multa multa = radar.verificarVeiculo(veiculo);
                    sistema.registrar(multa);

                    break;

                case 2:
                    sistema.listar();
                    break;

                case 3:
                    System.out.println("Sistema encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 3);

        sc.close();
    }
}
