package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        //kullanıcı adı:patika
        //şifre=java123

        String userName,password;

        System.out.print("Kullanıcı adını giriniz:");
        userName=input.nextLine();

        if(userName.equals("patika")){
            System.out.print("Şifrenizi giriniz:");
            password=input.nextLine();
            if(password.equals("java123")){
                System.out.print("Giriş Başarılı");
            }else {
                System.out.print("Hatalı şifre!!Şifrenizi sıfırlamak ister msiiniz(e/h)");
                String secim=input.nextLine();
                if(secim.equals("e")){
                    System.out.print("Lütfen yeni bir şifre giriniz:");
                    String newPassword=input.nextLine();
                    if(newPassword.equals("java123")){
                        System.out.print("Şifre oluşturulamadı, lütfen daha öncekilerden farklı bir şifre giriniz");
                    }else {
                        System.out.print("Şifre başarı bir şekilde oluşturuldu!");
                    }
                }
                else {
                    System.out.print("Hatalı giriş!!");
                }
            }
        }
        else {
            System.out.print("Kullanıcı adı hatalı .Lütfen kontrol edip,tekrar deneyiniz!!");
        }
    }
}