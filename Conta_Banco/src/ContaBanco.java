
import java.util.concurrent.ThreadLocalRandom;

public class ContaBanco {
    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;


    public boolean pagarBoleto(float valor) {
        if (getSaldo() >= valor) {
            setSaldo(getSaldo() - valor);
            System.out.println("Boleto Pago no valor: R$" + valor);
        }
        else {
            System.out.println("Saldo insuficientes");
        }
        return false;
    }


    public void estadoAtual(){
        System.out.println("=====STATUS DA CONTA=====");
        System.out.println("Dono da Conta: " + getDono());
        System.out.println("Numero da Conta: " + getNumConta());
        System.out.println("Tipo da Conta: " + getTipo());
        System.out.println("Saldo da Conta: R$" + getSaldo());
        System.out.println("Status? " + getStatus());
    }


    public ContaBanco(float saldo,boolean status) {
        setSaldo(0f);
        setStatus(false);
    }


    public boolean sacar(float valor) {
        if (getSaldo() >= valor && status) {
            setSaldo(getSaldo() - valor);
            System.out.println("Saque realizado de " + valor +" R$ ");
        }
        else {
            System.out.println("Saldo insuficiente");
        }
        return false;
    }

    public void depositar(float valor) {
        if (status) {
            setSaldo(getSaldo() + valor);
            System.out.println("Deposito Feito de " + valor);
        }
        else {
            System.out.println("Conta Inexistente");
        }
    }

    public void abrirConta(String tipo) {
        setTipo(tipo);
        setStatus(true);
        setDono(dono);
        int numeroGerado = ThreadLocalRandom.current().nextInt(10000, 100000);
        this.setNumConta(numeroGerado);

        if (dono == null || dono.isBlank()) {
            System.out.println("Nome inválido.");
            return;
        }
    }


    public boolean fecharConta() {

        if (getSaldo() < 0) {
            System.out.println("Conta com saldo negativo. Quite o débito.");
            return false;
        }

        if (getSaldo() > 0) {
            System.out.println("Sacando todo o saldo de : " + getSaldo());
            saldo = 0;
        }

        setStatus(false);
        System.out.println("Conta fechada com sucesso.");
        return true;
    }

    public void pagarMensal() {
        if (tipo.equalsIgnoreCase("CC") && status && saldo >= 12) {
            setSaldo(getSaldo() - 12);
            System.out.println("Pagando mensal de " + 12);
        }
        else if (tipo.equalsIgnoreCase("CP") && status && saldo >= 20) {
            setSaldo(getSaldo() - 20);
            System.out.println("Pagando mensal de " + 20);
        }
    }

    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public Float getSaldo() {
        return saldo;
    }
    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }

    public boolean getStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }

}

