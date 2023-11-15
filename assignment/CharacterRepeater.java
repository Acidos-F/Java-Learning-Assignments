package com.assignment;

import java.util.Scanner;

public class CharacterRepeater {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.printf("CHARACTER REPEATER%nThis program will repeat the character in a String (n) number of times.%n%nEnter a String:%n");
        String userInput = sc.nextLine();
        System.out.print("Number of times: ");
        int repeat = sc.nextInt();

        if (repeat <= 0) {
            System.out.println("Invalid number of repetition.");
            if (userInput == null || userInput.trim().isEmpty()) {
                System.out.println("The input is empty or contains only whitespace.");
            }
        } else if (userInput == null || userInput.trim().isEmpty()) {
            System.out.println("The input is empty or contains only whitespace.");
        } else {
            repeatCharacters(userInput, repeat);
        }
        sc.close();
    }

    public static void repeatCharacters(String str, int times) {
        StringBuilder repeatedString = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            for (int j = 1; j <= times; j++) {
                repeatedString.append(str.charAt(i)); // append the char on repeatedString
            }
        }

        System.out.printf("%nOriginal String: %s%nRepeated String: %s%n", str, repeatedString);
    }

}
