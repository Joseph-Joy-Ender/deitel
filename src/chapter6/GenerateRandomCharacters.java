package chapter6;

public class GenerateRandomCharacters {
    public static char getRandomCharacter(char ch1, char ch2) {
        return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
    }

    // generate random lower case letter
    public static char getRandomLowerCaseLetter() {
        return getRandomCharacter('a', 'z');
    }
    // generate random upper case letter
    public static char getRandomUpperCaseLetter() {
        return getRandomCharacter('A', 'Z');
    }

    // generate a random digit character
    public static char getRandomDigitCharacter() {
        return getRandomCharacter('0', '9');
    }

    public static char getRandomCharacter(){
        return getRandomCharacter('!', '@');
    }

    public static void main(String[] args) {
        System.out.println(getRandomLowerCaseLetter() + "" + getRandomUpperCaseLetter() + getRandomDigitCharacter() + getRandomCharacter());
    }
}
