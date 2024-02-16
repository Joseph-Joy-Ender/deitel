package chapter15;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class DirectoryStreamSample {

    public static void main(String[] args) {
       // String location = "C:\\Users\\Joy-PC\\IdeaProjects\\deitel/src/beginWithJavaExercises";

        //Path path = Path.of("C:\\Users\\Joy-PC\\IdeaProjects\\e-commerce\\src\\main\\java\\com\\semicolon\\africa\\commerce");


        Path path = Path.of("C:\\Users\\Joy-PC\\WebstormProjects\\untitled\\chapter4");
        try {
            if (Files.isDirectory(path)){
                System.out.printf("%nDirectory contents:%n");

                DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path);
                directoryStream.forEach(System.out::println);

            }


        }
        catch (IOException exception){
            System.err.println(exception.getMessage());
        }
    }
}
