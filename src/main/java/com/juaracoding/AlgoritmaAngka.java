package com.juaracoding;

public class AlgoritmaAngka {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int repeats = 5;

        for (int k = 0; k < repeats; k++) {
            for (int j = 0; j < numbers.length; j++) {
                if (j % 2 == 0) {
                    System.out.print(numbers[j]);
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
            if (numbers.length > 2) {
                int[] newNumbers = new int[numbers.length - 2];
                for (int j = 1; j < numbers.length - 1; j++) {
                    newNumbers[j - 1] = numbers[j];
                }
                numbers = newNumbers;
            } else {
                break;
            }
        }
    }
}
