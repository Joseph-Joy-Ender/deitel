package chapter15.byteBasedIO.dataInputStream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreams {

    public static void main(String[] args) {
        String location = "C:\\Users\\Joy-PC\\WebstormProjects\\untitled\\chapter4\\CreditLimitCalculator.js";
        try (DataInputStream inputStream = new DataInputStream(
                new FileInputStream(location)
        )){
            byte[] bytes = inputStream.readAllBytes();
            System.out.println(new String(bytes));
        }catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}
