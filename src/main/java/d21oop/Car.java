package d21oop;

public class Car extends Vehicle {


    public  String model="Accord";
    public  int year=2024;




    public Car(){ //3 //C
        this("Sport");
        System.out.println("Sedan");
    }
    public Car(String tip){ //D
        super();
        System.out.println("Sport");
    }
}

