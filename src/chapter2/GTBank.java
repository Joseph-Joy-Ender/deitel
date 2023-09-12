package chapter2;

import chapter1.MTN;

import java.util.Scanner;

public class GTBank {
    public static void main(String[] args){
        MTN mtn = new MTN();
        Scanner userInput = new Scanner(System.in);


        int map = userInput.nextInt();
        mtn.menu(map);
    }
}
