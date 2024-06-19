package task1.classes;

public class Car{
    private String mark;
    private char classOfAuto;
    private int weight;
    private Driver driver;
    private Engine engine;

    public Car(String mark, char classOfAuto, int weight, Driver driver, Engine engine) {
        this.mark = mark;
        this.classOfAuto = classOfAuto;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public char getClassOfAuto() {
        return classOfAuto;
    }

    public void setClassOfAuto(char classOfAuto) {
        this.classOfAuto = classOfAuto;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" + mark + ";" + classOfAuto + ";" + weight + ";" + driver + ";" + engine + "}";
    }
}
