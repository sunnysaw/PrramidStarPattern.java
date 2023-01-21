/*
Question : print the hollow rectangle by taking value from user.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a , b;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE FIRST DIGIT :");
        a = sc.nextInt();
        System.out.println("ENTER THE SECOND DIGIT :");
        b = sc.nextInt();
        System.out.println("PRINTING THE RESULT :");
        for (int i = 0; i <= a ; i++){
            for (int j = 0; j <= b; j++){
                if (i == 0 || i == a || j == 0 || j == b) {
                    System.out.print("*");
                }else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}