package beginWithJavaExercises;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class EndOfFile {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("ocean.txt");
        Scanner infile = new Scanner(fr);

        while (infile.hasNext()){
            String line = infile.nextLine();
            System.out.println(line);

        }
        infile.close();
    }
}
