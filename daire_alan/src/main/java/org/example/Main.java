package org.example;
import java.util.Scanner;

// Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
//𝜋 sayısını = 3.14 alınız.
//Formül : (𝜋 * (r*r) * 𝛼) / 360
public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        double r,a;
        double pi=3.14;

        System.out.print("Daire diliminin yarıçapını giriniz:");
        r=input.nextDouble();

        System.out.print("Daire diliminin merkez açısının ölçüsünü giriniz:");
        a=input.nextDouble();

        double alan=(pi*(r*r)*a)/360;

        System.out.print("Daire diliminin alanı:"+alan);
    }
}

