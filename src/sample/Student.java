package sample;


import java.util.ArrayList;
import java.util.List;

public class Student {
    String name;
    int age;
    String address;
    Occupation occupation;
    String fatherName;
    String nrcNO;
    Classroom classroom;
    Mentor mentor;

    public Student() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Occupation getOccupation() {
        return occupation;
    }

    public void setOccupation(Occupation occupation) {
        this.occupation = occupation;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getNrcNO() {
        return nrcNO;
    }

    public void setNrcNO(String nrcNO) {
        this.nrcNO = nrcNO;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    public Mentor getMentor() {
        return mentor;
    }

    public void setMentor(Mentor mentor) {
        this.mentor = mentor;
    }

    public Student(String name, int age, String address, String fatherName, String nrcNO, Classroom classroom, Occupation occupation) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.fatherName = fatherName;
        this.nrcNO = nrcNO;
        this.classroom = classroom;
        this.occupation = occupation;

    }
    public List<Student> students = new ArrayList<>();

    public List<Student> getStudents() {
        return students;
    }

    public static List<Student> defaultStudents(){
        return List.of(
          new Student("Nyan", 18,"Yangon","U Soe", "123",Classroom.defaultClassrooms().get(0), Occupation.defaultOccupation().get(2)),
          new Student("Thazin", 19,"Mandalay","U Mya", "912",Classroom.defaultClassrooms().get(1), Occupation.defaultOccupation().get(3))
        );
    }


}
