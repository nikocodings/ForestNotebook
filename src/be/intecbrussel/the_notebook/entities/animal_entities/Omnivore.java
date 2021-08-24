package be.intecbrussel.the_notebook.entities.animal_entities;

import be.intecbrussel.the_notebook.entities.plant_entities.Plant;

import java.util.Set;

public class Omnivore extends Animal{

    private Set<Plant> plantDiet;
    private double maxFoodSize = getHeight();

    public Omnivore(String name) {
        super(name);
    }

    public Omnivore(String name, double weight, double height, double length, boolean carnivore, boolean omnivore, boolean herbivore) {
        super(name, weight, height, length, carnivore, omnivore, herbivore);
    }


    public Set<Plant> getPlantDiet() {
        return plantDiet;
    }

    public void setPlantDiet(Set<Plant> plantDiet) {
        this.plantDiet = plantDiet;
    }

    public double getMaxFoodSize() {
        maxFoodSize=getHeight();
        return maxFoodSize;
    }

    public void setMaxFoodSize(double maxFoodSize) {
        this.maxFoodSize = maxFoodSize;
    }
    public void addPlantToDiet(Plant plant){
        plantDiet.add(plant);
    }

    @Override
    public String toString() {
        return "name= " + getName() +
                ", weight= " + getWeight() +
                ", height= " + getHeight() ;
    }
}
