package service;

import model.Multa;
import java.util.ArrayList;

public class SistemaRadar {

    private ArrayList<Multa> multas = new ArrayList<>();

    public void registrar(Multa multa) {
        multas.add(multa);
        System.out.println("Infração registrada com sucesso!");
    }

    public void listar() {

        if (multas.isEmpty()) {
            System.out.println("Nenhuma multa registrada.");
            return;
        }

        System.out.println("\n===== MULTAS =====");
        for (Multa m : multas) {
            System.out.println(m);
        }
    }
}
