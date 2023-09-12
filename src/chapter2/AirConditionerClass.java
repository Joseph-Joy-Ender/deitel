package chapter2;

public class AirConditionerClass {
    int temperature = 16;

    public AirConditionerClass(){
    }

   public double belowTemperature(){
      if(this.temperature < 16);
      System.out.println("Temperature is below 16");
       return (double) this.temperature;
   }


}
