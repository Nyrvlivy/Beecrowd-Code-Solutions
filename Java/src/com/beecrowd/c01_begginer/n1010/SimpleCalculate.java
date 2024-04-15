package com.beecrowd.c01_begginer.n1010;

import java.util.Scanner;

public class SimpleCalculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double total = 0.0;

        while (scanner.hasNextLine()) {
            String product = scanner.nextLine();

            if (product.isEmpty()) {
                break;
            }
            String[] parts = product.split(" ");
            int quantity = Integer.parseInt(parts[1]);
            double price = Double.parseDouble(parts[2]);

            total += quantity * price;
        }

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
        scanner.close();
    }
}
