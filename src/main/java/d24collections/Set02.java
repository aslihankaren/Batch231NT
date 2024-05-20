package d24collections;

import java.util.HashSet;
import java.util.TreeSet;

public class Set02 {
    public static void main(String[] args) {

    //Interview Sorusu
    //Ornek 1 : Ogrenci email adreslerini natural order’da siralanmis olarak depolayiniz.

    Long t1= System.nanoTime();
    //1.yol: yavas - TreeSet - her elemanda siralama yapar

        TreeSet<String> emails= new TreeSet<>();
        emails.add("k@gmail.com");
        emails.add("a@gmail.com");
        emails.add("z@gmail.com");
        emails.add("l@gmail.com");
        emails.add("u@gmail.com");
        emails.add("p@gmail.com");
        emails.add("g@gmail.com");
        emails.add("b@gmail.com");
        emails.add("t@gmail.com");
        emails.add("x@gmail.com");

        System.out.println(emails);


        Long t2= System.nanoTime();
        //2: yol TAVSIYE EDILIR HIZLI
        //Elemanlari eklerken en hizli olandan (HashSet) yardim alalim

        HashSet<String> emailsHs= new HashSet<>();

        emailsHs.add("k@gmail.com");
        emailsHs.add("a@gmail.com");
        emailsHs.add("z@gmail.com");
        emailsHs.add("l@gmail.com");
        emailsHs.add("u@gmail.com");
        emailsHs.add("p@gmail.com");
        emailsHs.add("g@gmail.com");
        emailsHs.add("b@gmail.com");
        emailsHs.add("t@gmail.com");
        emailsHs.add("x@gmail.com");

        System.out.println(emailsHs);  //karisik geldi


        ////Bos bir TreeSet olusturalim ve constructor'ina Hashset'i yazalim

        TreeSet<String> emailsHsTs= new TreeSet<>(emailsHs);
        System.out.println(emailsHsTs); //Sirali verdi


        Long t3= System.nanoTime();


        System.out.println(t2-t1); //treeset
        System.out.println(t3-t2);  // hastree



    }
}
