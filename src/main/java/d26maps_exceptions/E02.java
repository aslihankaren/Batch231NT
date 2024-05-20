package d26maps_exceptions;

public class E02 {
    public static void main(String[] args) {

//2) NumberFormatException : Bir metnin sayisal bir deger olarak donusturulememesi durumunda olusur

        String s="1234a";
        converStringToInt(s);





    }//main disi
    public  static  void  converStringToInt(String s){
        Integer intS= Integer.valueOf(s);
        System.out.println(intS+1); //1 i dönüstürüp dönüstürmedigini anlamak icin yazdik

    }


}
