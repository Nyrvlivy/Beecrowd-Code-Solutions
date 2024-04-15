package com.beecrowd.c01_begginer.n1013;

import java.util.Scanner;

public class TheGreatest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        scanner.close();

        int greatestAB = (A + B + Math.abs(A - B)) / 2;
        int greatest = (greatestAB + C + Math.abs(greatestAB - C)) / 2;

        System.out.printf("%d eh o maior%n", greatest);

    }
}
