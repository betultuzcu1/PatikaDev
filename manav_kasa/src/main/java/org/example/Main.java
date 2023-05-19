package org.example;
import java.util.Scanner;
// kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.
//Meyveler ve KG Fiyatları
//Armut : 2,14 TL
//Elma : 3,67 TL
//Domates : 1,11 TL
//Muz: 0,95 TL
//Patlıcan : 5,00 TL
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double armutFiyat=2.14;
        double elmaFiyat=3.67;
        double domatesFiyat=1.11;
        double muzFiyat=0.95;
        double patlıcanFiyat=5;

        double armutKg,elmaKg,domatesKg,muzKg,patlıcanKg;

        System.out.print("Armut kg:");
        armutKg=input.nextDouble();
        System.out.print("Elma kg:");
        elmaKg=input.nextDouble();
        System.out.print("Domates kg:");
        domatesKg=input.nextDouble();
        System.out.print("Muz kg:");
        muzKg=input.nextDouble();
        System.out.print("Patlıcan kg:");
        patlıcanKg=input.nextDouble();

        double toplam=(armutKg*armutFiyat)+(elmaFiyat*elmaKg)+(domatesFiyat*domatesKg)+(muzFiyat*muzKg)+(patlıcanFiyat*patlıcanKg);

        System.out.print("Toplam tutar:"+toplam);
    }
}