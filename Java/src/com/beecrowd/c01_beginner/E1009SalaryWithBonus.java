package com.beecrowd.c01_beginner;

import java.util.Scanner;

public class E1009SalaryWithBonus {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String employeeName = scanner.nextLine();
        double fixedSalary = scanner.nextDouble();
        double totalSales = scanner.nextDouble();
        scanner.close();

        double totalSalary = fixedSalary + (totalSales * 0.15);

        System.out.printf("TOTAL = R$ %.2f%n", totalSalary);
    }
}
