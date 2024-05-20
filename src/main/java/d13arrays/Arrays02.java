package d13arrays;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {

        //Ornek 1: int turunde ages isminde bir Array olusturunuz, icine 6 tane eleman yerlestiriniz,
        //  bu elemanlarin en kucugu ile en buyugunun toplamini ekrana yazdiriniz

        int [] ages=new  int[6];
        ages[0] = 20;
        ages[1] = 23;
        ages[2] = 19;
        ages[3] = 44;
        ages[4] = 15;
        ages[5] = 32;

        System.out.println(Arrays.toString(ages)); //[20, 23, 19, 44, 15, 32]

        //sort() methodu sayilari kucukten buyuge siralar (ascending order)
        //String data tiplerini alfabetik siralar (alphabetical order)
        //ascending order + alphabetical order = natural order
        //sort() methodu Array elemanlarini natural order'a gore siralar


        //ages.for yazinca otomatik yapiyor

        /*1.YOL:
        Arrays.sort(ages);
        System.out.println(Arrays.toString(ages));

        System.out.println(ages[0]+ages[ages.length-1]);
        */

        //2.YOL: Math.max ve Math.min

        int minimum= ages[0];
        int maxsimum= ages[0];

        //[20, 23, 19, 44, 15, 32]

        for (int w: ages){
            minimum=Math.min(minimum,w);
            maxsimum=Math.max(maxsimum,w);

        }
        System.out.println(minimum); //15
        System.out.println(maxsimum); //44
        System.out.println(maxsimum+minimum); //59



    }
}
