package chapter6;

public class BeautifyString {

    public static String addFullStop(String string){
        int indexOf = string.length() -1;
        char lastCharacter = string.charAt(indexOf);
        boolean stringContains = lastCharacter != '.';
        if (stringContains) return string+ ".";
        return string;
    }

    public static String capitalizeLetter(String string) {
        return ((string.charAt(0) + "").toUpperCase()) + string.substring(1);
    }

    public static String beautifiedString(String word) {
        return addFullStop(capitalizeLetter(word));
    }
}
