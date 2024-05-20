package d22oop;

public class HondaRunner {
    public static void main(String[] args) {

        // Honda h= new Honda();  //abstract tan bir class olmaz
        Civic c= new  Civic();
        c.engine(); //Gas 1.6 Eco


        Accord a = new Accord();
        a.engine(); //Gas 2.0 Turbo

        a.music(); //pro



    }
}
