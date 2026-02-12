import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
             System.out.println("Digite O valor do deposito inicial: R$");
            double depositoInicial = sc.nextDouble();

            ContaBancaria conta = new ContaBancaria(depositoInicial);

            int opcao;
         do

            {
                System.out.println("\n====== MENU ======");
                System.out.println("1 - Consultar saldo");
                System.out.println("2 - Consultar cheque especial");
                System.out.println("3 - Depositar dinheiro");
                System.out.println("4 - Sacar dinheiro");
                System.out.println("5 - Pagar boleto");
                System.out.println("6 - Verificar uso do cheque especial");
                System.out.println("0 - Sair");
                System.out.print("Escolha uma opção: ");

                opcao = sc.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.println("Saldo Atual: R$ " + conta.consultarSaldo());
                        break;
                    case 2:
                        System.out.println("Cheque especial disponivel: R$ " + conta.consultarChequeEspecial());
                        break;
                    case 3:
                        System.out.println("Valor para deposito: R$ ");
                        double deposito = sc.nextDouble();
                        conta.depositar(deposito);
                        System.out.println("Depopsito Realizado");
                        break;
                    case 4:
                        System.out.println("Valor para saque: R$ ");
                        double saque = sc.nextDouble();

                        if (conta.sacar(saque)) {
                            System.out.println("Saque realizado com sucesso");
                        } else {
                            System.out.println("Saldo insuficiente");
                        }
                        break;
                    case 5:
                        System.out.println("Valor do boleto: R$ ");
                        double boleto = sc.nextDouble();

                        if (conta.pagarBoleto(boleto)) {
                            System.out.println("boleto pago");
                        } else {
                            System.out.println("saldo insuficiente");
                        }
                        break;
                    case 6:
                        if (conta.estaUsandoChequeEspecial()) {
                            System.out.println("a conta esta usando o cheque especial");
                        } else {
                            System.out.println("a conta Nao esta usando o cheque especial");
                        }
                        break;
                    case 0:
                        System.out.println("Encerrando o sistema...");
                        break;

                    default:
                        System.out.println("opção invalida");
                }

            } while(opcao !=0);
        }
    }