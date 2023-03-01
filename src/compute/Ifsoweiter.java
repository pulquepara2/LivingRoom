package compute;

import java.util.Scanner;

public class Ifsoweiter {

    public static void main(String[] args) {
//        boolean isSenior = false;
//        boolean isDog = false;
//        boolean isStudent = false;
//
//        checkifDiscount(isSenior, isStudent, isDog);
//        checkifDiscount(true, false, true);
//        checkifDiscount(false, false, true);
//        checkifDiscount(false, true, true);
//        checkifDiscount(false, false, false);

//        In a bookshop you receive a discount if you buy more than 2 non-fiction books and at least one fiction book.
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter number of nf books: ");
//        int nonfiction = scanner.nextInt();
//
//        Scanner scanner1 = new Scanner(System.in);
//        System.out.println("Please enter number of f books");
//        int fiction = scanner.nextInt();
//
//        bookDiscount(fiction,nonfiction);
    }

//    public static void checkifDiscount(boolean IsSenior, boolean IsStudent, boolean IsDog) {
//        if (IsSenior) {
//            System.out.println("Discount");
//        } else if (IsDog) {
//            System.out.println("Discount");
//        } else if (IsStudent) {
//            System.out.println("Discount");
//        } else {
//            System.out.println("No Discount");
//        }
        double area1 = calculateArea(2.1,3.6);
        double area2 = calculateArea(6.1,7.6);

        if (area1 > area2) {

        {
            System.out.println("Area 1 is the greatest");
        } else {
        System.out.println("Area 2 is the greatest");
    }
    }

    public static String bookDiscount(int nonfiction,/ int fiction) {
        if (nonfiction > 2 && fiction > 0) {
            return "Discount";
        } else {
            return "no Discount";
        }

    }
    public static double calculateArea (double length, double breadth){
        double area = length * breadth;
        return area;
    }
}




