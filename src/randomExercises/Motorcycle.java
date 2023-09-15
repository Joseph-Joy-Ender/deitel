package randomExercises;

public class Motorcycle {
    String make;
    String color;
    boolean engineState;

    void startEngine(){
        if (engineState){
            System.out.println("The engine is already on.");
        } else{
            engineState = true;
            System.out.println("The engine is now on.");
        }

    }
    void showAts(){
        System.out.println("This motorcycle is a "
                        + color + " " + make);
        if (engineState) System.out.println("the engine is on.");
        else System.out.println("The engine is off.");
    }

    public static void main(String[] args) {
        Motorcycle motorcycle = new Motorcycle();
        motorcycle.make = "Mercedes Benz";
        motorcycle.color = "Black";
        System.out.println("Calling showAts...");
        motorcycle.showAts();
        System.out.println("....................");
        System.out.println("Starting engine.....");
        motorcycle.startEngine();
        System.out.println("..................");
        System.out.println("Calling showAts.....");
        motorcycle.showAts();
        System.out.println(".................");
        System.out.println("Starting engine.....");
        motorcycle.startEngine();
    }
}
