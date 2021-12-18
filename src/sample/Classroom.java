package sample;

import java.util.List;

public class Classroom {
    String className;
    int classFees;

    public Classroom(String name, int fees) {
        this.className = name;
        this.classFees = fees;
    }
    public static List<Classroom> defaultClassrooms(){
     return List.of(
             new Classroom("Java",6000),
             new Classroom("Python", 9000)
     );
    }

    @Override
    public String toString() {
        return this.className;
    }
}
