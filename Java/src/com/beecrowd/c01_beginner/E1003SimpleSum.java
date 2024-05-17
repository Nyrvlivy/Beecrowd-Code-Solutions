package com.beecrowd.c01_beginner;

import java.util.Scanner;

public class E1003SimpleSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int sum = A + B;

        System.out.printf("SOMA = %d%n", sum);

    }
}
