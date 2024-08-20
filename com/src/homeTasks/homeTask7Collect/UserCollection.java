package homeTasks.homeTask7Collect;

import classTasks.lessonSixCollections.User;

import java.util.Objects;

public class UserCollection implements Comparable<UserCollection>{
    public String name;
    public int age;
    public String sex;

    public UserCollection(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    @Override
    public int compareTo(UserCollection o) {
        UserCollection newUser = (UserCollection) o;
        if (age > newUser.age && !name.equals(newUser.name)) {
            return 1;
        }
        return -1;
    }

    @Override
    public String toString() {
        return "UserCollection{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserCollection that = (UserCollection) o;
        return age == that.age && name.equals(that.name) && sex.equals(that.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, sex);
    }
}
