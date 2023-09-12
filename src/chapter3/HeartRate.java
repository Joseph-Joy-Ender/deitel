package chapter3;

public class HeartRate {
    private String firstName;
    private String lastName;
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;

    public HeartRate(String firstName, String lastName, int dayOfBirth, int monthOfBirth, int yearOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public void setMonthOfBirth(int monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public int getAgeInYear() {
        return 2023 -  getYearOfBirth();
    }

    public int getMaximumHeartRate() {
        return 220 - getAgeInYear();
    }

    public double targetHeartRate() {
        return getMaximumHeartRate() * 0.85;
          }

        public double minimumTargetHeartRate(){
        return getMaximumHeartRate() * 0.5;
        }
    }

