package classTasks.lessonNineZoo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public  class Zoo {
    private List<Animal> animals;

    public Zoo() {
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal){
        animals.add(animal);
    }

    public void removeAnimal(Animal animal) throws AnimalNotFound {
        if (!animals.remove(animal)){
            throw new AnimalNotFound("Animal not found exception");
        }
        System.out.println(animal + animal.getName() + " was removed");
    }

    public void makeSoundOfAllAnimals(){
        for (Animal a : animals){
            a.makeSound();
        }
    }

    public void makeFeedAllAnimals(){
        for (Animal a : animals){
            System.out.println(a.getName() + " was fed");
        }
    }

    public void printAllAnimals(){
        for (Animal a : animals){
            System.out.println("Name: " + a.getName() + " " + a.getAge() + "years " + a.getWeight() + " kilos");
        }
    }

    public void swimIfCan(){
        for (Animal a : animals){
            if (a instanceof Swimmable){
                ((Swimmable) a).swim();
            }
        }
    }

    public void sortedAnimals(){
        animals.sort(new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                return Integer.compare(o2.getWeight(),o1.getWeight());
            }
        });
        System.out.println("Animals sorted by weight: ");
        for (Animal animal : animals){
            System.out.println(" - " + " name: " + animal.getName() + " weight: " + animal.getWeight() + " kilos");
        }
    }
    @Override
    public String toString() {
        return "Zoo{" +
                "animals=" + animals +
                '}';
    }
}
