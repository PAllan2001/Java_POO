public class PetMachine {

    private boolean machineClean;
    private int water;
    private int shampoo;
    private Pet pet;

    private final int MAX_WATER = 30;
    private final int MAX_SHAMPOO = 10;

    public PetMachine() {
        this.machineClean = true;
        this.water = 0;
        this.shampoo = 0;
        this.pet = null;
    }


    public void setPet(Pet pet) {

        if (!machineClean) {
            System.out.println("A maquina esta suja. Necessario limpa-la.");
            return;
        }

        if (this.pet != null) {
            System.out.println("Ja existe um pet na maquina.");
            return;
        }

        this.pet = pet;
        System.out.println("Pet " + pet.getName() + " colocado na maquina.");
    }


    public void takeShower() {

        if (pet == null) {
            System.out.println("Nao ha pet na maquina.");
            return;
        }

        if (water < 10 || shampoo < 2) {
            System.out.println("Nivel insuficiente de agua ou shampoo.");
            return;
        }

        water -= 10;
        shampoo -= 2;

        pet.setClean(true);

        System.out.println("O pet " + pet.getName() + " esta limpo!");
    }


    public void removePet() {

        if (pet == null) {
            System.out.println("Nao ha pet na maquina.");
            return;
        }

        if (!pet.isClean()) {
            machineClean = false;
        }

        System.out.println("Pet " + pet.getName() + " removido.");

        pet = null;
    }

    public void washMachine() {

        if (water < 3 || shampoo < 1) {
            System.out.println("Nivel insuficiente para limpar a maquina.");
            return;
        }

        water -= 3;
        shampoo -= 1;

        machineClean = true;

        System.out.println("Maquina limpa com sucesso.");
    }


    public void addWater() {

        if (water + 10 > MAX_WATER) {
            System.out.println("Capacidade maxima de agua atingida.");
            return;
        }

        water += 10;
        System.out.println("10 litros de agua adicionados.");
    }


    public void addShampoo() {

        if (shampoo + 5 > MAX_SHAMPOO) {
            System.out.println("Capacidade maxima de shampoo atingida.");
            return;
        }

        shampoo += 5;
        System.out.println("2 litros de shampoo adicionados.");
    }


    public int getWater() {
        return water;
    }

    public int getShampoo() {
        return shampoo;
    }

    public boolean hasPet() {
        return pet != null;
    }

    public boolean isMachineClean() {
        return machineClean;
    }

    public void wash() {
    }
}
