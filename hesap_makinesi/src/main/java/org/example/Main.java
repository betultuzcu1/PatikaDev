package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        double sayi1,sayi2;

        System.out.print("Lütfen birinci sayıyı giriniz:");
        sayi1=input.nextDouble();

        System.out.print("Lütfen ikinci sayıyı giriniz:");
        sayi2=input.nextDouble();

        System.out.println("Lütfen aşağıdan yapmak istediğiniz işlemi seçiniz!");
        System.out.println("1.Toplama\n2.Çıkarma\n3.Çarpma\n4.Bölme");
        System.out.print("Seçiminiz:");
        int secim=input.nextInt();
        switch (secim){
            case 1:
                System.out.print("Toplam:"+(sayi1+sayi2));
                break;
            case 2:
                System.out.print("Çıkarma:"+(sayi1-sayi2));
                break;
            case 3:
                System.out.print("Çarpma:"+(sayi1*sayi2));
                break;
            case 4:
                System.out.print("Toplam:"+(sayi1/sayi2));
                break;
            default:
                System.out.print("Hatalı seçim yaptınız,lütfen tekrar deneyiniz...");
                break;
        }
    }
}