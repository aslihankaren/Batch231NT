package d13arrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
            /* Array -diziler
    1)Coklu data saklamaya izin veren yapilardir. Ornegin sinifinizdaki ogrencilerin isimleri.

    2)Array'ler tek data tipi depolayabilirler.Yani bir int dizisi sadece int değerler,
    bir String dizisi sadece String değerler saklayabilir.

    3)Array olusturmak icin i)Data Tipi ii)Data sayisi (Dizi boyutu için belirtilebilecek maksimum değer,
    Integer.MAX_VALUE (yaklaşık 2 milyar) olarak sınırlıdır) soylenmelidir.

    4)Array'ler diger Collectionlardan hizlidir çünkü boyutları sabittir

    5)Array'ler diger Collectionlardan daha az memory kullanirlar cünkü ekstra metadata veya işlevselliği yoktur.

    6)Array'ler hem primitive veri tiplerini (int, char, double vb.) hem de Object referanslarını
    (örneğin, String, Integer yani wrapper turleri gibi) saklayabilir.
*/

        //array olusturmak
        String [] stdNames1=new String[3]; //tercih edilen
        // String  stdNames2[]=new String[3];  //bu c de kullaniliyormus ondan uyari veriyor

        System.out.println(stdNames1);  //heapteki adresi verdi [Ljava.lang.String;@e9e54c2

        String[] stdNames2= new String[3];
        System.out.println(Arrays.toString(stdNames2));

        ///------------------------------------------

        //ornek: 5 elemanli notlar adinda, int bir arrray olusturunuz ve console’a yazdiriniz

        int[] notlar = new int[5];
        System.out.println(Arrays.toString(notlar)); //[0, 0, 0, 0, 0]

        //ornek: 10 elemanli integers adinda, Integer bir arrray olusturunuz ve console’a yazdiriniz
        Integer[] integers=new Integer[10];
        System.out.println(Arrays.toString(integers)); //[null, null, null, null, null, null, null, null, null, null]



        //ornek: 3 elemanli isimler adinda, String bir array olusturunuz ve console’a yazdiriniz

        String[] isimler=new String[3];
        System.out.println(Arrays.toString(isimler)); //null 0, null 1, null 2;

        //Arraye eleman eklemek
        isimler[0]="Ali Can";
        isimler[2]="Veli Han";
        isimler[1]="Ayse";
        //  isimler[3]="Hasan Kaya";  exception verdi 3 eleman dedigi icin 4. eleman olmaz
        isimler[0]="omer"; //üzerine yazar, hata vermez
        System.out.println(Arrays.toString(isimler));

        //bir veriyi görmek icin ise;
        System.out.println(isimler[1]); //"ayse" yazar

        //Ornek 1: String array olusturun, icine 5 tane eleman ekleyin, tum elemanlarin
        //      icerdigi karakter sayilari toplamini ekrana yazdirin.


        String[] cities= new String[5];
        cities[0]= "Bayburt";
        cities[1]= "Sivas";
        cities[2]= "Denizli";
        cities[3]= "Adana";
        cities[4]= "Ankara";

        System.out.println(Arrays.toString(cities));


        //1.YOL: for loop

        int totolChar=0;


        for (int i = 0; i <cities.length; i++) {        //bu length field dir, alan okumasi yapar. yukaridaki 5 i görüyor. arraylere uygulnan fieldir



            totolChar=totolChar+cities[i].length(); //bu length() method, stringe uygulanir, dinamiktir
            
        }
        System.out.println(totolChar); //30


    //2.YOL:

//for each loop: enhanced - gelistirilmis loop
//for-each loop, Array, yani coklu veri iceren yapilarda kullanilir.
//for loop’taki baslangic, bitis, artirma, azaltma olaylarini dusunmeyiz
//variable ismi olarak da genel kabul w’nun kullanilmasidir. whatever, element

        /*

        for (data tipi variable ismi: array ya da collection ){
            calisacak kodlar buraya

        }
                                                                                */



        int sum=0;

                         //[Bayburt, Sivas, Denizli, Adana, Ankara]
        for (String w: cities ) {
            sum=sum+w.length();

        }
        System.out.println(sum);










    }
}
