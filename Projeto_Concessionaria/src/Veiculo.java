public class Veiculo {

    private String marca;
    private String modelo;
    private int ano;


    public Veiculo(){
    }

    public void ligar() {
        System.out.println("Veiculo ligado.");
    }
    public void mostrarInfo() {
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano : " + getAno());
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


}
