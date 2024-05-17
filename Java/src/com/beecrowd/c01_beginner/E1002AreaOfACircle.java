package com.beecrowd.c01_beginner;

import java.util.Scanner;

public class E1002AreaOfACircle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final double PI = 3.14159;
        double area = PI * (Math.pow(scanner.nextDouble(), 2));

        System.out.printf("A=%.4f%n", area);

    }
}
