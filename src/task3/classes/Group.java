package task3.classes;

import java.util.Observable;

public class Group implements Observer {
    private String name;
    private String state;

    public Group(String name){
        this.name = name;

    }

    @Override
    public void update(String state) {
        this.state = state;
        display();
    }

    private void display() {
        System.out.println("Group " + name + " got messaged. State: " + state);
    }
}
