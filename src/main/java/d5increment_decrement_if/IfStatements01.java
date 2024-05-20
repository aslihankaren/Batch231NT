package d5increment_decrement_if;

public class IfStatements01 {
    public static void main(String[] args) {

        if (3<5) {
            System.out.println("condition dogru if calisti"); //dogruysa bodyde calisir yanlis ise calismaz

        }
        //---------------
        if (7==4+3) {
            System.out.println("condition dogru ise buraya girer");
        }
        //--------------------------

        //Ornek 1: Sayi 0 (dahil) ile 10 (haric) arasinda ise ekrana “Rakam” yazdirin.
        int num=7;
        if (num>-1 && num<10) { //num>=0 iki kosul kontrolu var bu biraz yavaslatir
            System.out.println("rakam");
        //java bodynin icine giremeyince bodynin disindaki satirdan devam eder
        }
        //Ornek 2: Sayi uc basamakli ise ekrana “Sayi üç basamaklidir” yazdirin.

        int n=123;
        if (n>99 && n<1000) {
            System.out.println( "sayi uc basamaklidir"); //67 olsa calismaz



        }




















    }
}
