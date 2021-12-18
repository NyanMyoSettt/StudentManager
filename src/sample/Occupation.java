package sample;

import java.util.List;

public class Occupation {
    String occupationName;

    public Occupation(String occupationName) {
        this.occupationName = occupationName;
    }

    public static List<Occupation> defaultOccupation() {
        return List.of(
                new Occupation("Student"),
                new Occupation("Artist"),
                new Occupation("Merchant"),
                new Occupation("Singer")
        );
    }

    @Override
    public String toString() {
        return this.occupationName;
    }
}
