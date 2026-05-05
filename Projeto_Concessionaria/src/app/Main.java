package app;
import service.ServiceVeiculo;
import model.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ServiceVeiculo service = new ServiceVeiculo();

        int opcao;

        do {
            System.out.println("======= MENU =======");
            System.out.println("1 - Adicionar Carro");
            System.out.println("2 - Adicionar Moto");
            System.out.println("3 - Listar Veículos");
            System.out.println("4 - Buscar por Placa");
            System.out.println("5 - Remover por Placa");
            System.out.println("0 - Sair");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:
                    Carro carro = new Carro();

                    System.out.print("Placa: ");
                    carro.setPlaca(sc.nextLine());

                    System.out.print("Marca: ");
                    carro.setMarca(sc.nextLine());

                    System.out.print("Modelo: ");
                    carro.setModelo(sc.nextLine());

                    System.out.print("Ano: ");
                    carro.setAno(sc.nextInt());

                    System.out.print("Preço: ");
                    carro.setPreço(sc.nextDouble());

                    System.out.print("Km Rodados: ");
                    carro.setKmR(sc.nextInt());

                    sc.nextLine();

                    service.adcVeiculo(carro);
                    break;

                case 2:
                    Moto moto = new Moto();

                    System.out.print("Placa: ");
                    moto.setPlaca(sc.nextLine());

                    System.out.print("Marca: ");
                    moto.setMarca(sc.nextLine());

                    System.out.print("Modelo: ");
                    moto.setModelo(sc.nextLine());

                    System.out.print("Ano: ");
                    moto.setAno(sc.nextInt());

                    System.out.print("Preço: ");
                    moto.setPreço(sc.nextDouble());

                    System.out.print("Km Rodados: ");
                    moto.setKmR(sc.nextInt());

                    sc.nextLine();

                    service.adcVeiculo(moto);
                    break;

                case 3:
                    service.listarVeiculos();
                    break;

                case 4:
                    System.out.print("Digite a placa: ");
                    String placaBusca = sc.nextLine();

                    Veiculo v = service.buscarPlaca(placaBusca);

                    if (v != null) {
                        v.mostrarInfo();
                    } else {
                        System.out.println("Veículo não encontrado.");
                    }
                    break;

                case 5:
                    System.out.print("Digite a placa: ");
                    String placaRemover = sc.nextLine();

                    service.removerPorPlaca(placaRemover);
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}