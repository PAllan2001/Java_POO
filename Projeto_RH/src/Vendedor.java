public class Vendedor extends Funcionarios {

    private double totalVendas;
    private double percentualComissao; // exemplo: 0.10 = 10%

    public Vendedor() {
        super();
    }

    @Override
    public double calcularSalario() {
        double comissao = totalVendas * percentualComissao;
        return getsalarioBase() + comissao;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("------ VENDEDOR ------");
        super.mostrarInfo();
        System.out.println("Total Vendas: R$ " + totalVendas);
        System.out.println("Comissão (%): " + (percentualComissao * 100) + "%");
        System.out.println("Salário Final: R$ " + calcularSalario());
        System.out.println("----------------------");
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }
}
