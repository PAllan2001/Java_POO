import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        Gerente gerente1 = new Gerente();
        gerente1.setNome("Valcir Manfredini");
        gerente1.setCPF(50044366978L);
        gerente1.setSalarioBase(6000);
        gerente1.setPercentualBonus(0.05);

        System.out.print("Faturamento da loja no mês: ");
        gerente1.setFaturamentoLoja(sc.nextDouble());

        Vendedor vendedor1 = new Vendedor();
        vendedor1.setNome("Ancelmo Ulian");
        vendedor1.setCPF(44789632154L);
        vendedor1.setSalarioBase(4000);
        vendedor1.setPercentualComissao(0.1);

        System.out.print("Total de vendas do vendedor nesse mês: ");
        vendedor1.setTotalVendas(sc.nextDouble());


        gerente1.mostrarInfo();
        vendedor1.mostrarInfo();

        sc.close();
    }
}
