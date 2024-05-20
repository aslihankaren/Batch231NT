package d20instanceblock_oop;

public class InstanceBlock3Runner {
    public static void main(String[] args) {


        InstanceBlock3 car1=new InstanceBlock3();
        //InstanceBlock3 car2=new InstanceBlock3(); //aynisi olur cünkü parametre girilmedi




        InstanceBlock3 car2= new InstanceBlock3("kirmizi","dizel");
        System.out.println("araba rengi: "+ car2.color);
        System.out.println("Araba yakit: "+ car2.fuelType);

        System.out.println(car2); //referans yazar




    }
}
