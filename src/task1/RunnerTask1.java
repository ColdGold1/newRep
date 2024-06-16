package task1;

import task1.classes.*;

public class RunnerTask1 {
    public static void main(String[] args) {
        Person person = new Person("someNewLocation1",19);
        System.out.println(person + "\n");

        Driver driver = new Driver("fullName1",4,person);
        System.out.println(driver + "\n");

        Engine engine = new Engine(1000,12);
        System.out.println(engine + "\n");

        Car car = new Car("mark1",'C',500,driver,engine);
        System.out.println(car + "\n");

        Lorry lorry = new Lorry(10,car);
        System.out.println(lorry + "\n");

        SportCar sportCar = new SportCar(130.5,car);
        System.out.println(sportCar);

    }
}
