package org.example;
import java.util.Scanner;

// Matematik,Fizik,kimya,Türkçe,Tarih müzik derslerinin not ortalamasını hesaplayan uygulama

public class Main {
    public static void main(String[] args) {
        //Değişkenlerin oluşturulması

        int mat,fizik,kimya,turkce,tarih,muzik;

        //Kullanıcıdan notların alınması
        Scanner input =new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz:");
        mat=input.nextInt();

        System.out.print("Fizik notunuzu giriniz:");
        fizik=input.nextInt();

        System.out.print("Kimya notunuzu giriniz:");
        kimya=input.nextInt();

        System.out.print("Türkçe notunuzu giriniz:");
        turkce=input.nextInt();

        System.out.print("Tarih notunuzu giriniz:");
        tarih=input.nextInt();

        System.out.print("Müzik notunuzu giriniz:");
        muzik=input.nextInt();

        int toplam=(mat+fizik+kimya+turkce+tarih+muzik);

        double sonuc=toplam/6;

        System.out.println("Ortalama:"+sonuc);
        System.out.print(sonuc>=60 ? "Geçti" : "Kaldı");


    }
}