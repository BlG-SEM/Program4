package ru.vsu.cs;

import java.util.Scanner;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        int t = readT();
        double sumSequence = summationOfElements(t);
        printSum(sumSequence);
    }

    private static int readT() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter T = ");
        return scanner.nextInt();
    }

    private static double summationOfElements(int t) {
        double elementTwiceBefore = 1;
        double elementBefore = 0.3;
        double sum = elementTwiceBefore + elementBefore;
        for (int i = 3; i <= t; i++) {
             double element = (i + 1) * elementTwiceBefore;
             sum = sum + element;
             elementTwiceBefore = elementBefore;
             elementBefore = element;
        }
        return sum;
    }

    private static void printSum(double sum) {
        Locale.setDefault(Locale.ROOT);
        System.out.printf("The sum of the elements of the sequence is %1$.3f", sum);
    }
}
