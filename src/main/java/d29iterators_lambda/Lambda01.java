package d29iterators_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {

            /*
    Lambda ifadeleri, Java 8 ile birlikte tanıtılan ve fonksiyonel(methodsal) programlamayı
    kolaylaştırmak için kullanılan bir özelliktir.

    Lambda ifadelerinin genel avantajları:
    1- Daha az kod yazma: Lambdalar, daha az ve daha okunabilir kod yazmanızı sağlar.
    2- Fonksiyonel programlama: Java'nın fonksiyonel programlama özelliklerini kullanmanıza yardımcı olur.
    3- İsimsizdir: Lambda ifadeleri, bir isme sahip değildir.(method ismi yoktur)
    4- Tek bir ifade içerebilir: Lambda ifadeleri, bir veya daha fazla işlem gerçekleştiren tek
    bir ifade içerebilir.
    5- Bir veya daha fazla parametre alabilir*/

    /*1) Lambda Functional Programming'dir, digeri "Structured Programming" dir
    Structured Programming: Yapısal programlama, programların belirli yapılar veya kontrol yapıları
    (örneğin döngüler, şartlı ifadeler) kullanılarak yazılmasını teşvik eden bir programlamadir.

    2) Functional programming, Collection'lar ve Array'ler ile yaygin olarak kullanilir.(Map'lerde direkt kullanilmaz
    entrySet ile Set'e cevrilirse kullanilabilir)*/


        List<Integer> nums = new ArrayList<>(Arrays.asList(12, 9, 131, 14, 9, 10, 4, 12, 15));
        // printElements1(nums);
        // printElements2(nums);  //12 9 131 14 9 10 4 12 15
        // ciftleriYazdir1(nums);  //12 14 10 4 12
        ciftleriYazdir2(nums); //12 14 10 4 12

    }//MAIN DISI

    //1) Bir list’teki elemanlari ayni satirda aralarina bosluk koyarak
    // yazdiran method’u olusturunuz.(Structured == Yapisal)

    public static void printElements1(List<Integer> numbers) {

        for (Integer w : numbers) {
            System.out.print(w + " ");
        }

    }
    //2) Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak
    //   yazdiran method'u olusturunuz.(Functional- lambda)

    //stream() metodu, koleksiyonları bir akışa (stream) dönüştürerek üzerinde işlem yapmayı sağlar.
    //Akışın (stream) adı, verinin bir kaynaktan hedefe doğru “akmasını” ifade eder.

    public static void printElements2(List<Integer> numbers) {

        numbers.stream().forEach(t -> System.out.print(t + " ")); // t degisken adi , type den gelir

    }

    //--------------------------------
    //3) Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak
    // yazdiran method'u olusturunuz.(Structured)

    public static void ciftleriYazdir1(List<Integer> numbers) {

        for (Integer w : numbers) {
            if (w % 2 == 0) {
                System.out.print(w + " ");
            }

        }

    }
    //---------------------------------------
    //4) Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak
    //   yazdiran method'u olusturunuz.(Functional)
    //Stream API’si ile birlikte sıkça kullanılan bazı metodlar şunlardır:
    //1) filter(): Koşulu karşılayan elemanları filtreler.if


    public static void ciftleriYazdir2(List<Integer> numbers) {  //eleme yapanlar genelde en basta kullanilir
        numbers.
                stream().filter(t -> t % 2 == 0).
                forEach(t -> System.out.print(t + " "));


        //t ler burda ayni degil ilkinde hepsi var ikincisinde ciftler var


    }


}
