package com.beecrowd.c01_begginer.n1010;

import java.util.Scanner;

public class SimpleCalculateV2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String data = scanner.useDelimiter("\\A").next();
        scanner.close();

        String[] products = data.split("\\s*\\n\\s*");

        double total = 0;

        for (String product : products) {
            String[] field = product.split(" ");
            int quantity = Integer.parseInt(field[1]);
            double price = Double.parseDouble(field[2]);

            total += quantity * price;
        }

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
    }
}
