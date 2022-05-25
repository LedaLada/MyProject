package animals.main;

public class Predator extends Ground implements IRunnable, IHunter {
    private final int RUN_ENERGY = 3;
    private final String EAT_ANIMAL = "%s ate another animal %s and took away the %d energy. Energy balance %d.";

    public Predator(int weight, String name, int energy) {
        super(weight, name, energy);
    }

    @Override
    public void run() {
        move(RUN_ENERGY, RUN_MESSAGE, RUN_ERROR);
    }

    @Override
    public void eat(Animal animal) {
        int finalEnergy = this.getEnergy() + animal.getEnergy();
        this.setEnergy(finalEnergy);
        System.out.printf(EAT_ANIMAL, this.getName(), animal.getName(), animal.getEnergy(), this.getEnergy());

        animal.setEnergy(0);
    }
}
