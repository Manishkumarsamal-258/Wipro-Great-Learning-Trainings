package com;

import java.util.Scanner;

class Progames {
    Scanner sc = new Scanner(System.in);

    void add2num() {
        System.out.println("Enter 2 numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Sum = " + (a + b));
    }

    void maxof2num() {
        System.out.println("Enter 2 numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Max = " + (a > b ? a : b));
    }

    void minof2num() {
        System.out.println("Enter 2 numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Min = " + (a < b ? a : b));
    }

    void avgof3num() {
        System.out.println("Enter 3 numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Average = " + ((a + b + c) / 3.0));
    }
}

public class Demo3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Progames p = new Progames();

        int ch1 = 0;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1) Add 2 numbers");
            System.out.println("2) Max of 2 numbers");
            System.out.println("3) Min of 2 numbers");
            System.out.println("4) Average of 3 numbers");
            System.out.println("5) Exit");

            ch1 = sc.nextInt();

            if (ch1 == 1) p.add2num();
            else if (ch1 == 2) p.maxof2num();
            else if (ch1 == 3) p.minof2num();
            else if (ch1 == 4) p.avgof3num();
            else if (ch1 == 5) System.out.println("Exiting...");
            else System.out.println("Invalid choice!");

        } while (ch1 != 5);
    }
}