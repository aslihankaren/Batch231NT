package d10loops;

public class ForLoops03 {
    public static void main(String[] args) {
        //ornek 1: 6'dan 10'a kadar tum int'lerin toplamini console'a yazdiriniz
//           6+7+8+9+10=40 ==> 40

    int toplam=0;

        for (int i = 6; i < 11 ; i++) {
            toplam=toplam+i;
        // System.out.println(toplam);  ara toplm lari da gösterir
        }

        System.out.println(toplam);



        //ornek 2: 10'dan 7'e kadar tum int’lerin carpimini console’a yazdiriniz
        //      10x9x8x7 ==> 5040      i/=10


int carpim=1;
        for (int i = 10; i > 6; i--) {
            carpim=carpim*i;

        }

        System.out.println(carpim);

    }
}
