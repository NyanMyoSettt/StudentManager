package sample;

import java.util.List;

public class Mentor {
    String name;
    int age;
    String address;
    String fatherName;
    String nrcNO;
    Classroom classroom;
    Occupation occupation;

    public Mentor(String name, int age, String address, String fatherName, String nrcNO, Classroom classroom, Occupation occupation) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.fatherName = fatherName;
        this.nrcNO = nrcNO;
        this.classroom = classroom;
        this.occupation = occupation;
    }
public Mentor(){

}
    public static List<Mentor> defaultMentors() {
        return List.of(
                new Mentor("Ko Kyaw", 20, "Ygn", "U Mya", "12/YGN(N)012454", Classroom.defaultClassrooms().get(0),Occupation.defaultOccupation().get(2)),
                new Mentor("Ko Ye", 21, "Sok", "U Bo", "12/SOK(N)790517", Classroom.defaultClassrooms().get(0),Occupation.defaultOccupation().get(3)),
                new Mentor("Thet Khine", 30, "Bahan", "U Ba Din", "12/YGN(N)548246", Classroom.defaultClassrooms().get(1),Occupation.defaultOccupation().get(0)),
                new Mentor("Thiha", 35, "Ahlone", "U Naung", "12/YGN(N)446324", Classroom.defaultClassrooms().get(1),Occupation.defaultOccupation().get(1))

        );
    }


}


