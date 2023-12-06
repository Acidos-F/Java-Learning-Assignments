package com.main;

public class Main {

    public static void main(String[] args) {
        problemThirteen();
    }

    public static void problemOne() {
        int main = 0;
        for (int i = 0; i < 5; i++) {
            main += i * 2;
        }
        System.out.println(main); // Answer: 20
    }

    public static void problemTwo() {
        int[] array = {2, 4, 6, 8, 10, 12};
        int george = 0;
        for (int i = 0; i < array.length; i++) {
            george += array[i];
        }
        System.out.println(george); // Answer: 42
    }

    public static void problemThree() {
        int[] list = {0, 5, 10, 15, 20};
        for (int j = 0; j < 5; j++) {
            System.out.print(list[j] + " "); // Answer: 0 5 10 15 20
        }
        System.out.println();
    }

    public static void problemFour() {
        String[] strArray1;
        strArray1 = new String[1];
        System.out.println(strArray1[0]); // Answer: null
    }

    public static void problemFive() {
        int[] intArray1;
        intArray1 = new int[2];
        intArray1[0] = 22;
        intArray1[1] = 44;
        System.out.println(intArray1[0]); // Answer: 22
    }
    
    public static void problemSix() {
        String strArray3[] = new String[3]{"one", "rt", "je"};
        System.out.println(strArray3[1]); // Answer: Uncompilable code - array creation with both dimension expression and initialization is illegal
    }
    
    public static void problemSeven() {
        int[] numbers = new int[10];
        numbers[10] = 15;
        System.out.println(numbers[10]); // Answer: Index 10 out of bounds for length 10
    }
    
    public static void problemEight() {
        int[] a = new int[5];
        a[0] = 5;
        a[1] = 4;
        a[2] = 3;
        System.out.println(a[0] + a[1] + a[4]); // Answer: 9
    }
    
    public static void problemNine() {
        int[] num = new int[10];
        for (int x = 1; x < num.length; x++) {
            num[x] = num[0];
        }
        for (int i : num) {
            System.out.println(i); // Answer: Copies the content of cell 0 into all other cells.
        }
    }
    
    public static void problemTen() {
        String[] names = {"June", "July", "August"};
        for (String name : names) {
            System.out.print(names + ","); // Answer: Garbage Output
        }
    }
    
    public static void problemEleven() {
        int[] numbers = new int[13];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i); // Answer: 12
        }
    }
    
    public static void problemTwelve() {
        int[] numbers = new int[13];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i); // Answer: 12
        }
    }

    public static void problemThirteen() {
        String[] name = {"June", "July", "Jay", "Jill", "Jane"};
        for (int i = 0; i < name.length; i = i + 2) {
            System.out.print(name[i] + " "); // Answer: June Jay Jane
        }
    }
}
