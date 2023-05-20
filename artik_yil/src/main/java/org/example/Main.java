package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year ;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen yıl bilgisini giriniz: ");
        year = input.nextInt();
        if (year % 4 == 0 && year % 100 != 0 ||  year % 400 == 0 )
        {
            System.out.println( year +" Artık Yıldır");

        }
        else
        {
            System.out.println(year +" Artık Yıl Değildir");
        }
    }
}