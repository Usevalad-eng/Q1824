package classTasks.lessonNineZoo;

public class Penguin extends Animal implements Swimmable{
    public Penguin(String name, int weight, int age) {
        super(name, weight, age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " penguin " + "can qwa");
    }

    @Override
    public void swim() {
        System.out.println("Penguin " + getName() + " swims.");
    }
}
