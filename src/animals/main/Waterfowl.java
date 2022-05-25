package animals.main;

public class Waterfowl extends Animal implements ISwimmable {
    private final int SWIM_ENERGY = 10;

    public Waterfowl(int weight, String name, int energy) {
        super(weight, name, energy);
    }

    @Override
    public void swim() {
        move(SWIM_ENERGY, SWIM_MESSAGE, SWIM_ERROR);
    }
}