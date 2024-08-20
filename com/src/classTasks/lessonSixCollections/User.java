package classTasks.lessonSixCollections;

import java.util.Objects;

public class User implements Comparable {
    private String name;
    private Integer age;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public int compareTo(Object o) {
        User newUser = (User) o;
        if (age > newUser.age) {
            return 1;
        }
        return -1;
    }



    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return name.equals(user.name) && age.equals(user.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    /*@Override
    public int compareTo(User o) {
        User newUser = (User) o;
        if (age > newUser.age) {
            return 1;
        }
        return -1;
    }*/

    /*@Override
    public int compareTo(Object o) {
        return 0;
    }*/
}
