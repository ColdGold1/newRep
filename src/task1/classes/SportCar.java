package task1.classes;

public class SportCar extends Car{
    private double speedLimit;

    public SportCar(String mark, char classOfAuto, int weight, Driver driver, Engine engine, double speedLimit) {
        super(mark, classOfAuto, weight, driver, engine);
        this.speedLimit = speedLimit;
    }

    public SportCar(double speedLimit, Car car){
        super(car.getMark(),car.getClassOfAuto(),car.getWeight(),car.getDriver(), car.getEngine());
        this.speedLimit = speedLimit;
    }

    public double getSpeedLimit() {
        return speedLimit;
    }

    public void setSpeedLimit(double speedLimit) {
        this.speedLimit = speedLimit;
    }

    @Override
    public String toString() {
        return "SportCar{" + speedLimit + ";" + super.toString() + "}";
    }
}
