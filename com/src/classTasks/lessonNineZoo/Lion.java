package classTasks.lessonNineZoo;

public class Lion extends Animal{
    public Lion(String name, int weight, int age) {
        super(name, weight, age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " lion " + "can roar");
    }
}
