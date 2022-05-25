package animals.main;

public class Flying extends Animal implements IRunnable, IPhotosynthesis {
    private final int RUN_ENERGY = 5;
    private final int PHOTO_ENERGY = 1;

    public Flying(int weight, String name, int energy) {
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
