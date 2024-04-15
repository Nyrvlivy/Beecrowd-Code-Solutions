package com.beecrowd.c01_begginer.n1011;

import java.util.Scanner;

public class Sphere {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double R = scanner.nextDouble();
        double volume = (4.0 / 3) * 3.14159 * Math.pow(R, 3);

        System.out.printf("VOLUME = %.3f%n", volume);
    }
}
