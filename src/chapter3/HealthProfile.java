package chapter3;

public class HealthProfile {
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private int monthOfBirth;
    private int dayOfBirth;
    private int yearOfBirth;
    private double height;
    private double weight;

    public HealthProfile() {
    }

    public HealthProfile(String firstName, String lastName, String gender, int monthOfBirth, int dayOfBirth, int yearOfBirth, int height, int weight, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.monthOfBirth = monthOfBirth;
        this.dayOfBirth = dayOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.height = height;
        this.weight = weight;
        this.age = age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public void setMonthOfBirth(int monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return 2023 - getYearOfBirth();
    }


    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public double maximumHeartRate(){
        return 220 - getAge();
    }

    public double targetHeartRate(){
        return maximumHeartRate() * 0.85;
    }

    public double minimumTargetHeartRate(){
        return maximumHeartRate() * 0.5;
    }

public double bodyMassIndex(){
    return (double) (getWeight() * 703) / getHeight() * getHeight();
    }
}
