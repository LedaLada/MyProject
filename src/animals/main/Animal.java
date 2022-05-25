package animals.main;

public abstract class Animal {
    private int weight;
    private String name;
    private int energy;
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
        int finalEat = this.getEnergy() + eatenFood;
        this.setEnergy(finalEat);
        System.out.println(this.getName() + " is eating. Energy balance " + this.getEnergy());

        return this.getEnergy();
    }

    public void move(int actionEnergy, String successMessage, String errorMessage) {
        if (this.getEnergy() >= actionEnergy) {
            int finalEnergy = this.getEnergy() - actionEnergy;
            this.setEnergy(finalEnergy);
            System.out.printf(successMessage, this.getName(), actionEnergy, this.getEnergy());
        } else {
            System.out.printf(errorMessage, this.getName());
        }
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

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getEnergy() {
        return this.energy;
    }
}
