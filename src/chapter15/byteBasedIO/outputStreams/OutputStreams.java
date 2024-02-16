package chapter15.byteBasedIO.outputStreams;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreams {

    public static void main(String[] args) {
        try (FileOutputStream outputStream =
                     new FileOutputStream("C:\\Users\\Joy-PC\\IdeaProjects\\deitel\\src\\chapter15\\byteBasedIO\\inputOutputStreams\\example.txt")){
            String data = "New things";
            byte[] bytes = data.getBytes();
            outputStream.write(bytes);

        }catch (IOException exception){
            exception.printStackTrace();
        }
    }
}
