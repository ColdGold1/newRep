package task1.classes;

public class Lorry extends Car{
    private int weightOfBody;

    public Lorry(String mark, char classOfAuto, int weight, Driver driver, Engine engine, int weightOfBody) {
        super(mark, classOfAuto, weight, driver, engine);
        this.weightOfBody = weightOfBody;
    }

    public Lorry(int weightOfBody, Car car){
        super(car.getMark(),car.getClassOfAuto(),car.getWeight(),car.getDriver(), car.getEngine());
        this.weightOfBody = weightOfBody;
    }

    public int getWeightOfBody() {
        return weightOfBody;
    }

    public void setWeightOfBody(int weightOfBody) {
        this.weightOfBody = weightOfBody;
    }

    @Override
    public String toString() {
        return "Lorry{" + weightOfBody + ";" + super.toString() + "}";
    }
}
