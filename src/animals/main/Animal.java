package animals.main;

public abstract class Animal {
    private int weight;
    private String name;
    protected int energy;
    protected final String RUN_MESSAGE = "%s runs and spend %d energy. Energy balance %d \n";
    protected final String SWIM_MESSAGE = "%s swims and spend %d energy. Energy balance %d \n";
    protected final String PHOTO_MESSAGE = "%s get photosynthesis and get %d energy. Energy balance %d \n";
    protected final String RUN_ERROR = "%s cannot run without energy \n";
    protected final String SWIM_ERROR = "%s cannot swim without energy \n";

    public Animal(int weight, String name, int energy) {
        this.weight = weight;
        this.name = name;
        this.energy = energy;
    }

    public int eat(int eatenFood) {
        this.energy += eatenFood;
        System.out.println(this.getName() + " is eating. Energy balance " + this.energy);
        return this.energy;
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

    public void move(int actionEnergy, String successMessage, String errorMessage) {
        if (this.energy > actionEnergy) {   // actionEnergy
            this.energy -= actionEnergy;    // actionEnergy
            System.out.printf(successMessage, this.getName(), actionEnergy, this.getEnergy()); // successMessage,
        } else {
            System.out.printf(errorMessage, this.getName()); //errorMessage
        }
    }
}
