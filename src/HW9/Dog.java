package HW9;

import java.lang.Runnable;

public class Dog implements Runnable {
    String name;

    public Dog(String name) {
        this.name = name;
    }


    @Override
    public void run() {
        System.out.println("Собака " + name + " бегает за кошкой");
    }
}
