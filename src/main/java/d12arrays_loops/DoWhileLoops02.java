package d12arrays_loops;

import java.util.Scanner;

public class DoWhileLoops02 {
    public static void main(String[] args) {

      /*Ornek 1:
       Gecerli Username="admin" ve Password="pwd123" dur.
       Kullanicidan username ve password'u alin.
       Username ve password dogru ise console'a "Hesabiniza hosgeldiniz!" yazdirin.
       Username veya password yanlis ise 4 kere "Username ve password'unuzu giriniz" mesaji versin.
       Username veya password 4. kere yanlis girilirse "Hesabiniz bloke olmustur" mesaji vererek islemi tamamlayiniz.
*/

        Scanner input=new Scanner(System.in);

        int counter=0;  //sayici , 4 u buraya yüklüyoruz

        do {
            if (counter==4){
                System.out.println("hesabiniz bloke olmustur");
                break;
            }
            System.out.println("lütfen username giriniz");
            String userName= input.next();

            System.out.println("lütfen password'u giriniz");
            String password=input.next();

            if (userName.equals("admin")&& password.equals("pwd123")){
                System.out.println("hesabiniza hosgeldiniz");
                break;
            }
                counter++;
        }while (true);  // true, sonsuz döngü iceriden kirilmadigi müddetce calisir





    }
}
