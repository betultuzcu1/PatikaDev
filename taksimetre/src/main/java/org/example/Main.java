package org.example;
import java.util.Scanner;
// gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
//Taksimetre KM başına 2.20 TL tutmaktadır.
//Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
//Taksimetre açılış ücreti 10 TL'dir.
public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        double startPrice=10;
        double kmPrice=2.20;
        int km;
        double totalPrice;

        System.out.print("Gidilen km miktarını giriniz:");
        km=input.nextInt();

        totalPrice=(km*kmPrice)+startPrice;

        totalPrice=(totalPrice<20) ? 20 :totalPrice;

        System.out.print("Taksimetre tutarı:"+totalPrice);

    }
}