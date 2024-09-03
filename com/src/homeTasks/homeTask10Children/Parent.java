package homeTasks.homeTask10Children;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Parent {
    private String name;
    private Integer age;
    private List<Child> children = new ArrayList<>();

    public Parent(String name, Integer age, List<Child> children) {
        this.name = name;
        this.age = age;
        this.children = children;
    }

    public Parent(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public List<Child> getChildren() {
        return children;
    }

    @Override
    public String toString() {
        return "Parent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", children=" + children +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parent parent = (Parent) o;
        return Objects.equals(name, parent.name) && Objects.equals(age, parent.age) && Objects.equals(children, parent.children);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, children);
    }

}
