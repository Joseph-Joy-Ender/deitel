package chapter15.byteBasedIO.inputOutputStreams;

import chapter15.byteBasedIO.bank.Transactions;

import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreams {

    public static void main(String[] args) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(System.out)){

            Transactions transactions = new Transactions("Joyce", "Chloe", "2000");
            outputStream.writeObject(transactions);
        }catch (IOException exception){
            exception.printStackTrace();
           // System.err.println(exception.getMessage());
        }
    }
}
