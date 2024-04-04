package com.beecrowd.c01_begginer.n1005;

import java.util.Scanner;

public class Average1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double A = (scanner.nextDouble()) * 3.5;
        double B = (scanner.nextDouble()) * 7.5;

        double MEDIA = (A + B) / 11;

        System.out.printf("MEDIA = %.5f%n", MEDIA);
    }
}

