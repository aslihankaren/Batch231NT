package d22oop;



public class StudentsRunner {
    public static void main(String[] args) {


        Student s=new Student();

        //s. yaptigimda saece public olan name görünür

        //---------------get
        System.out.println( s.getAge());

        System.out.println("isSuccessful() = " + s.isSuccessful());


        //---------------set
        s.setAge(25);
        System.out.println("s.getAge() = " + s.getAge());

        s.setSuccessful(false);
        System.out.println("s.isSuccessful() = " + s.isSuccessful());

        //set ve get methodlari genellikle (Istisna: Singleton Deseni) statik olmaz.
        // Cunku object uzerinden mantik kurulmus
        //Set ile verileri degistirebiliyoruz, constructor'larla da degistirebiliyoruz.Farki nedir?
        //set ==> mevcut bir nesnenin verilerini degistirmek icin kullanilir
        //constructor ==> Yeni nesnelerin baslangic durumunu belirlemek icin kullanilir.

        //Arastirma Odevi: encapsulation'da private ile gizlenen bir veri baska package'dan set method ile
        //degistirilebilir mi?



        //Encapsulation’da bir object olusturup,iki object gibi kullaniyoruz.
        //Kaliptan istedigimiz kadar boyle olusturabiliriz.
        //Memory problemini onler. Bircok object memoryi doldururdu.


    }
}
