package d9string_loops;

public class ForLoops01 {
    public static void main(String[] args) {

        //loops (döngüler)

//Döngüler (Loops) tekrar eden kodlama işlerini kolaylaştırmak için kullanılır.

//Tüm kod parçalarını belirli bir kural döngüsü içinde tekrarlamak için kullanılır.

/*Java'da su donguleri gorecegiz

1. for-loop
2. while-loop
3. do-while-loop
4. for-each-loop (Collections'larda) en gelismisi
*/
/*1. for-loop

for döngüsü, temel olarak bir kod blogunu belirli bir sayıda ve üst üste çalıştırmak
için kullanılan bir döngüdür.
Döngü başlangıcında kullanılan değişkene döngü içinde müdahale edilerek tekrar sayısı değiştirilebilir.

for döngüsü, yineleme(iteration) sayısı bilindiğinde belirli döngüler için kullanılır.
Bazi durumlarda döngü sonsuz sayıda yinelenir*/

        //ornek 1: Console'a 4 kere 'Hi!' yazdirin


        //1.YOL tavsiye edilmez

        System.out.println("hi");
        System.out.println("hi");
        System.out.println("hi");
        System.out.println("hi");

        //2:YOL

        /* for (Baslangic degeri; Loop calisma kurali; Artirma/Eksiltme){
             //Calisacak Kodlar
         }*/

        //Ornek
        // Baslangic degeri;    Loop calisma kurali;     Artirma/Eksiltme
        for (int i=1       ;         i<5           ;         i++){ // <=4 yazilabilirdi i=i+1 de yazilabilir
            System.out.println("hi....!");

        }


            //Ornek 2: 20(dahil) den 3(dahil) e kadar tum tamsayilari console’a yazdiriniz

        for (int i= 20;  i>2;                   i--){
            System.out.println(i);

        }

        //Ornek 3: 3'den 20'ye kadar tum cift sayilari console’a yazdiriniz(20 dahil)

        for (int i = 3; i < 21; i++) { //i <= 20   for (int i = 4; i < 21; i+=2)

            if (i % 2 == 0){
                System.out.println(i);
            }

        }



//biz aramizda az konustuk hocam da







    }
}
