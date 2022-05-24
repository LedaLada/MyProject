package animals.main;

public abstract class Ground extends Animal implements IRunnable, ISwimmable {
    private final int SWIM_ENERGY = 20;

    public Ground(int weight, String name, int energy) {
        super(weight, name, energy);
    }

    @Override
    public abstract void run();

    @Override
    public void swim() {
        move(SWIM_ENERGY, SWIM_MESSAGE, SWIM_ERROR);
    }
};



