package com.lloyds;
import java.util.Scanner;

public class UniqueSum {
    public static int n1, n2, n3;
    public static void readUserInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a positive number:");
        n1 = scanner.nextInt();

        System.out.println("Enter another positive number:");
        n2 = scanner.nextInt();

        System.out.println("Enter another positive number:");
        n3 = scanner.nextInt();
    }

    public static int calculateSum() {
        int sum = 0;

        readUserInput();

        if (n1 != n2 && n1 != n3) {
            sum += n1;
        }
        if (n2 != n1 && n2 != n3) {
            sum += n2;
        }
        if (n3 != n1 && n3 != n2) {
            sum += n3;
        }

        return sum;
    }
}
