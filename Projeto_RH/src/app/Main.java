package app;

import java.util.Scanner;
import model.*;
import service.ServiceFuncionarios;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(java.util.Locale.US);
        ServiceFuncionarios service = new ServiceFuncionarios();

        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Adicionar Vendedor");
            System.out.println("2 - Adicionar Gerente");
            System.out.println("3 - Listar Funcionários");
            System.out.println("4 - Buscar Funcionario");
            System.out.println("5 - Remover Funcionario");
            System.out.println("0 - Sair");

            opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opcao) {

                case 1:
                    Vendedor v = new Vendedor();

                    System.out.print("Nome: ");
                    v.setNome(sc.nextLine());

                    System.out.print("CPF: ");
                    v.setCPF(sc.nextLong());

                    System.out.print("Salário Base: ");
                    v.setSalarioBase(sc.nextDouble());

                    System.out.print("Total de Vendas: ");
                    v.setTotalVendas(sc.nextDouble());

                    System.out.print("Percentual Comissão (ex: 0.1): ");
                    v.setPercentualComissao(sc.nextDouble());

                    service.addFuncionarios(v);
                    break;

                case 2:
                    Gerente g = new Gerente();

                    System.out.print("Nome: ");
                    g.setNome(sc.nextLine());

                    System.out.print("CPF: ");
                    g.setCPF(sc.nextLong());

                    System.out.print("Salário Base: ");
                    g.setSalarioBase(sc.nextDouble());

                    System.out.print("Faturamento da Loja: ");
                    g.setFaturamentoLoja(sc.nextDouble());

                    System.out.print("Percentual Bônus (ex: 0.05): ");
                    g.setPercentualBonus(sc.nextDouble());

                    service.addFuncionarios(g);
                    break;

                case 3:
                    service.listarFuncionarios();
                    break;

                case 4:
                    System.out.print("Digite o CPF para buscar: ");
                    long cpf = sc.nextLong();

                    Funcionarios funcionarios = service.buscarPorCpf(cpf);

                    if (funcionarios != null) {
                        funcionarios.mostrarInfo();
                    } else {
                        System.out.println("Funcionário não encontrado.");
                    }

                case 5:
                    System.out.print("Digite o CPF: ");
                    long Cpf = sc.nextLong();
                    service.removerPorCpf(Cpf);
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
