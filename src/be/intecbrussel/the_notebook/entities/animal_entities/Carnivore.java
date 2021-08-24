package be.intecbrussel.the_notebook.entities.animal_entities;

public class Carnivore extends Animal{

    private double maxFoodSize = getHeight();

    public Carnivore(String name) {
        super(name);
    }

    public Carnivore(String name, double weight, double height, double length, boolean carnivore, boolean omnivore, boolean herbivore) {
        super(name, weight, height, length, carnivore, omnivore, herbivore);
    }


    public double getMaxFoodSize() {
        maxFoodSize=getHeight();
        return maxFoodSize;
    }

    public void setMaxFoodSize(double maxFoodSize) {
        this.maxFoodSize = maxFoodSize;
    }

    @Override
    public String toString() {
        return "name= " + getName() +
                ", weight= " + getWeight() +
                ", height= " + getHeight();
    }
}
