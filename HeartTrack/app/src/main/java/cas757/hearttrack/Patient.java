package cas757.hearttrack;

/**
 * Created by Bhaag on 2/18/2017.
 */

public class Patient {
    private String name;
    private String lastName;
    private int age;
    private String birthYear;

    public Patient(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
