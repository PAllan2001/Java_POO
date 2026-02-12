
public class ContaBancaria {

    private  double saldo;

    private  double limiteChequeEspecial;

    private double chequeEspecialUsado;

    public ContaBancaria(double depositoInicial) {
        this.saldo = depositoInicial;
        this.chequeEspecialUsado = 0;

        if(depositoInicial <= 500) {
            this.limiteChequeEspecial = 50;
        }
        else {
            this.limiteChequeEspecial = depositoInicial * 0.5;
        }
    }

    public double consultarSaldo() {
        return saldo;
    }

    public double consultarChequeEspecial() {
        return limiteChequeEspecial - chequeEspecialUsado;
    }

    public boolean estaUsandoChequeEspecial() {
        return  chequeEspecialUsado > 0;
    }

    public void depositar(double valor) {
        if (valor <= 0) return;

        if (chequeEspecialUsado > 0) {
            double divida = chequeEspecialUsado * 1.2;

            if (valor >= divida) {
                valor -= divida;
                chequeEspecialUsado = 0;
            } else {
                chequeEspecialUsado = (divida - valor) / 1.2;
                return;
            }
        }

        saldo += valor;
    }

    public boolean sacar(double valor) {
        if (valor <= 0) return false;

        double saldoTotal = saldo + consultarChequeEspecial();

        if (valor > saldoTotal) {
            return false;
        }
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            double restante = valor - saldo;
            saldo = 0;
            chequeEspecialUsado += restante;
        }

        return true;
    }

    public boolean pagarBoleto(double valor) {
        return sacar(valor);
    }
}
