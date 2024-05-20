package d21oop.d20instanceblock_oop;

public class InstanceBlock3 {

    //Ornek 3: Bir araba fabrikasinda her araba siyah renkli ve yakit tipi benzin olsun.

    //(Bunlar ortak ozellikler. Digerleri sonra ayarlansin)

    public  String color;

    public String fuelType;

    //instance Block- bu classtan her object olustruldugunda calisir

    {
        color="siyah";   // her oto varsayilan (default) olarak siyah üretilir
        fuelType="benzin";
    }

    public  InstanceBlock3(){
        System.out.println("Araba Rengi: "+ color);
        System.out.println("Araba yakit türü: "+ fuelType);

    }
    //default olarak siyah ve benzinle baslatmak istemezsek parametreli constructer kullaniriz


    public InstanceBlock3(String color, String fuelType) {
        this.color = color;
        this.fuelType = fuelType;
    }
}
