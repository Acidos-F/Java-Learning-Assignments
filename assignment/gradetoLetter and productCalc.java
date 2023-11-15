package com.Assignment;

import java.util.Scanner;
import java.text.DecimalFormat;

public class MainClass {

    static Scanner sc = new Scanner(System.in);
    static DecimalFormat df = new DecimalFormat("#.##");

    public static void main(String[] args) {
        // computeGrades();
        computeProducts();
    }

    public static void computeGrades() {
        double avgGrade = 0;

        System.out.printf("Welcome to the Student Grade Calculator!%nEnter the number of students in the class: ");
        int numberofStudent = sc.nextInt();

        while (numberofStudent <= 0) {
            System.out.printf("Invalid Number of Students. Try again.%nEnter the number of students in the class: ");
            numberofStudent = sc.nextInt();
        }

        System.out.println();

        for (int i = 1; i <= numberofStudent; i++) {
            sc.nextLine();

            System.out.printf("Student #%d%nStudent Name : ", i);
            String studentName = sc.nextLine();
            System.out.print("Student Grade: ");
            double studentGrade = sc.nextDouble();

            while (studentGrade < 0 || studentGrade > 100) {
                System.out.printf("Invalid Grade. Try again.%nStudent Grade : ");
                studentGrade = sc.nextDouble();
            }

            char letterGrade = (studentGrade >= 90.0) ? 'A' : (studentGrade >= 80.0) ? 'B' : (studentGrade >= 70.0) ? 'C' : (studentGrade >= 60.0) ? 'D' : 'F';

            System.out.printf("Letter grade for %s: %c%n%n", studentName, letterGrade);
            avgGrade += studentGrade;
        }
        System.out.printf("Average Grade: %s%n", df.format(avgGrade / numberofStudent));
    }

    public static void computeProducts() {
        double totalBill = 0;

        System.out.printf("Welcome to the Product Billing System!%nNumber of products: ");
        int numofProducts = sc.nextInt();

        while (numofProducts <= 0) {
            System.out.printf("Invalid Number of Products. Try again.%nNumber of products: ");
            numofProducts = sc.nextInt();
        }

        System.out.println();

        for (int i = 1; i <= numofProducts; i++) {
            sc.nextLine();
            double totalPrice;
            System.out.printf("Product #%d%nName: ", i);
            String productName = sc.nextLine();
            System.out.print("Quantity: ");
            int productQuantity = sc.nextInt();

            while (productQuantity <= 0) {
                System.out.printf("Invalid Quantity.%nQuantity: ");
                productQuantity = sc.nextInt();
            }

            System.out.print("Price: ");
            double productPrice = sc.nextDouble();

            totalPrice = productPrice * productQuantity;
            totalBill += totalPrice;
            System.out.printf("Total Price %.1f%n%n", totalPrice);
        }
        System.out.printf("Total Billing Amount: PHP%.1f%n", totalBill);
    }
}
