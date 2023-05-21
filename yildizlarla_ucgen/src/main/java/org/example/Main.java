package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);
       System.out.println("Bir Sayı Giriniz: ");
       int n = input.nextInt();

       for (int i = 0; i < n; i++) {
           for (int j = 0; j < (n - i); j++) {
               System.out.print(" ");
           }
           for (int k = 1; k <= (2 * i + 1); k++) {
               System.out.print("*");
           }
           System.out.println();
       }
       //elmas deseni
        System.out.print("Bir Sayı Giriniz: ");
        int r = input.nextInt();

        // Üst kısmı oluşturma
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= r - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Alt kısmı oluşturma
        for (int i = r - 1; i >= 1; i--) {
            for (int j = 1; j <= r - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}