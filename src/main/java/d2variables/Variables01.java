package d2variables;

public class Variables01 {
    public static void main(String[] args){

        // java bu satiri okumaz kendimize veya baskasina aciklamadir.
        /*    1) Java dili Strongly Typed'dir, bu nedenle Java'daki her değişken(variable),
         belirli veri türü(data type) ile iliskilendirilecektir.
              2) Bir developerin değişkenlere uygun değerlerin atandığından emin olması her zaman gerekir.
          Aksi takdirde hata oluşur.
         */

        //Ornek 1: String data tipinde ismi selam olan bir variable olusturarak,
        // icine "Hello World" yukleyip console'a yazdiriniz.

        // siralama nasil olacakti
        // data type ===> variable name===>atama operatörü===> data===>noktali virgül

        String selam= "Hello World";
        System.out.println(selam);

          // ornek2 : tamsayi (int)data tipinde ismi age olan //bir varable olusturunuz ve icine 5 yükleyip //consola yazdiriniz

        int age = 25;
        System.out.println(age);

        /*
      Not 1 : primitive data typelarini java olusturmustur, biz olusturamayiz
      Not 2 : primitive data typelarinin isimlerinde sadece kucuk harf kullanilir
     Not 3 : primitive datalar data type'larina gore memory'de farkli farkli yer kaplarlar
     Not 4 : primitive datalar iclerinde sadece sizin atadiginiz degeri barindirirlar
 */
        //1- byte data type: tam sayilar icindir. hafiza da  // byte (8bit) yer kaplar. -128 den +127´ye kadar // //degerler icin kullanilir
        // ornek1: byte data tipinde ogrenci yasi icin bir varable olusturun ve deger atayin

        byte ogrenciYasi= 15;
        System.out.println(ogrenciYasi);


        //2- short data type:
        //Tam sayilar icindir. Hafizada 2 byte(16 bit) yer //kaplar. Aralik (range) genisledi.
        //-32768 den + 32767’e tamsayi degerleri icin kullanilir

        short siteNufusu=1200;
        System.out.println(siteNufusu);

    }

}
