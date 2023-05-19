package org.example;
import  java.util.Scanner;
// kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
//Kilo (kg) / Boy(m) * Boy(m)
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double boy,kilo;
        System.out.print("Kilonuzu giriniz:");
        kilo=input.nextDouble();

        System.out.print("Boyunuzu giriniz(cm):");
        boy=input.nextDouble();
        boy=boy/100;
        double index=kilo/(boy*boy);

        System.out.print("Vücut Kitle İndeksiniz:"+index);

    }
}