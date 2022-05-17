package animals.main;

public abstract class Animal {
    private int weight;
    private String name;
    protected int energy;

    public Animal(int weight, String name, int energy) {
        this.weight = weight;
        this.name = name;
        this.energy = energy;
    }

    public int eat(int eatenFood) {
        return this.energy += eatenFood;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEnergy() {
        return this.energy;
    }

}
