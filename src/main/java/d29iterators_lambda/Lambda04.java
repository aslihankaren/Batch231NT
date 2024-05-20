package d29iterators_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda04 {
    public static void main(String[] args) {


        List<Integer> nums= new ArrayList<>(Arrays.asList(2,3,3,5,11,10));
        tekrarsizCiftKare(nums); //104


    }//MAIN DISI

    //1)Bir list'teki "tekrarsiz","cift " elemanlarin "karelerinin"
    // "toplamını" hesaplayan method oluşturun
    //reduce()azaltmak: Koleksiyon elemanlarını tek bir değere indirger.

    //reduce(0, (t,u) -> t+u); deki 0 etkisiz elemandir. carpma olsa 1 koyardik
    //t: Şu ana kadar hesaplanmış olan ara toplam. İlk iterasyonda, bu değer başlangıç değeri olan 0’dır.
    //u: Ilk elemandir
    //(t,u) -> t+u: İki girdi alarak tek bir çıktı üreten bir lambda ifadesidir


    public static void tekrarsizCiftKare(List<Integer> numbers){


        //int toplam=   numbers.stream().distinct().filter(t-> t %2 ==0).map(t-> t*t).reduce(0,(t,u)->t+u);


       int toplam=   numbers.stream().distinct().filter(t-> t %2 ==0).map(t-> t*t).reduce(0, Integer::sum);
        //Method Reference
        //2,3,3,5,11,10)


        System.out.println(toplam);

    }



}
