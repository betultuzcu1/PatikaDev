package org.example;
import java.util.Scanner;
//Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız.
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int sayi1,sayi2,sayi3;

        System.out.print("Lütfen birinci sayıyı giriniz:");
        sayi1=input.nextInt();
        System.out.print("Lütfen ikinci sayıyı giriniz:");
        sayi2=input.nextInt();
        System.out.print("Lütfen üçüncü sayıyı giriniz:");
        sayi3=input.nextInt();

        if((sayi1<sayi2 && sayi1<sayi3) )
        {
            if(sayi2<sayi3)
            {
                System.out.print(sayi1+"<"+sayi2+"<"+sayi3);
            }
            else
            {
                System.out.print(sayi1+"<"+sayi3+"<"+sayi2);
            }
        }
        else if (sayi2<sayi1 && sayi2<sayi3)
        {
            if(sayi1<sayi3)
            {
                System.out.print(sayi2+"<"+sayi1+"<"+sayi3);
            }
            else
            {
                System.out.print(sayi2+"<"+sayi3+"<"+sayi1);
            }
        }
        else if (sayi3<sayi1 && sayi3<sayi2)
        {
            if(sayi1<sayi2)
            {
                System.out.print(sayi3+"<"+sayi1+"<"+sayi2);
            }
            else
            {
                System.out.print(sayi3+"<"+sayi2+"<"+sayi1);
            }
        }
    }
}