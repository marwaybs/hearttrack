package cas757.hearttrack;

public class Patient {
    private String firstName;
    private String lastName;
    private int sex;
    private String email;
    private int phoneNumber;

    private String chronicCondition;
    private String allergies;
    private String medication;
    private String vitamins; //optional
    private String Supplements; //optional

    private String relativeFirstName;
    private String relativeLastName;
    private String relativeEmail;
    private int relativePhoneNumber;

    private String physicianFirstName;
    private String physicianLastName;
    private String physicianEmail;
    private int physicianPhoneNumber;

    public Patient(String firstName, String lastName, int sex, String email, int phoneNumber, String chronicCondition, String allergies, String medication, String vitamins, String supplements, String relativeFirstName, String relativeLastName, String relativeEmail, int relativePhoneNumber, String physicianFirstName, String physicianLastName, String physicianEmail, int physicianPhoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.chronicCondition = chronicCondition;
        this.allergies = allergies;
        this.medication = medication;
        this.vitamins = vitamins;
        Supplements = supplements;
        this.relativeFirstName = relativeFirstName;
        this.relativeLastName = relativeLastName;
        this.relativeEmail = relativeEmail;
        this.relativePhoneNumber = relativePhoneNumber;
        this.physicianFirstName = physicianFirstName;
        this.physicianLastName = physicianLastName;
        this.physicianEmail = physicianEmail;
        this.physicianPhoneNumber = physicianPhoneNumber;
    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getChronicCondition() {
        return chronicCondition;
    }

    public void setChronicCondition(String chronicCondition) {
        this.chronicCondition = chronicCondition;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public String getMedication() {
        return medication;
    }

    public void setMedication(String medication) {
        this.medication = medication;
    }

    public String getVitamins() {
        return vitamins;
    }

    public void setVitamins(String vitamins) {
        this.vitamins = vitamins;
    }

    public String getSupplements() {
        return Supplements;
    }

    public void setSupplements(String supplements) {
        Supplements = supplements;
    }

    public String getRelativeFirstName() {
        return relativeFirstName;
    }

    public void setRelativeFirstName(String relativeFirstName) {
        this.relativeFirstName = relativeFirstName;
    }

    public String getRelativeLastName() {
        return relativeLastName;
    }

    public void setRelativeLastName(String relativeLastName) {
        this.relativeLastName = relativeLastName;
    }

    public String getRelativeEmail() {
        return relativeEmail;
    }

    public void setRelativeEmail(String relativeEmail) {
        this.relativeEmail = relativeEmail;
    }

    public int getRelativePhoneNumber() {
        return relativePhoneNumber;
    }

    public void setRelativePhoneNumber(int relativePhoneNumber) {
        this.relativePhoneNumber = relativePhoneNumber;
    }

    public String getPhysicianFirstName() {
        return physicianFirstName;
    }

    public void setPhysicianFirstName(String physicianFirstName) {
        this.physicianFirstName = physicianFirstName;
    }

    public String getPhysicianLastName() {
        return physicianLastName;
    }

    public void setPhysicianLastName(String physicianLastName) {
        this.physicianLastName = physicianLastName;
    }

    public String getPhysicianEmail() {
        return physicianEmail;
    }

    public void setPhysicianEmail(String physicianEmail) {
        this.physicianEmail = physicianEmail;
    }

    public int getPhysicianPhoneNumber() {
        return physicianPhoneNumber;
    }

    public void setPhysicianPhoneNumber(int physicianPhoneNumber) {
        this.physicianPhoneNumber = physicianPhoneNumber;
    }

}