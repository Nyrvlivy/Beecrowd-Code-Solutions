package com.beecrowd.c01_begginer.n1005;

import java.util.Scanner;

public class Average1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double A = (scanner.nextDouble());
        double B = (scanner.nextDouble());

        double average = ((A * 3.5) + (B * 7.5)) / 11;

        System.out.printf("MEDIA = %.5f%n", average);
    }
}

