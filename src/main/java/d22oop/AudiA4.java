package d22oop;

public class AudiA4 implements Motor,Klima,Fren{

/*
a) interface'leri parent yapmak icin 'implements' keyword'u child icinde kullanilir

b) extends kullanilmaz cunku bu iki class arasinda kullanilir

c) AudiA4 Class'i, Motor interface'i icindeki tum methodlari override etmek zorundadir.

d) AudiA4 Class'i, Motor interface'i icindeki tum methodlari override etmek zorunda
oldugundan method'larin bas kismina 'override' yazmak gerekmez bu yuzden yazmayiz.

e) Class icinde access modifier yazilmazsa default kabul edildiginden, mecbur public yazariz
*/


//Motor interface'inden override edilenler

    public void eco(){
        System.out.println("Audi ekonomik motor kullanir");
    }

    public void turbo(){
        System.out.println("Audi turbo motor kullanir");
    }
    public void gas(){
        System.out.println("Audi benzinli motor kullanir");
    }

    //Klima interface'inden override edilenler
    public void analog(){
        System.out.println("Audi analog klima kullanir");
    }

    public void digital(){
        System.out.println("Audi digital klima kullanir");
    }


    //fren interface'inden override edilenler
    public void abs(){
        System.out.println("Audi abs kullanir");
    }

    public void ebs(){
        System.out.println("Audi ebs kullanir");
    }
//Odev: AudiS5 class'i olusturup, interface'lere child yapip, gerekli override'lari yapiniz


}
