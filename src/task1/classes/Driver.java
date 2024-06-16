package task1.classes;

public class Driver extends Person{
    private String fullName;
    private int experience;

    public Driver(String location, int age, String fullName, int experience) {
        super(location, age);
        this.fullName = fullName;
        this.experience = experience;
    }

    public Driver( String fullName, int experience, Person person){
        super(person.getLocation(),person.getAge());
        this.fullName = fullName;
        this.experience = experience;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Driver{"  + fullName + ";" + experience + ";" + super.toString() + "}";
    }
}
