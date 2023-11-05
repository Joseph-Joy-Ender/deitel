package beginWithJavaExercises.StaticExamples;

public class DifferenceBetweenStaticVariableAndInstanceVariable {
    private static int staticField = 0;
    private final int instanceField;

    public DifferenceBetweenStaticVariableAndInstanceVariable(int i){
        instanceField = i;
        staticField++;
    }

    public void show(){
        System.out.println("Value of static field " + staticField + "\n Value of instance field " + instanceField);
    }

    public static void main(String[] args) {

        DifferenceBetweenStaticVariableAndInstanceVariable one = new DifferenceBetweenStaticVariableAndInstanceVariable(3);
        System.out.println("Value of one.show() : ");
        one.show();

        DifferenceBetweenStaticVariableAndInstanceVariable two = new DifferenceBetweenStaticVariableAndInstanceVariable(5);
        System.out.println("Value of two.show(): ");
        two.show();
    }



}
