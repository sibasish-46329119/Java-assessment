package com.assessment.increasingordernumber;
import java.util.Scanner;

public class IncreasingOrderNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        boolean isIncreasing = checkIncreasing(number);

        System.out.println(isIncreasing);

    }

    private static boolean checkIncreasing(int number) {
        String numToStr = String.valueOf(number);

        for (int i = 0; i < numToStr.length() - 1; i++) {
            if (numToStr.charAt(i) >= numToStr.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }
}
