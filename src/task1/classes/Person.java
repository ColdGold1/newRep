package task1.classes;

public class Person {
    private String location;
    private int age;

    public Person() {
    }

    public Person(String location, int age) {
        this.location = location;
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" + location + ";" + age + "}";
    }
}
