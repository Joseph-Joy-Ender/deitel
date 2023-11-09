package leetCode.ArrayQuestions;

public class BeautifyString {


    public String addFullStop(String string){
        int index = string.length() -1;
        String last = String.valueOf(string.charAt(index));
        if (last.endsWith(".")) return string;
        else return string.concat(".");
    }

    public  String capitalizeLetter(String string) {
        String result = String.valueOf(string.charAt(0));
        String replaced = (string.charAt(0) + "").toUpperCase();
        string = string.replace(result, replaced);
        return string;

    }

    public String addFullStopAndCapitalize(String string) {
        return addFullStop(capitalizeLetter(string));
    }

    public static void main(String[] args) {
        BeautifyString beautifyString = new BeautifyString();
        String word = "josephEnderUdeme";
        System.out.println(beautifyString.addFullStopAndCapitalize(word));
    }
}
