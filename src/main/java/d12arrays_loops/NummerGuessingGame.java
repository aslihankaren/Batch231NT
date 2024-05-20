package d12arrays_loops;

import java.util.Random;
import java.util.Scanner;

public class NummerGuessingGame {
    public static void main(String[] args) {
        //Ornek 1: 0-100 arasi sayi tahmin etme oyununu do-while ile yaziniz.
        //Scanner ve Random Classlarina object üretelim

        Scanner scanner=new Scanner(System.in);
        Random random=new Random();


        //0-100 arasinda sayi üretelim
        int rastgeleSayi=random.nextInt(101);  //20-100 arasi nasil olurdu?

        //kullanicinin kac kere tahmin yaptigini takipo etmek icin bir sayac (counter) olusturalim.
        int denemeSayisi=0;  //hic denemedi cünkü

        //kullanicinin yaptigi tahmini saklamak icin bir degisken olusturalim
        int tahminEdilen;
        //sout verirsek tahmin edileni verir hile


        //kullaniciin sayiyi dogru tahmin edip etmedigini kontrol etmek icin boolean degisken olusturalim
        boolean tahminDogrumu=false;

        //oyunun aciklamasini yazdiralim

        System.out.println("0- 100 arasinda bir sayiyi tahmin etmeye calisin");


        //dogru tahmin yapilincaya kadar döngüyü devam ettirelim

        do {
            //kullanicidan tahmin aliyoruz
            System.out.println("tahmininizi yapiniz");
            tahminEdilen=scanner.nextInt();


            //sayaci bir artiralim
            denemeSayisi++;

            //tahmini kontrol edelim
            if (tahminEdilen<rastgeleSayi){
                System.out.println("Sayi daha büyük");
            } else if (tahminEdilen>rastgeleSayi) {
                System.out.println("Sayi daha kücük");
            }else {
                tahminDogrumu=true;
                System.out.println("tebrikler,dogru tahmin");
                System.out.println("deneme sayisi: "+ denemeSayisi);
            }


        }while (!tahminDogrumu);  //false true ya cevirdim  //javanin gördügünü .... //break disinda kirma


        scanner.close(); //actiginiz kaynaklari kapatmak iyi bir programlama pratigidir


    }
}
