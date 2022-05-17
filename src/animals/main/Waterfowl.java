package animals.main;

public class Waterfowl extends Animal {
    public Waterfowl(int weight, String name, int energy) {
        super(weight, name, energy);
    }

    public void swim() {
        System.out.println(this.getName() + " swims and spend " + 10 + " energy");
        this.energy -= 10;
    }
}