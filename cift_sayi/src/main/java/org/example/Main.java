package org.example;
import java.util.Scanner;
//Döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan program

public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int number;
        int count=0;
        int sum=0;

        System.out.print("Lütfen bir sayı giriniz:");
        number=input.nextInt();

        for (int i=1;i<number;i++)
        {
            if(i%3==0 && i%4==0)
            {
                sum+=i;
                count++;
                double avg=sum/count;
                System.out.println("Ortalama:"+avg);
            }

        }

    }
}