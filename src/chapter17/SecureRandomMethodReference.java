package chapter17;

import java.security.SecureRandom;
import java.util.stream.Collectors;

public class SecureRandomMethodReference {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.ints(10, 1, 7)
                .forEach(System.out::println);

        String numbers = secureRandom.ints(10, 1, 7)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining("-"));

        System.out.printf("Random numbers on one line %s%n ", numbers);
    }
}

