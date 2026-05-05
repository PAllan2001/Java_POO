package model;

public class Veiculo {

    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    private int KmR;
    private double preço;


    public Veiculo(){
    }

    public void ligar() {
        System.out.println("model.Veiculo ligado.");
    }
    public void mostrarInfo() {
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano : " + getAno());
        System.out.println("Placa: " + getPlaca());
        System.out.println("KmR: " + getKmR());
        System.out.println("Preço: " + getPreço());
    }


    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca ;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo ;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano  = ano ;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa ;
    }
    public int getKmR() {
        return KmR;
    }
    public void setKmR(int KmR) {
        this.KmR = KmR;
    }
    public double getPreço(){
        return preço;
    }
    public void setPreço(double preço){
        this.preço = preço;
    }

}
