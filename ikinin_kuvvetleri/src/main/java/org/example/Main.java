package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;
        System.out.println("Sınır sayısını giriniz:");
        n=input.nextInt();
        //girilen sayıdan küçün 2'nin kuvvetlerinin bulunması
        for(int i=1;i<=n;i+=2){
            System.out.println(i);
        }
        //Girilen sayıya kadar olan 4 'ün kuvvetleri

        for(int i=1;i<=n;i+=4){
            System.out.println(i);
        }
    }
}