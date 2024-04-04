package com.beecrowd.c01_begginer.n1007;

import java.util.Scanner;

public class Difference {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        scanner.close();

        int difference = (A * B) - (C * D);

        System.out.printf("DIFERENCA = %d%n", difference);
    }
}
