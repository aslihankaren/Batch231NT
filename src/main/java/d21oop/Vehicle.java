package d21oop;

public class Vehicle {


    //Java'da, bir sınıf için herhangi bir constructor açıkça tanımlanmamışsa,
    // Java derleyicisi o sınıfa ait varsayılan bir constructor ekler.
    // Bu varsayılan constructor parametresizdir ve class'in kendisine aittir,
    // Object class içinde tanımlı değildir. Ancak, tüm class'lar doğrudan ya da dolaylı olarak
    // Object class'indan miras alır ve Object sınıfındaki temel metodlara erişebilir.
    //(örneğin, toString(), equals(), hashCode() vb.).

    //Constructor Hiyerarsisi

    /*
    Child class'tan bir object olusturdugunuzda constructor'lar en ustteki parent class'tan
    baslatilarak alta doğru calistirilir
    */

    //Constructor olusturalim
    public Vehicle() { //4 //E
        this("Honda", 2024, "Elektrikli");
        System.out.println("Honda, 2023, Benzin");
    }

    public Vehicle(String marka, int yil, String motor) {
        super();
        System.out.println("Honda,2024, Elektrikli");
    }
}

