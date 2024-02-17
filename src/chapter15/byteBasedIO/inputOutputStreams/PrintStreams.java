package chapter15.byteBasedIO.inputOutputStreams;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreams {

    public static void main(String[] args) throws FileNotFoundException {
        String location = "C:\\Users\\Joy-PC\\IdeaProjects\\deitel\\src\\chapter15\\byteBasedIO.io\\inputOutputStreams\\example.txt";
        String error = "C:\\Users\\Joy-PC\\IdeaProjects\\deitel\\src\\chapter15\\byteBasedIO\\inputOutputStreams\\error.txt";
        try (PrintStream outputStream = new PrintStream(location)){
            System.setOut(outputStream);

            System.out.println("Hello everybody, join us for game night later today.");
        }catch (IOException e){
            PrintStream printStream = new PrintStream(error);
            System.setErr(printStream);
            System.err.println(e.getMessage());
        }

//        PrintStream printStream = new PrintStream(System.out);
//           printStream.println();


    }
}
