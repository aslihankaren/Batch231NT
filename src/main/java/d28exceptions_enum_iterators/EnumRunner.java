package d28exceptions_enum_iterators;

import java.util.Arrays;
import java.util.Scanner;

public class EnumRunner {

    public static void main(String[] args) {

        //Cities c= new Cities();

        //1- Enum daki bir sabite nasil ulasabiliriz?
        Cities il= Cities.ANKARA;
        System.out.println(il);

        //2- BURSA sabitinin ismine ulasalim
        String ilIsmi= Cities.BURSA.getCityName();
        System.out.println(ilIsmi);

        String pk= Cities.ANKARA.getPostalCode();
        System.out.println(pk);

        //4- Karabuk’un plaka koduna ulasalim
        int plk= Cities.KARABÜK.getPlateCode();
        System.out.println(plk);


        //5- Kullanicidan bir ilin plaka kodunu alarak bunun hangi il oldugunu console a yazdirin

        Scanner input= new Scanner(System.in);
        System.out.println("Plaka kodunu giriniz");
        int plaka= input.nextInt();

        //values() methodu enum icindeki tum datalari bir array icinde bize verir

        Cities[] sehirler = Cities.values();
        //System.out.println(Arrays.toString(sehirler)); //[ADANA, ADIYAMAN, AFYONKARAHİSAR,


        if (plaka < 1 || plaka > 81){
            System.out.println("Lutfen 1 ile 81 arasi bir plaka kodu giriniz");
        } else {

            for (Cities w : sehirler){
                if (plaka == w.getPlateCode()){
                    System.out.println("Girmis oldugunuz plaka " + w.getCityName() + " iline aittir");
                    break;
                }
            }
        }
    }
}