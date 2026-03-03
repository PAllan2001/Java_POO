import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaBanco c1 = new ContaBanco(0, true);
        int opcao;

        do {

            System.out.println("========MENU========");
            System.out.println("1 - abrir conta");
            System.out.println("2 - Depositar ");
            System.out.println("3 - Sacar");
            System.out.println("4 - Pagar Mensalidade ");
            System.out.println("5 - Mostra informações da conta ");
            System.out.println("6 - Pagar Boleto");
            System.out.println("7 - Fechar Conta e Sair ");



            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:

                    System.out.println("Informe seu nome completo: ");
                    c1.setDono(sc.nextLine());
                    System.out.println("Digite o tipo da conta CC(Conta Corrente) ou CP(Conta Poupança): ");
                    String tipo = sc.nextLine();
                    System.out.println("Digite O valor do deposito inicial: R$");
                    float depositoInicial = sc.nextFloat();
                    c1.setSaldo(c1.getSaldo() +depositoInicial);
                    sc.nextLine();
                    c1.abrirConta(tipo);   // NÃO use setTipo diretamente
                    break;

                case 2:
                    System.out.println("Qual valor você vai depositar");
                    c1.depositar(sc.nextFloat());
                    break;

                case 3:
                    System.out.println("Qual valor vc vai sacar");
                    c1.sacar(sc.nextFloat());
                    break;

                case 4:
                    c1.pagarMensal();
                    break;

                case 5:
                    c1.estadoAtual();
                    break;

                case 6:
                    System.out.println("Valor do boleto: R$ ");
                    float boleto = sc.nextFloat();

                    c1.pagarBoleto(boleto);
                    break;

                case 7:
                    if (c1.fecharConta()) {
                        opcao = 0;
                    }
                    System.out.println("Encerrando o programa ");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        sc.close();
    }

}
