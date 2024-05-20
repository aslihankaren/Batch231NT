package d5increment_decrement_if;

import java.util.Scanner;

public class IfStatements02 {
    public static void main(String[] args) {
        //Ornek 1: Kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz

        //1.YOL:
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen bir sayi giriniz");

        int num= input.nextInt();
        if (num%2==0){
            System.out.println("Cift Sayi");
        }
        if (num%2!=0){       //num%2==1 de yazilabilir
            System.out.println("Tek sayi");
        }

        //------------------
        //2.YOL:
        //if-else Statements

        if(num%2==0) {
            System.out.println("sayi ciftir");
        } else {
            System.out.println("sayi tektir");
        }


    }
}
