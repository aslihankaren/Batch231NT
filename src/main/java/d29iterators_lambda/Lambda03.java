package d29iterators_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda03 {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(2,3,3,5,10,10));
        tekKupTekrarsiz(nums);








    }//MAIN DISI
    //1) Bir list’teki “tek sayi” olan elemanlarin “kup”lerini “tekrarsiz” olarak ayni satirda
    // aralarina bosluk koyarak yazdiran method’u olusturunuz.(Functional)
    //distinct() metodu, bir akistaki tekrar eden ogeleri kaldirmak icin kullanilir
    //ornegin 1 2 2 3 3 3 4 4  5===> 1 2 3 4 5 yapar uniqe


    public static void tekKupTekrarsiz(List<Integer> numbers ){

        numbers.stream().distinct().filter(t-> t%2!=0).map(t-> t*t*t).forEach(t-> System.out.print(t+ " "));

    }



}
