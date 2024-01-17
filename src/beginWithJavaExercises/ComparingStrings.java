package beginWithJavaExercises;

public class ComparingStrings {
    public static void main(String[] args) {

        String name1 = "Joy Joseph";
        String name2 = "Miracle Joseph";

        System.out.println("The names are not the same");

        int flag = name1.compareTo(name2);

        if (flag == 0){
            System.out.println("The names are the same.");
        } else if (flag < 0) {
            System.out.println("Name1 comes before name2");
        }else {
            System.out.println("Name2 comes before name1");
        }

    }

}
