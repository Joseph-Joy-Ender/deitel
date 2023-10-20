package task;
public class Anagrams {


    public static boolean isAnagram(String first, String second){
        for (int i = 0; i < first.length(); i++) {
            String element = String.valueOf(second.charAt(i));
        }

        return first.equals(second);


    }


    public static void main(String[] args) {
     String first = "lives";
     String second = "evils";
        System.out.println(isAnagram(first, second));
    }
}
