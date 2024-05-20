package d18datetime_stringbuilder;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class DateTime03 {
    public static void main(String[] args) {


        /*LocalTime Class'ta kullanilan tarih saat formatlari

        HH : mm ==> 24'lu saat sistemi
        hh : mm ==> 12'li saat sistemi. AM, PM gosterilmez
        hh : mm a ==> 12'li saat sistemi. AM, PM gosterilir
        HH : mm : ss ==> saniyeyi gosterir
        HH : MM ==> yanlis format cunku MM aylar icin kullanilir
        "mm" "minute" demektir. "MM" "month" demektir.

        dd-MM-yyyy ==> gun - ay - yil
        MMM ==> Aug
        MMMM ==> August  */

        //Anlik zamani nasil aliriz?

        //LocalTime kullanacagiz.
        //LocalTime, Java'nın java.time paketinde bulunan bir Class'tir ve sadece saat bilgisini
        //(saat, dakika, saniye ve milisaniye) temsil etmek için kullanılır.
        //Bu sınıf, tarih bilgisini içermez ve yalnızca saatle ilgilidir.
        //-------------------
        //Ornek 1: now(): Gecerli saat bilgisini alir.
        LocalTime myCurrentTime = LocalTime.now();
        System.out.println(myCurrentTime); //21:24:12.383541

        //-------------------
        //ornek 2:"DateTimeFormatter", bir Class'tir ve tarih ve saat verilerini belirli bir biçimde
        // görüntülemek, okumak ve işlemek için kullanılan önemli bir araçtır.

        //DateTimeFormatter, tarih ve saat nesnelerini "metin" yani String olarak
        // biçimlendirmenize ve metni tarih ve saat nesnelerine çözmenize olanak tanır.

        //ofPattern() metodu, belirli bir kalıba (pattern) göre tarih ve zaman
        // verilerini biçimlendirmek için kullanılır.
        //format() method'u LocalTime'i String'e istedigimiz formatta cevirir

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("hh:mm a");

        String formattedTime = dtf1.format(myCurrentTime);
        System.out.println(formattedTime); //09:41 ÖS

        //-------------------
        //Ornek 3: Tarih'i formatlayalim

        LocalDate myCurrentDate = LocalDate.now();

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd-MMM-yyyyy");
        String formattedDate = dtf2.format(myCurrentDate);
        System.out.println(formattedDate); //08-Şub-2024



        //ornek 4: Baska bir zaman dilimindeki tarih ve zamani nasil aliriz?

        //ZoneId, zaman dilimi veya coğrafi bölge bilgisini temsil eder ve
        // tarih/saat işlemlerinde bu bilginin kullanılmasını sağlar.

        LocalDate dateInTokyo=LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(dateInTokyo);  //2024-02-09


        //Amsterdam da ayin kaci
        LocalDate dateInAmsterdam=LocalDate.now(ZoneId.of("Europe/Amsterdam"));
        System.out.println(dateInAmsterdam);  //


        //tokyo da saat kac

        LocalTime timeInTokyo = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(timeInTokyo);

        //---------- Ekstra bilgi - Zone'lar

        /*Set<String> zoneIds=ZoneId.getAvailableZoneIds();

        for (String zoneId: zoneIds){
            System.out.println(zoneId);
        }
        System.out.println();
        System.out.println("Toplam zaman dilimi sayisi: " + zoneIds.size());
        */
        //---------------
        //ornek 5: Tarih ve zamani ayni anda kullanalim.
        //LocalDateTime, tarih ve saatlerle çalışmak için kullanılır.

        LocalDateTime ldt=LocalDateTime.now();
        System.out.println(ldt);  //2024-02-08T20:06:11.256424

        DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("dd* MM* yyyy-- hh:mm a");
        String formattedLdt=dtf3.format(ldt);
        System.out.println(formattedLdt);






    }
}