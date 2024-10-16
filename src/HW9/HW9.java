package HW9;

import java.lang.Runnable;
import java.util.ArrayList;

public class HW9 {
    public static void main(String[] args) {
        ArrayList < Runnable> CatsDogs = new ArrayList<>();
        CatsDogs.add(new Dog("Бобик"));
        CatsDogs.add(new Dog("Титан"));
        CatsDogs.add(new Cat("Мурка"));
        CatsDogs.add(new Cat("Зефир"));

        for (Runnable i:CatsDogs){
            i.run();
        }
    }
}
