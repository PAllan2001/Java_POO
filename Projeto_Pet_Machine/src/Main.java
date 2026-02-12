import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PetMachine machine = new PetMachine();

        int option;

        do {
            System.out.println("\n===== PET SHOP - MAQUINA DE BANHO =====");
            System.out.println("1 - Colocar pet na maquina");
            System.out.println("2 - Dar banho no pet");
            System.out.println("3 - Retirar pet da maquina");
            System.out.println("4 - Abastecer agua");
            System.out.println("5 - Abastecer shampoo");
            System.out.println("6 - Ver nivel de agua");
            System.out.println("7 - Ver nivel de shampoo");
            System.out.println("8 - Verificar se tem pet na maquina");
            System.out.println("9 - Limpar maquina");
            System.out.println("10 - Verificar se a maquina esta limpa");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opcao: ");

            option = sc.nextInt();
            sc.nextLine();

            switch (option) {

                case 1:
                    System.out.print("Digite o nome do pet: ");
                    String name = sc.nextLine();
                    Pet pet = new Pet(name);
                    machine.setPet(pet);
                    break;

                case 2:
                    machine.takeShower();
                    break;

                case 3:
                    if (machine.hasPet()) {
                        machine.removePet();
                    } else {
                        System.out.println("Nao ha pet na maquina.");
                    }
                    break;

                case 4:
                    machine.addWater();
                    break;

                case 5:
                    machine.addShampoo();
                    break;

                case 6:
                    System.out.println("Nivel de agua: " + machine.getWater() + " litros");
                    break;

                case 7:
                    System.out.println("Nivel de shampoo: " + machine.getShampoo() + " litros");
                    break;

                case 8:
                    if (machine.hasPet()) {
                        System.out.println("Ha um pet na maquina.");
                    } else {
                        System.out.println("Nao ha pet na maquina.");
                    }
                    break;

                case 9:
                    machine.washMachine();
                    break;

                case 10:
                    if (machine.isMachineClean()) {
                        System.out.println("A maquina esta limpa.");
                    } else {
                        System.out.println("A maquina esta suja.");
                    }
                    break;

                case 0:
                    System.out.println("Encerrando sistema...");
                    break;

                default:
                    System.out.println("Opcao invalida!");
            }

        } while (option != 0);

        sc.close();
    }
}
