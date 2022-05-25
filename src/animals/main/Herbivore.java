package animals.main;

public class Herbivore extends Ground implements IRunnable, IPhotosynthesis {
    private final int PHOTO_ENERGY = 2;
    private final int RUN_ENERGY = 8;

    public Herbivore(int weight, String name, int energy) {
        super(weight, name, energy);
    }

    @Override
    public void run() {
        move(RUN_ENERGY, RUN_MESSAGE, RUN_ERROR);
    }

    @Override
    public void photosynthesis() {
        int finalEnergy = this.getEnergy() + PHOTO_ENERGY;
        setEnergy(finalEnergy);
        System.out.printf(PHOTO_MESSAGE, this.getName(), PHOTO_ENERGY, this.getEnergy());
    }
}
