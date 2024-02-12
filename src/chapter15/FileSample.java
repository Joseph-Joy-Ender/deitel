package chapter15;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileSample {
    public static void createFile(String location, String fileName) {
        Path path = Path.of(location, fileName);

        try {
            Files.createFile(path);
        }catch (IOException exception){
            System.err.println(exception.getMessage());
        }

    }

    public static void createDirectory(String location) {
        Path path = Path.of(location);
        try {
            Files.createDirectory(path);
        }
        catch (IOException exception){
            System.err.println(exception.getMessage());
        }
    }

    public static void delete(String location) {
        Path path = Path.of(location);
        try {
            Files.delete(path);
        }
        catch (IOException e){
            System.err.println(e.getMessage());
        }

    }
}
