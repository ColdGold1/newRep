package task1.classes;

public class Engine {
    private int power;
    private int performance;

    public Engine(int power, int performance) {
        this.power = power;
        this.performance = performance;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getPerformance() {
        return performance;
    }

    public void setPerformance(int performance) {
        this.performance = performance;
    }

    @Override
    public String toString() {
        return "Engine{" + power + ";" + performance + "}";
    }
}
