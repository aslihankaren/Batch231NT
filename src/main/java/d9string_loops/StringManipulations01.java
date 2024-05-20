package d9string_loops;

public class StringManipulations01 {
    public static void main(String[] args) {
        //Ornek 1: Bir String’in belirli bir karakterinden baslayarak belirli bir karaktere kadar
// tum karakterleri dynamic olarak aliniz. abc@gmail.com ===> gmail

        //1.YOL- Hard Code:  //tavsiye edilmez
        String a = "abc@gmail.com";
        System.out.println(a.substring(4, 9));

        //2.YOL Dinamic code:
        String company1 = a.split("@")[1].split("\\.")[0];
        System.out.println(company1); // yahoo, gmail, vb direk aldi ama yukaridaki kaydi

        //3.YOL Dinamic code:
        //indexOf() method’u spesifik bir karakterin ilk gorunumunun index’ini verir
        //Bu method olmayan karakterler icin -1 verir


        int startingIndex = a.indexOf("@")+1; //3
        int endingIndex = a.indexOf("."); //9

        String companyName = a.substring(startingIndex, endingIndex);
        System.out.println(companyName); //  +1 olmadan @gmail aldi


    }

}
