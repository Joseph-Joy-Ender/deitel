package leetCode.ArrayQuestions;

public class RemovingVowelsInString {

    public static String word(String text){
        StringBuilder result = new StringBuilder("".toUpperCase());
        String secondResult = "".toUpperCase();
        String converted = text.toUpperCase();
        String vowels = "aeiou".toUpperCase();
        for (int i = 0; i < vowels.length(); i++) {
            for (int j = 0; j < converted.length(); j++) {
                if (vowels.charAt(i) != converted.charAt(j)){
                  result.append(converted.charAt(j));
                }

            }
            converted = result.toString().toUpperCase();
            secondResult = result.toString();
            result = new StringBuilder();


        }

        return secondResult.toUpperCase();
    }

    public static void main(String[] args) {
        String result = "joseph joy";
        System.out.println(word(result));
    }
}
