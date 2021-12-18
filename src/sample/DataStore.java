package sample;

import java.util.ArrayList;
import java.util.List;

public class DataStore {
    public List<Student> students = new ArrayList<>();
    public List<Classroom> classrooms = new ArrayList<>();
    public List<Mentor> mentors = new ArrayList<>();
    public List<Occupation> occupations = new ArrayList<>();

    private static DataStore instance;

    public static DataStore getInstance() {
        if (instance == null) {
            instance = new DataStore();
        }
        return instance;
    }
    private DataStore(){
        classrooms.addAll(Classroom.defaultClassrooms());
        students.addAll(Student.defaultStudents());
        occupations.addAll(Occupation.defaultOccupation());
        mentors.addAll(Mentor.defaultMentors());
    }
    public void addNewStudent(Student student) {
        this.students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }
}
