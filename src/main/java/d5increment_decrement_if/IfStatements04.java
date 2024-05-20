package d5increment_decrement_if;

import java.util.Scanner;

public class IfStatements04 {
    public static void main(String[] args) {
/*Ornek 1: Kullanicidan gun sayisini aldiginizda gun ismini yazan kodu yaziniz
  1==> Pazar, 2 ==> Pazartesi …*/
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen kacinci gun oldugunu giriniz");
        int num = input.nextInt();

        if (num<=0){ // num >1 diyebilirdik
            System.out.println("gun sayilari 1den kücük olamaz");
        } else if (num==1) {
            System.out.println("Pazar");
        }else if (num==2) {
            System.out.println("Pazartesi");
        }else if (num==3) {
            System.out.println("Sali");
        }else if (num==4) {
            System.out.println("carsamba");
        }else if (num==5) {
            System.out.println("Persembe");
        }else if (num==6) {
            System.out.println("cuma");
        }else if (num==7) {
            System.out.println("Cumartesi");
        } else {
            System.out.println("gun sayilari 7den büyük olamaz");
        }
    }
}
