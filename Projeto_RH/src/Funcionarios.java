
public class Funcionarios {
    private String Nome ;
    private long CPF ;
    private double salarioBase;

    public Funcionarios () {

    }

    public double calcularSalario() {
        return salarioBase;
    }

    public void mostrarInfo() {
        System.out.println("Nome : " + getNome());
        System.out.println("CPF : " + getCPF() );
        System.out.println("salarioBase : " + getsalarioBase());
    }

    public String getNome() {
        return Nome;
    }
    public void setNome(String Nome) {
        this.Nome = Nome ;
    }
    public long getCPF() {
        return CPF;
    }
    public void setCPF(long CPF) {
        this.CPF = CPF ;
    }
    public double getsalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase ) {
        this.salarioBase = salarioBase ;

    }

}

