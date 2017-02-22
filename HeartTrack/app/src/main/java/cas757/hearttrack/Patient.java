//patient class to store patient information. Database is updated through the information from this class

package cas757.hearttrack;
//add username and password, dob, male female drop down
public class Patient {
    //first page
    private String _firstName;
    private String _lastName;
    private int _sex;
    private String _email;
    private int _phoneNumber;

    //second page of medical information
    private String _chronicCondition;
    private String _allergies;
    private String _medication;
    private String _vitamins; //optional
    private String _Supplements; //optional

    //third page of relative and physician contact information
    private String _relativeFirstName;
    private String _relativeLastName;
    private String _relativeEmail;
    private int _relativePhoneNumber;

    private String _physicianFirstName;
    private String _physicianLastName;
    private String _physicianEmail;
    private int _physicianPhoneNumber;

    public Patient(String _firstName, String _lastName, int _sex, String _email, int _phoneNumber, String _chronicCondition, String _allergies, String _medication, String _vitamins, String _Supplements, String _relativeFirstName, String _relativeLastName, String _relativeEmail, int _relativePhoneNumber, String _physicianFirstName, String _physicianLastName, String _physicianEmail, int _physicianPhoneNumber) {
        this._firstName = _firstName;
        this._lastName = _lastName;
        this._sex = _sex;
        this._email = _email;
        this._phoneNumber = _phoneNumber;
        this._chronicCondition = _chronicCondition;
        this._allergies = _allergies;
        this._medication = _medication;
        this._vitamins = _vitamins;
        this._Supplements = _Supplements;
        this._relativeFirstName = _relativeFirstName;
        this._relativeLastName = _relativeLastName;
        this._relativeEmail = _relativeEmail;
        this._relativePhoneNumber = _relativePhoneNumber;
        this._physicianFirstName = _physicianFirstName;
        this._physicianLastName = _physicianLastName;
        this._physicianEmail = _physicianEmail;
        this._physicianPhoneNumber = _physicianPhoneNumber;
    }

    public String get_firstName() {
        return _firstName;
    }

    public void set_firstName(String _firstName) {
        this._firstName = _firstName;
    }

    public String get_lastName() {
        return _lastName;
    }

    public void set_lastName(String _lastName) {
        this._lastName = _lastName;
    }

    public int get_sex() {
        return _sex;
    }

    public void set_sex(int _sex) {
        this._sex = _sex;
    }

    public String get_email() {
        return _email;
    }

    public void set_email(String _email) {
        this._email = _email;
    }

    public int get_phoneNumber() {
        return _phoneNumber;
    }

    public void set_phoneNumber(int _phoneNumber) {
        this._phoneNumber = _phoneNumber;
    }

    public String get_chronicCondition() {
        return _chronicCondition;
    }

    public void set_chronicCondition(String _chronicCondition) {
        this._chronicCondition = _chronicCondition;
    }

    public String get_allergies() {
        return _allergies;
    }

    public void set_allergies(String _allergies) {
        this._allergies = _allergies;
    }

    public String get_medication() {
        return _medication;
    }

    public void set_medication(String _medication) {
        this._medication = _medication;
    }

    public String get_vitamins() {
        return _vitamins;
    }

    public void set_vitamins(String _vitamins) {
        this._vitamins = _vitamins;
    }

    public String get_Supplements() {
        return _Supplements;
    }

    public void set_Supplements(String _Supplements) {
        this._Supplements = _Supplements;
    }

    public String get_relativeFirstName() {
        return _relativeFirstName;
    }

    public void set_relativeFirstName(String _relativeFirstName) {
        this._relativeFirstName = _relativeFirstName;
    }

    public String get_relativeLastName() {
        return _relativeLastName;
    }

    public void set_relativeLastName(String _relativeLastName) {
        this._relativeLastName = _relativeLastName;
    }

    public String get_relativeEmail() {
        return _relativeEmail;
    }

    public void set_relativeEmail(String _relativeEmail) {
        this._relativeEmail = _relativeEmail;
    }

    public int get_relativePhoneNumber() {
        return _relativePhoneNumber;
    }

    public void set_relativePhoneNumber(int _relativePhoneNumber) {
        this._relativePhoneNumber = _relativePhoneNumber;
    }

    public String get_physicianFirstName() {
        return _physicianFirstName;
    }

    public void set_physicianFirstName(String _physicianFirstName) {
        this._physicianFirstName = _physicianFirstName;
    }

    public String get_physicianLastName() {
        return _physicianLastName;
    }

    public void set_physicianLastName(String _physicianLastName) {
        this._physicianLastName = _physicianLastName;
    }

    public String get_physicianEmail() {
        return _physicianEmail;
    }

    public void set_physicianEmail(String _physicianEmail) {
        this._physicianEmail = _physicianEmail;
    }

    public int get_physicianPhoneNumber() {
        return _physicianPhoneNumber;
    }

    public void set_physicianPhoneNumber(int _physicianPhoneNumber) {
        this._physicianPhoneNumber = _physicianPhoneNumber;
    }
}