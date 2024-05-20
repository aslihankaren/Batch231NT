package d21oop.d20instanceblock_oop;

public class Honda extends Car {
    public Honda(){
        super(); //1
        System.out.println("civic");

    }

    public  Honda(String model){ //b
        super("Sport");
        System.out.println("Accord");

    }

}
