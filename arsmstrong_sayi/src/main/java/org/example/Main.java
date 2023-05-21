package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        int number = input.nextInt();
        int basNumber = 0;
        int tempNumber = number;
        int basValue;
        int result = 0;
        int basPow;

        while (tempNumber != 0) {
            tempNumber /= 10;
            basNumber++;
        }

        tempNumber = number;
        while (tempNumber != 0) {
            basValue = tempNumber % 10;
            // 1*1*1*1 = 1^4
            basPow = 1;
            for (int i = 1; i <= basNumber; i++) {
                basPow *= basValue;
            }
            result += basPow;
            tempNumber /= 10;
        }

        if (result == number) {
            System.out.println(number + " sayısı bir Armstrong sayıdır.");
        } else {
            System.out.println(number + " sayısı bir Armstrong sayısı değildir.");
        }


        //Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.

        System.out.print("Bir sayı girin: ");
        int sayi = input.nextInt();

        int toplam = 0;
        int temp = sayi;

        while (temp != 0) {
            int basamak = temp % 10;
            toplam += basamak;
            temp /= 10;
        }

        System.out.println("Basamakların toplamı: " + toplam);

    }
}