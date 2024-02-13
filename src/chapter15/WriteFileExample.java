package chapter15;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileExample {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("sample.txt"))){
            writer.write("Hello, from the other side\nI wish i could see you one more time\nGood bye forever");

        }catch (IOException exception){
            System.err.println(exception.getMessage());
        }
    }
}
