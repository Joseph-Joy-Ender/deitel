package femiMorningTask;

import java.util.List;

public class ListOfString {
    public static void main(String[] args) {
      ListOfString listOfString = new ListOfString();
      listOfString.countCharacter();
    }

    public void countCharacter(){
        List<String> stringList = List.of("Joy", "Joseph", "Udeme", "Precious");

        var result =
                stringList.stream()
                        .flatMap((string) -> string.chars().boxed())
                        .count();

        System.out.println(result);

    }
}
