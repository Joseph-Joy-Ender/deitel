package chapter15.byteBasedIO.bank;

import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        String location = "C:\\Users\\Joy-PC\\IdeaProjects\\deitel\\src\\chapter15\\byteBasedIO\\bank\\transactions.text";
        List<Transactions> transactionsList = new ArrayList<>();
        transactionsList.add(new Transactions("Jude", "Joy", BigDecimal.valueOf(2000).toString()));
        transactionsList.add(new Transactions("Joy", "Ender", BigDecimal.valueOf(20000).toString()));
        transactionsList.add(new Transactions("Joseph", "Udeme", BigDecimal.valueOf(5000).toString()));

        writeTransactionsTo(transactionsList, location);

    }

    public static void writeTransactionsTo(List<Transactions> transactions, String fileLocation){
        try (FileOutputStream outputStream = new FileOutputStream(fileLocation)){
            for (Transactions transactions1: transactions){
                if (!transactions1.equals(transactions.get(0))){
                    outputStream.write("\n".getBytes());
                    sendToStream(transactions1, outputStream);
                }
                else sendToStream(transactions1, outputStream);
            }
//            String trans = "\n"+transactions.toString();
//            outputStream.write(trans.getBytes());
        }catch (IOException exception){
            exception.printStackTrace();
        }

    }

    private static void sendToStream(Transactions transactions1, FileOutputStream outputStream) throws IOException {
        outputStream.write((transactions1.getAmount().concat("   ").getBytes()));
        outputStream.write(transactions1.getRecipient().concat("    ").getBytes());
        outputStream.write(transactions1.getSender().concat("    ").getBytes());
    }
}
