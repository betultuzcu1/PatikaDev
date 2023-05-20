package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int i,counter=0;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Lütfen bir sayı giriniz: ");
            i = input.nextInt();
            if (i % 4 == 0){
                counter += i;
            }
        } while (i % 2 == 0);

        System.out.println("Toplam: " + counter);
    }

}