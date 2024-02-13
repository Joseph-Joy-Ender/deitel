package chapter15;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadLinesFromFileExample {
    public static void main(String[] args) {
        Path filePath = Paths.get("sample.txt");
        try {
            List<String> lines = Files.readAllLines(filePath);
            for (String line: lines){
                System.out.println(line);
            }
        }catch (IOException exception){
            System.err.println(exception.getMessage());
        }
    }
}
