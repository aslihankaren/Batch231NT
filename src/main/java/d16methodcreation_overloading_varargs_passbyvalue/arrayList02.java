package d16methodcreation_overloading_varargs_passbyvalue;

import java.util.Arrays;
import java.util.List;

public class arrayList02 {
    public static void main(String[] args) {


        //Bir List olusturmak icin kisa yol
        List<Integer> myList = Arrays.asList(1, 3, 4, 9, 7);
        System.out.println(myList); //[1, 3, 4, 9, 7]

        //asList() kullanmanin bazi handikaplari vardir. Arka planda Array gibi calismaya baslar.
        //Bu sekilde list olusturursaniz, listin eleman sayisini degistiren methodlari kullanamazsiniz

        //myList.remove(0); //HATA
        //myList.add(5); //HATA
        //clear() metodu, bir listedeki tüm elemanları silmek için kullanılır.
        //myList.clear(); //HATA

        myList.set(0, 5); //0.index'e 5 koyduk
        System.out.println(myList); //[5, 3, 4, 9, 7]
        System.out.println(myList.size()); //5













    }

}
