package beginWithJavaExercises.ArraysAndArrayList;

public class CheckIfNumberExistBetweenTwoIndices {

    public static boolean checkNumberExists(int number, int indices1, int indices2, int target) {
        String value = String.valueOf(number);
        String variable1 = String.valueOf(value.charAt(indices1));
        int number1 = Integer.parseInt(variable1);
        String variable2 = String.valueOf(value.charAt(indices2));
        int number2 = Integer.parseInt(variable2);

        return number1 < target && number2 > target;
    }









    public static void main(String[] args) {
        int number = 13579;
        int indices1 = 1;
        int indices2 = 3;
        int target = 5;
        System.out.println(checkNumberExists(number, indices1, indices2, target));
    }
}
