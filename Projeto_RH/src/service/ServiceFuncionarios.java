package service;

import java.util.ArrayList;
import model.Funcionarios;

public class ServiceFuncionarios {

    private ArrayList<Funcionarios> funcionarios = new ArrayList<>();

    public void addFuncionarios(Funcionarios funcionarios){
        if (cpfExiste(funcionarios.getCPF())) {
            System.out.println("Já existe um funcionário com esse CPF.");
            return;
        }
        this.funcionarios.add(funcionarios);
        System.out.println("Funcionarios adicionado com sucesso");

    }
    public Funcionarios buscarPorCpf(long cpf) {
        for (Funcionarios funcionarios : this.funcionarios) {
            if (funcionarios.getCPF() == cpf) {
                return funcionarios;
            }
        }
        return null;
    }
    private boolean cpfExiste(long cpf) {
        for (Funcionarios funcionarios : this.funcionarios) {
            if (funcionarios.getCPF() == cpf) {
                return true;
            }
        }
        return false;
    }

    public void removerPorCpf(long cpf) {
        for (int i = 0; i <this.funcionarios.size(); i++) {
            if (this.funcionarios.get(i).getCPF() == cpf) {
                this.funcionarios.remove(i);
                System.out.println("Funcionário removido.");
                return ;
            }
        }

        System.out.println("Funcionário não encontrado.");
    }

    public void listarFuncionarios(){
        if(funcionarios.isEmpty()){
            System.out.println("Nenhum funcionario cadastrado");
        return;
        }

        for(int i = 0; i < funcionarios.size(); i++){
            System.out.println("Indice: " +i);
            funcionarios.get(i).mostrarInfo();
        }
    }
}
