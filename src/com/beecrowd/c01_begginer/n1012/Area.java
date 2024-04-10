package com.beecrowd.c01_begginer.n1012;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        double triangleArea = (A * C) / 2;
        double circleArea = 3.14159 * Math.pow(C, 2);
        double trapeziumArea = ((A + B) * C) / 2;
        double squareArea = Math.pow(B, 2);
        double rectangleArea = A * B;

        System.out.printf(
            "TRIANGULO: %.3f%n" +
            "CIRCULO: %.3f%n" +
            "TRAPEZIO: %.3f%n" +
            "QUADRADO: %.3f%n" +
            "RETANGULO: %.3f%n",
            triangleArea,
            circleArea,
            trapeziumArea,
            squareArea,
            rectangleArea
        );

    }
}
