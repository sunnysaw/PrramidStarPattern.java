/*
Question : we have take input from user and print triangular star pattern.
 */

import java.util.Scanner;

public class TriangularPattern {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE FIRST NUMBER :");
        a = sc.nextInt();
        System.out.println("ENTER THE SECOND NUMBER :");
        b = sc.nextInt();
        System.out.println("NOW' PRINTING THE RESULT :");
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("PRINTING THE ANOTHER OPPOSITE TRIANGLE :");
        for (int i = 1; i <= a; i++) {
            for (int j = i; j <= a; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
