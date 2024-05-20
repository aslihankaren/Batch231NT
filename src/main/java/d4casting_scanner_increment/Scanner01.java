package d4casting_scanner_increment;

import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {
    //Java’da Scanner class’i, kullanıcıdan veya farklı bir kaynaktan girdi almanın oldukça kolay bir yolunu sağlar.

    //Scanner sınıfı, farklı veri tiplerini (int, float, double, String, boolean vb.) kolaylıkla okuyabilir.

    //next(), nextInt(), nextDouble() gibi farklı metotlar, farklı ihtiyaçlara uygun şekillerde kullanicidan girdi almayı sağlar

    //Ornek 1 : Kullanicidan yasini isteyip console’a yazdiriniz

        //1.adim scanner classten object olustur.
        //System.in klavye üzerinden veri okumak icin kullanilir
        Scanner giris= new Scanner(System.in);

        // 2.adim kullaniciya ne istediginize dair mesaj verin
        System.out.println("lütfen yasinizi giriniz");

        //3.adim: uygun metodu kullanarak kullanicinin verdigi girdiyi datayi memorye yerlestiriniz
        byte age=giris.nextByte();

        // kullanicinin girdigi veriyi yerel aga degiskenine yükledik
        System.out.println(age);

    }
}
