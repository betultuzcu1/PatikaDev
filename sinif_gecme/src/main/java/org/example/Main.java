package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       //Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik
        //Geçme Notu : 55
        //Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.

        int mat,fizik,turkce,kimya,muzik;

        System.out.print("Matematik notunuzu giriniz:");
        mat=input.nextInt();
        System.out.print("Fizik notunuzu giriniz:");
        fizik=input.nextInt();
        System.out.print("Türkçe notunuzu giriniz:");
        turkce=input.nextInt();
        System.out.print("Kimya notunuzu giriniz:");
        kimya=input.nextInt();
        System.out.print("Müzik notunuzu giriniz:");
        muzik=input.nextInt();

        if (mat >= 0 && mat <= 100 &&
                fizik >= 0 && fizik <= 100 &&
                turkce >= 0 && turkce <= 100 &&
                kimya >= 0 && kimya <= 100 &&
                muzik >= 0 && muzik <= 100) {

            // Ortalama hesaplama
            double ortalama = (mat + fizik + turkce + kimya + muzik) / 5.0;

            // Geçme notu kontrolü
            if (ortalama >= 55) {
                System.out.println("Tebrikler, geçtiniz! Ortalama: " + ortalama);
            } else {
                System.out.println("Maalesef, kaldınız. Ortalama: " + ortalama);
            }

        } else {
            System.out.println("Hatalı not girişi yaptınız. Lütfen 0-100 aralığında notlar girin.");
        }

    }
}