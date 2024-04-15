package com.beecrowd.c01_begginer.n1004;

import java.util.Scanner;

public class SimpleProduct {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int prod = A * B;

        System.out.printf("PROD = %d%n", prod);

    }
}
