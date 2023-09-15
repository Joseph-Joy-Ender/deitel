package tdd;
public class AirConditions {
    static int initialTemperature = 16;
     public AirConditions() {}

      public void setTemperature(int initialTemperature) {
        AirConditions.initialTemperature = initialTemperature;
     }

     public int getTemperature() {
       return initialTemperature;
     }

    public int temperature() {
          int result = 0;
        if (initialTemperature > 30)
            System.out.println("Temperature is beyond 30");
          else{
            System.out.print("Temperature is above 16");
         }
        return initialTemperature;
    }

    double belowTemperature = 16;
    public double belowTemperature() {
        //  int result = 0;
        if (initialTemperature < 16)
            System.out.println("Temperature is below 16");
        //  else{
        //    System.out.print("Temperature is above 16");
        // }
        return initialTemperature;
    }

    public void increaseTemperature() {
        initialTemperature++;

    }

    public void decreaseTemperature() {
        if(initialTemperature < 16){
            initialTemperature = 16;
        }
    }
}
