package org.example;
import java.util.Scanner;

//Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
// Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;
//Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
//Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
//Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
//Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
//Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int mesafe ,yolcuYas,yolculukTip;
        double yasİndirim,tipİndirim ,indirimliFiyat,biletFiyat;

        System.out.println("JavaAirline'a hoş geldiniz.Lütfen sizden istenilen bilgileri doldurunuz.");
        System.out.print("Gidilecek mesafe:");
        mesafe=input.nextInt();
        double fiyat=mesafe*0.10;
        System.out.print("Yolcu yaşını giriniz:");
        yolcuYas=input.nextInt();
        System.out.print("1.Tek Yön\n2.Gidiş-Dönüş\nYolculuk tipini seçiniz:");
        yolculukTip=input.nextInt();
        if(yolcuYas<12)
        {
            yasİndirim=fiyat*0.5;
            indirimliFiyat=fiyat-yasİndirim;
            if(yolculukTip==1)
            {
                biletFiyat=indirimliFiyat;
                System.out.print("12 yaş altı yolcu bilet fiyatı:"+biletFiyat +" Gidilecek mesafe:"+mesafe +" Yolculuk tipi:"+yolculukTip);
            }
            else if (yolculukTip==2)
            {
                tipİndirim=indirimliFiyat*0.20;
                biletFiyat=(indirimliFiyat-tipİndirim)*2;
                System.out.print("12 yaş altı yolcu bilet fiyatı :"+biletFiyat+" Gidilecek mesafe:"+mesafe+" Yolculuk tipi:"+yolculukTip);
            }
        }
        else if(yolcuYas>=12 && yolcuYas<=24)
        {
            yasİndirim=fiyat*0.1;
            indirimliFiyat=fiyat-yasİndirim;
            if(yolculukTip==1)
            {
                biletFiyat=indirimliFiyat;
                System.out.print("12-24 yaş arası yolcu bilet fiyatı :"+biletFiyat+" Gidilecek mesafe:"+mesafe +" Yolculuk tipi:"+yolculukTip);
            }
            else if (yolculukTip==2)
            {
                tipİndirim=indirimliFiyat*0.20;
                biletFiyat=(indirimliFiyat-tipİndirim)*2;
                System.out.print("12-24 yaş arası yolcu bilet fiyatı :"+biletFiyat+" Gidilecek mesafe:"+mesafe+" Yolculuk tipi:"+yolculukTip);
            }
        }
        else if(yolcuYas>=65)
        {
            yasİndirim=fiyat*0.3;
            indirimliFiyat=fiyat-yasİndirim;
            if(yolculukTip==1)
            {
                biletFiyat=indirimliFiyat;
                System.out.print("65 yaş ve üstü yolcu bilet fiyatı :"+biletFiyat+" Gidilecek mesafe:"+mesafe +" Yolculuk tipi:"+yolculukTip);
            }
            else if (yolculukTip==2)
            {
                tipİndirim=indirimliFiyat*0.20;
                biletFiyat=(indirimliFiyat-tipİndirim)*2;
                System.out.print("65 yaş ve üstü yolcu bilet fiyatı :"+biletFiyat+" Gidilecek mesafe:"+mesafe+" Yolculuk tipi:"+yolculukTip);
            }
        }
        else
        {
            biletFiyat=fiyat;
            if(yolculukTip==1)
            {
                System.out.print("Normal yolcu bilet fiyatı :"+biletFiyat+" Gidilecek mesafe:"+mesafe +" Yolculuk tipi:"+yolculukTip);
            }
            else if (yolculukTip==2)
            {
                tipİndirim=fiyat*0.20;
                biletFiyat=(fiyat-tipİndirim)*2;
                System.out.print("Normal yolcu bilet fiyatı :"+biletFiyat+" Gidilecek mesafe:"+mesafe+" Yolculuk tipi:"+yolculukTip);
            }
        }
    }
}