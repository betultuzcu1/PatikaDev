package org.example;
import java.util.Scanner;
//KDV Tutarı Hesaplayan Program
//Kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
//(Not : KDV tutarını 18% olarak alın)
//KDV'siz Fiyat = 10;
//Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        double kdvOran;
        double tutar;
        double kdvTutar;
        double kdvliTutar;


        System.out.print("Lütfen ücret miktarını giriniz:");

        tutar=input.nextDouble();

        if (tutar>0 && tutar<=1000){
            kdvOran=0.18;
            kdvTutar=kdvOran*tutar;
            kdvliTutar=kdvTutar+tutar;
            System.out.print("Kdv'li ücret tutarı:"+kdvliTutar);
        } else if (tutar>1000) {
            kdvOran=0.8;
            kdvTutar=kdvOran*tutar;
            kdvliTutar=kdvTutar+tutar;
            System.out.print("Kdv'li ücret tutarı:"+kdvliTutar);
        }






    }
}