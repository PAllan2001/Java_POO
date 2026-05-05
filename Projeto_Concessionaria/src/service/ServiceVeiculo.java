package service;
import java.util.ArrayList;
import model.Veiculo;

public class ServiceVeiculo {
    private ArrayList<Veiculo> veiculos = new ArrayList<>();

    public void adcVeiculo(Veiculo v) {

        if (placaExiste(v.getPlaca())) {
            System.out.println("Já existe um veículo com essa placa.");
            return;
        }

        veiculos.add(v);
        System.out.println("Veículo adicionado.");
    }
    private boolean placaExiste(String placa) {
        for (Veiculo v : veiculos) {
            if (v.getPlaca().equalsIgnoreCase(placa)) {
                return true;
            }
        }
        return false;
    }



    public void removerPorPlaca(String placa) {
        for (int i = 0; i < veiculos.size(); i++) {
            if (veiculos.get(i).getPlaca().equalsIgnoreCase(placa)) {
                veiculos.remove(i);
                System.out.println("Veículo removido.");
                return;
            }
        }
        System.out.println("Veículo não encontrado.");
    }

    public void listarVeiculos(){
        if(veiculos.isEmpty()){
            System.out.println("Nenhum veiculo cadastrado");
            return;
        }
        for (Veiculo v : veiculos) {
            v.mostrarInfo();
            System.out.println("------");
        }

    }

    public Veiculo buscarPlaca(String placa){
        for(int i = 0; i < veiculos.size(); i++){
            if(veiculos.get(i).getPlaca().equals(placa)){
                return veiculos.get(i);
            }
        }
        return null;
    }
}
