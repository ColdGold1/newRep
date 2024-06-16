package task3;

import task3.classes.Group;
import task3.classes.Student;

public class RunnerTask3 {
    public static void main(String[] args) {
        Student student = new Student();

        Group group1 = new Group("Group 1");
        Group group2 = new Group("Group 2");

        student.registerObserver(group1);
        student.registerObserver(group2);

        student.setState("state1");

        student.setState("state2");
    }
}
