package homeTasks.homeTask10Children;

import java.util.Objects;

public class Child {
    private String name;
    private Integer age;
    private boolean isMan;

    public Child(String name, Integer age, boolean isMan) {
        this.name = name;
        this.age = age;
        this.isMan = isMan;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public boolean isMan() {
        return isMan;
    }

    @Override
    public String toString() {
        return "Child{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isMan=" + isMan +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Child child = (Child) o;
        return isMan == child.isMan && Objects.equals(name, child.name) && Objects.equals(age, child.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, isMan);
    }

}
