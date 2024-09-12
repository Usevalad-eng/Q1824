package classTasks.lessonNineZoo;

public abstract class Animal extends Zoo{
    protected String name;
    protected int weight;
    protected int age;

    public Animal(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void makeSound();

    public void eat(){
        System.out.println(getName() + " animal"+ " can eat");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Animal{");
        sb.append("name='").append(name).append('\'');
        sb.append(", weight=").append(weight);
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}
