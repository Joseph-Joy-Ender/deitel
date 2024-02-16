package chapter15.byteBasedIO.inputOutputStreams;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreams {

    public static void main(String[] args) {
        try (FileInputStream fileInputStream =
                     new FileInputStream("C:\\Users\\Joy-PC\\IdeaProjects\\deitel\\src\\chapter15\\inputOutputStreams\\example.txt")){
           byte[] fileBytes = fileInputStream.readNBytes(16);
            System.out.println(new String(fileBytes));

            fileInputStream.skip(-16);
            byte[] bytes = fileInputStream.readAllBytes();
            System.out.println(new String(bytes));


        }   catch (IOException exception)  {
            exception.printStackTrace();

        }
    }
}
