package Typeconversion;

import java.util.Scanner;

public class Durchdrei {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int firstnumber = scanner.nextInt();

        Scanner scanner1 = new Scanner(System.in);
        int secondnumber = 3;

        int result = firstnumber % secondnumber;

        if (result == 0) {
            System.out.println("divisible by 3");
        } else System.out.println("not divisible by 3");
    }
        }


