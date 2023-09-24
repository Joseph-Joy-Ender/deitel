package moocJavaProgrammingExercise;

public class Statistics {

    private int count;
    private int sum;
    public int getCount() {
        return this.count;
    }

    public int sum(){
       return this.sum;
    }

    public Statistics(){
       this.count = 0;
       this.sum = 0;
    }
    public void addNumber(int number){
        this.count++;
        this.sum += number;
    }
    public int average(){
        return this.sum / this.count;
    }

    public static void main(String[] args) {
        Statistics statistics = new Statistics();
        statistics.addNumber(3);
        statistics.addNumber(4);
        statistics.addNumber(2);
        statistics.addNumber(12);
        System.out.println("Count " + statistics.getCount());
        System.out.println("Sum " + statistics.sum());
        System.out.println("Average " + statistics.average());

    }
}
