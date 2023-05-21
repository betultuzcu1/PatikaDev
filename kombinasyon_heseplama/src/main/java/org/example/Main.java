package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, r;
        int faktoriyeln = 1;
        int faktoriyelr = 1;
        int faktoriyel = 1;
        int c;

        System.out.println("--Kombinasyon hesaplanması--");
        System.out.print("Kümenin eleman sayısı(n): ");
        n = input.nextInt();
        System.out.print("Oluşturulacak alt kümelerin eleman sayısı(r): ");
        r = input.nextInt();

        // Faktöriyelin hesaplanması (n)
        for (int i = 1; i <= n; i++) {
            faktoriyeln *= i;
        }

        // Faktöriyelin hesaplanması (r)
        for (int i = 1; i <= r; i++) {
            faktoriyelr *= i;
        }

        // Faktöriyelin hesaplanması (n-r)
        for (int i = 1; i <= (n-r); i++) {
            faktoriyel *= i;
        }


        c = faktoriyeln / (faktoriyelr * faktoriyel);

        System.out.println("n'in r'li kombinasyonu: " + c);

    }
}