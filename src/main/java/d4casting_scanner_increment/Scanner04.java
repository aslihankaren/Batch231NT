package d4casting_scanner_increment;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {

        //Ornek 4: Kullanicidan bir dikdortgenin iki kenar uzunlugunu aliniz

        //i)Alanini hesaplayiniz ==> Kisa kenar * Uzun kenar

        //ii)Cevresini hesaplayiniz ==> 2*Kisa Kenar + 2*Uzun Kenar

        Scanner input= new Scanner(System.in);
        System.out.println("Diktörtgenin kisa kenar uzunlugunu giriniz");
        float shortSide= input.nextFloat();

        System.out.println("Diktörtgenin uzun kenar uzunlugunu giriniz");
        float longSide= input.nextFloat();

        System.out.println("Alan:" +shortSide*longSide);
        System.out.println("Cevre: " + (2*(shortSide+longSide)));

     // ODEV: kisa kenar uzun kenar kontrolunu while ile yapiniz












    }


}
