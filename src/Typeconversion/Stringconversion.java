package Typeconversion;

import java.util.Scanner;

public class Stringconversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        String input = scanner.nextLine();
        // convert to int

        int intnumber = Integer.parseInt(input);
        System.out.println(intnumber);

        // convert to double
        double doublenumber = Double.parseDouble(input);
        System.out.println(doublenumber);
           }
}
