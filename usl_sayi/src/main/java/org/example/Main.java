package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int i,r;
        int sonuc=1;
        System.out.print("Lütfen hesaplanacak sayıyı giriniz:");
        i=input.nextInt();
        System.out.print("Lütfen üsslü sayıyı giriniz:");
        r=input.nextInt();

        for(int j=1;j<=r;j++){
            sonuc*=i;
        }
        System.out.println("Sonuç: " + sonuc);
    }
}