package leetCode.ArrayQuestions;

public class MostOccurrence {

    public static int mostOccurrence(int[] numbers){
        int occurrence = 0;
        int counter = 0;
        for (int number : numbers) {
            for (int i : numbers) {
                if (number == i) {
                    counter++;
//                    occurrence = numbers[i];
//                    break;
                }

            }

        }
        return occurrence;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 1, 1, 1, 1, 1, 2, 2};
        System.out.println(mostOccurrence(numbers));

    }
}
