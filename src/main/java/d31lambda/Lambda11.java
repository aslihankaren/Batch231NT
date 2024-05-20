package d31lambda;

import java.util.stream.IntStream;

public class Lambda11 {
    public static void main(String[] args) {

int sum=getSumFromSevenToSeventy();
        System.out.println(sum);

        int multi= getMultilicationFromThreeToNine1();
        System.out.println(multi);

        int multi2= getMultilicationFromThreeToNine2();
        System.out.println(multi2);
        System.out.println(getFactorial(5));
        System.out.println(getSumOfBetweenTwoInteger(12,5));

    }
    //1) 7'den 70'e kadar tum tamsayilarin toplamini veren kodu yaziniz
/*
a) IntStream - primitive int değerleri üzerinde ardışık işlemler yapmayı sağlar.(LongStream, DoubleStream'de var)
b) range - Belirtilen başlangıç (dahil) ve bitiş değerleri (haric) arasında ardışık sayıları
temsil eden bir akış oluşturur.
c) rangeClosed - Belirtilen başlangıç (dahil) ve bitiş değerleri (dahil) arasında ardışık sayıları
temsil eden bir akış oluşturur.
d) addExact - tam ekle - İki int veya long değerini toplar. Math class'tadir.
e) getAsInt - OptionalInt sınıfında bulunan bir metottur.Eğer bir değer mevcutsa bu değeri döndürür.(IntStream kullaninca bunu kullaniriz)
Eğer bir değer mevcut değilse bir NoSuchElementException hatası fırlatır.
*/
public static int getSumFromSevenToSeventy(){

    return IntStream.rangeClosed(7,70).
            reduce(Math::addExact).
            getAsInt();
    // Math::addExcact (overflow kontrolu tasma yerine, intger classtaki sum da kullanilanbilir
}


//2) 3'den 9'a kadar tum tamsayilarin carpimini veren methodu olusturunuz.
//multiplyExact - İki int veya long değerini çarpar. Math class’tadir
// excact ile bitenlerin tasma kontrolu var
    //1.YOL:

    public  static int getMultilicationFromThreeToNine1(){
    return IntStream.rangeClosed(3,9).reduce(Math::multiplyExact).getAsInt();

    }

    public  static int getMultilicationFromThreeToNine2(){
        return IntStream.range(3,10).reduce(Math::multiplyExact).getAsInt();

    }
    //3)Size verilen sayinin faktoriyelini hesaplayan kodu yaziniz.
    //3! = 1 * 2 * 3 = 6
    //0! = 1
    //Negatif sayıların faktöriyeli yoktur
    public static int  getFactorial(int x){
    if (x==0){
       return 1;

    }else if(x<0){
        System.out.println("negatif sayilarin faktoruíyeli yoktur");
        return -1;

    }else {
        return IntStream.rangeClosed(1,x).reduce(Math::multiplyExact).getAsInt();
    }


}
    //4)Size verilen iki tamsayi arasindaki tum cift sayilarin toplamini veren kodu yaziniz.
    //baslangic ve bitis dahil degil
    //sum metodu, IntStream üzerindeki tüm elemanların toplamını hesaplar ve bu toplamı döndürür

    public static int getSumOfBetweenTwoInteger(int a, int b){

    if (a>b){
        int temp= a;
        a=b;
        b=temp;
    }


    return IntStream.range(a+1,b).filter(Utils::isNuberEven).sum();
    }



}
