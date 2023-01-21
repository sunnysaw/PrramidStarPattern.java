/*
Question : Take input from user and print the pyramid star pattern.
 */

import java.util.Scanner;

public class PyramidStarPattern {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE FIRST NUMBER :");
        a = sc.nextInt();
        System.out.println("ENTER THE SECOND NUMBER :");
        b = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            for (int j = i; j <= b; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //System.out.println();
    }
}
