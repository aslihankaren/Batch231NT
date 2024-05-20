package d31lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CourseRunner {
    public static void main(String[] args) {

        //Course class'in parametreli constructor'ini kullanarak 4 tane Object olusturalim

        Course courseTurkishDay = new Course("Summer", "Turkish Day", 97, 128);
        Course courseTurkishNight = new Course("Winter", "Turkish Day", 98, 154);
        Course courseEnglishDay = new Course("Spring", "English Day", 95, 132);
        Course courseEnglishNight = new Course("Winter", "English Night", 93, 144);

        List<Course> courseList = new ArrayList<>();
        courseList.add(courseTurkishDay);
        courseList.add(courseTurkishNight);
        courseList.add(courseEnglishDay);
        courseList.add(courseEnglishNight);
        System.out.println(courseList);
        // [Course{season='Summer', CourseName='Turkish Day', averagescore=97, numberOfStudents=128}, Course{season='Winter', CourseName='Turkish Day', averagescore=98, numberOfStudents=154}, Course{season='Spring', CourseName='English Day', averagescore=95, numberOfStudents=132}, Course{season='Winter', CourseName='English Night', averagescore=93, numberOfStudents=144}]


        //1)Tum “averageScore” larin 91’den buyuk olup olmadigini kontrol eden kodu yaziniz
        //allMatch metodu, akıştaki (stream) tüm öğelerin belirli bir koşulu karşılayıp karşılamadığını
        // kontrol eder. Eğer akıştaki tüm öğeler bu koşulu sağlarsa true döndürür,
        // aksi takdirde false döndürür.(VE gibi)

        boolean result1 = courseList.stream().allMatch(t -> t.getAveragescore() > 91);
        System.out.println(result1);


        //2)Tum kurslardaki ögrenci sayilarinin 100’den buyuk olup olmadigini kontrol eden kodu yaziniz
        boolean result2 = courseList.stream().allMatch(t -> t.getNumberOfStudents() > 100);
        System.out.println(result2);

        //3)Kurs isimlerinden en az birinin “Turkish” kelimesini icerip icermedigini kontrol eden kodu yaziniz.

        //anyMatch,Akıştaki herhangi bir elemanın belirli bir koşulu karşılayıp karşılamadığını kontrol eder.
        //Eğer akıştaki elemanlardan en az biri koşulu karşılıyorsa true döndürür, yoksa false döndürür.(VEYA gibi)

        boolean result3 = courseList.stream().anyMatch(t -> t.getCourseName().contains("Turkish"));
        System.out.println(result3);

        boolean result4 = courseList.stream().anyMatch(t -> t.getCourseName().contains("English"));
        System.out.println(result4);


        //4) Sezon isimlerinden en az birinin “Summer” kelimesini icerip icermedigini kontrol eden kodu yaziniz.
        boolean result5 = courseList.stream().anyMatch(t -> t.getSeason().contains("Summer"));
        System.out.println(result5);

        //5) Kurs donemleri icinde “Fall” doneminin hic bulunmadigini kontrol eden kodu yaziniz.

        //noneMatch, Akıştaki hiçbir elemanın belirli bir koşulu karşılamadığını kontrol eder.
        //Eğer akıştaki hiçbir eleman koşulu karşılamıyorsa true döndürür, aksi takdirde false döndürür.

            boolean result6 = courseList.stream().noneMatch(t -> t.getSeason().contains("Fall"));
            System.out.println(result6); //true yok anlaminda

        //6) Kurs isimleri icinde “German” isminin hic bulunmadigini kontrol eden kodu yaziniz.

        boolean result7 = courseList.stream().noneMatch(t -> t.getCourseName().contains("German"));
        System.out.println(result7);

    //7)Average score’u en yuksek olan kursun ismini console yazdiran kodu yaziniz.
    //a) sorted, Stream içerisindeki elemanları doğal sıralamasına göre sıralar.(kucukten buyuge)
    //Özel bir sıralama için bir Comparator’da alabilir.
    //b) Comparator.comparing, belirli bir özelliğe göre elemanları sıralamak için bir Comparator oluşturur.
    //c) reversed, Bir Comparator’ın sıralama sırasını tersine çevirir.
    //d) findFirst, Stream’deki ilk elemanı döndüren bir Optional döner


    }

}
