package HW10;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Student man1=new Student("Oleg");
        Student man2=new Student("Masha");
        man1.addRank("Math", 5);
        man1.addRank("Physics", 4);
        man1.addRank("Culture", 3);
        man1.addRank("Physics", 5);
        man1.showRank();
        man2.addRank("Math", 4);
        man2.addRank("English", 5);
        man2.addRank("German", 5);
        man2.addRank("German",4);
        man2.showRank();
    }

    static class Student{
        String name;
        HashMap<String, Integer> st=new HashMap<>();

        public Student(String name) {
            this.name = name;
        }

        public void addRank(String discipline, Integer rank){
            if (st.containsKey(discipline)) System.out.println(name+ " - предмет уже есть");
            else st.put(discipline, rank);
        }

        public void showRank(){
            System.out.println(name + ": " + st.values());
        }
    }
}
