package task;
public class StudentScore {

        private String name;
        private double average;

    public StudentScore(String name, double average) {
        this.name = name;
        if (average > 0.0)
            if (average <= 100.0)
        this.average = average;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public String getName() {
        return name;
    }

    public double getAverage() {
        return average;
    }

    public String getLetterGrade(){
        String letterGrade = "";

        if (average >= 90){
            letterGrade = "A";
        } else if (average >= 80) {
            letterGrade = "B";
        } else if (average >= 70) {
            letterGrade = "C";
        } else if (average >= 60) {
            letterGrade = "D";
        } else{
            letterGrade = "F";
        }
        return letterGrade;
    }
}

