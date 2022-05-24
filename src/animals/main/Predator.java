package animals.main;

public class Predator extends Ground implements IRunnable, IHunter {
    private final int RUN_ENERGY = 3;

    public Predator(int weight, String name, int energy) {
        super(weight, name, energy);
    }

    @Override
    public void run() {
        move(RUN_ENERGY, RUN_MESSAGE, RUN_ERROR);
    }

    @Override
    public void eat(Animal animal) {
        this.energy += animal.energy;
        System.out.println(getName() + " ate another animal " + animal.getName() + " and took away the " + animal.energy
                + " energy. Energy balance " + getEnergy());

        animal.energy = 0;
    }
}
