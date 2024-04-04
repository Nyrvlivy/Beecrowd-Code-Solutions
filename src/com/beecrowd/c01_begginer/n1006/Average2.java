package com.beecrowd.c01_begginer.n1006;

import java.util.Scanner;

public class Average2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();
        scanner.close();

        double average = ((A * 2) + (B * 3) + (C * 5)) / 10;

        System.out.printf("MEDIA = %.1f%n", average);
    }
}
