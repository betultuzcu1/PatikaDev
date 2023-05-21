package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz:");
        int n=input.nextInt();
        double result=0.0;
        for(double i=1;i<=n;i++){
            result+=(i/1);
        }

        System.out.println("Harmonik sayı:"+result);
    }
}