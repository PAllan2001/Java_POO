package model;

public class Carro extends Veiculo {
    public Carro() {

        super();
    }
    @Override
    public void ligar() {
        System.out.println("model.Carro ligado com chave.");
    }
}