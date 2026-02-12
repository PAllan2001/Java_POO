public class Gerente extends Funcionarios {

    private double faturamentoLoja;
    private double percentualBonus; // exemplo: 0.05 = 5%

    public Gerente() {
        super();
    }

    @Override
    public double calcularSalario() {
        double bonus = faturamentoLoja * percentualBonus;
        return getsalarioBase() + bonus;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("====== GERENTE ======");
        super.mostrarInfo();
        System.out.println("Faturamento Loja: R$ " + faturamentoLoja);
        System.out.println("Bônus (%): " + (percentualBonus * 100) + "%");
        System.out.println("Salário Final: R$ " + calcularSalario());
        System.out.println("=====================");
    }

    public void setFaturamentoLoja(double faturamentoLoja) {
        this.faturamentoLoja = faturamentoLoja;
    }

    public void setPercentualBonus(double percentualBonus) {
        this.percentualBonus = percentualBonus;
    }
}
