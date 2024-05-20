package d21oop;

public class Dog extends Mammal {
    public void bark(){
        System.out.println("Dogs bark...");
    }

    @Override
    public void eat(){
        System.out.println("Dogs eat...");
    }

    @Override
    public Animal create(){
        return new Dog();
    }

    @Override
    public int add(int a, int b) {
        return a + b; //Buradaki int'i ornegin long veya short yapamazsiniz
        //cunku aralarinda p2c iliskisi yok
        //primitive'lerde return type degistirilemez
    }

    @Override
    public Integer carpma(Integer a, Integer b) {
       Integer sonuc= super.carpma(a,b);

        //Ek islevsellik eklemek
        return  sonuc +10;



    }
}