package w3resource.recursiveQuestions;

import java.util.ArrayList;
import java.util.List;

public class StringPermutation {
    public List<String> permutations(String str){
       List<String> permutations = new ArrayList<>();
       generatePermutations(str, "", permutations);
       return permutations;
    }

    private void generatePermutations(String str, String current, List<String> permutations) {
       if (str.isEmpty()){
           permutations.add(current);
           return;
       }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String remaining = str.substring(0, i) + str.substring(i + 1);
            generatePermutations(remaining, current + ch, permutations);

        }
    }

    public static void main(String[] args) {
        String input = "joy";
        StringPermutation perm = new StringPermutation();
        List < String > permutations = perm.permutations(input);
        System.out.println("Permutations of \"" + input + "\":");
        for (String permutation: permutations) {
            System.out.println(permutation);
        }
    }

}

