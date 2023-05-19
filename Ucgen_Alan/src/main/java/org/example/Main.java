package org.example;
import java.util.Scanner;
// Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
//Formül:Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
//𝑢 = (a+b+c) / 2
//Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double a,b,c;
        System.out.print("Birinci kenar uzunluğunu giriniz:");
        a=input.nextInt();
        System.out.print("İkinci kenar uzunluğunu giriniz:");
        b=input.nextInt();
        System.out.print("Üçüncü kenar uzunluğunu giriniz:");
        c=input.nextInt();

        double u=(a+b+c)/2;
        double alan=u*(u-a)*(u-b)*(u-c);

        System.out.print("Üçgenin alanı:"+alan);
    }
}