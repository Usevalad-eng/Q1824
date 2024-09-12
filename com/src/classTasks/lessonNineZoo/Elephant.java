package classTasks.lessonNineZoo;

public class Elephant extends Animal{
    public Elephant(String name, int weight, int age) {
        super(name, weight, age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " elephant " + "can trumpet");
    }
}
