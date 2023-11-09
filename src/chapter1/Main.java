package chapter1;

import java.awt.*;

public class Main {
    public static void main(String[] args) {

     //   System.out.println(font);
       // System.out.println("Hello world!");
        Main main = new Main();

    }
    Font font = new Font("TimesRoman", Font.BOLD, 36);
    public void paint(Graphics graphics) {
        graphics.setFont(font);
        graphics.setColor(Color.red);
        graphics.drawString("Hello Again!", 5, 25);
    }
}