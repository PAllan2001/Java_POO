public class Main {
    public static void main(String[] args)
    {
        Carro carro1 = new Carro();
        carro1.setMarca("Honda");
        carro1.setModelo("HRV");
        carro1.setAno(2014);

        Moto moto2 = new Moto ();
        moto2.setMarca("Honda");
        moto2.setModelo("Africa Twin");
        moto2.setAno(2018);

        carro1.ligar();
        carro1.mostrarInfo();

        System.out.println("-------");

        moto2.ligar();
        moto2.mostrarInfo();
    }
}
