package org.example;
import java.util.Scanner;
// Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int dogumYil;
        System.out.print("Lütfen doğum yılınızı giriniz:");
        dogumYil=input.nextInt();
        if(dogumYil%12==0)
        {
            System.out.print("Doğum yılınız:"+dogumYil+" Çin zodyağı: Maymun");
        }
        else if(dogumYil%12==1)
        {
            System.out.print("Doğum yılınız:"+dogumYil+" Çin zodyağı: Horoz");
        }
        else if(dogumYil%12==2)
        {
            System.out.print("Doğum yılınız:"+dogumYil+" Çin zodyağı: Köpek");
        }else if(dogumYil%12==3)
        {
            System.out.print("Doğum yılınız:"+dogumYil+" Çin zodyağı: Domuz");
        }else if(dogumYil%12==4)
        {
            System.out.print("Doğum yılınız:"+dogumYil+" Çin zodyağı: Fare");
        }else if(dogumYil%12==5)
        {
            System.out.print("Doğum yılınız:"+dogumYil+" Çin zodyağı: Öküz");
        }else if(dogumYil%12==6)
        {
            System.out.print("Doğum yılınız:"+dogumYil+" Çin zodyağı: Kaplan");
        }else if(dogumYil%12==7)
        {
            System.out.print("Doğum yılınız:"+dogumYil+" Çin zodyağı: Tavşan");
        }else if(dogumYil%12==8)
        {
            System.out.print("Doğum yılınız:"+dogumYil+" Çin zodyağı: Ejderha");
        }else if(dogumYil%12==9)
        {
            System.out.print("Doğum yılınız:"+dogumYil+" Çin zodyağı: Yılan");
        }else if(dogumYil%12==10)
        {
            System.out.print("Doğum yılınız:"+dogumYil+" Çin zodyağı: At");
        }else if(dogumYil%12==11)
        {
            System.out.print("Doğum yılınız:"+dogumYil+" Çin zodyağı: Koyun");
        }
    }
}