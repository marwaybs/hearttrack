package cas757.hearttrack;

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
