package d18datetime_stringbuilder;

import java.time.LocalDate;
import java.util.Scanner;

public class DateTime02 {
    public static void main(String[] args) {

        //ornek 2: Kullanicindan dogum tarihini alan ve girdigi tarihin gun ismini bulan kodu yaziniz.

        Scanner input=new Scanner(System.in);
        System.out.println("lütfen veilen sirada dogum tarihi bilgisini alt alta giriniz");


        int y=input.nextInt();
        int m=input.nextInt();
        int d=input.nextInt();

        LocalDate date=LocalDate.of(y, m, d);
        System.out.println(date.getDayOfWeek());














    }
}
