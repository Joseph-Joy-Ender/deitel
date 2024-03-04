package femiMorningTask;

import java.util.ArrayList;
import java.util.List;

public class Names {
    public static void main(String[] args) {
      Names names = new Names();
      names.usersAgeAndName();
    }

    public void usersAgeAndName(){
        List<User> users = new ArrayList<>();
        List<String> names = List.of("Joy", "Joseph", "John", "Jennifer", "Juliet", "Julian", "Jackson");

        names.forEach((name) -> users.add(new User(name, name.length())));

        System.out.println(users);
    }
}
