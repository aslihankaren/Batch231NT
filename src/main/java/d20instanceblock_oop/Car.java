package d20instanceblock_oop;

public class Car extends Vehicle {

    public Car(){
        super(); //2
        System.out.println("sedan");

    }
public  Car(String tip){
        super("honda", 2024,"Elektrikli");
    System.out.println("sport");
}


}
