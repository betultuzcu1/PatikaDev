package org.example;
import  java.util.Scanner;
// Koşullar :
//Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
//Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
//Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
//Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Hava sıcaklığını giriniz:");
        int sicaklik=input.nextInt();

        if(sicaklik<5)
        {
            System.out.print("Kayak yapabilirsiniz..");
        }
        else if (sicaklik>=5 && sicaklik<15)
        {
            System.out.print("Sinemaya gidebilirisiniz..");
        }
        else if (sicaklik>=15 && sicaklik<25)
        {
            System.out.print("Pikniğe gidebilirisiniz..");
        }
        else if (sicaklik>=25)
        {
            System.out.print("Yüzmeye gidebilirisiniz..");
        }
    }
}