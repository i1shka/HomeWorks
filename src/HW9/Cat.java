package HW9;

import java.lang.Runnable;

public class Cat implements Runnable {
    String name;

    public Cat(String name) {
        this.name = name;
    }


    @Override
    public void run() {
        System.out.println("Кошка " + name + " бегает за мышкой");
    }
}
