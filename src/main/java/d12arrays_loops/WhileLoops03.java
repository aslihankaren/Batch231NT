package d12arrays_loops;

public class WhileLoops03 {
    public static void main(String[] args) {


//Ornek 1:  Belirli bir tamsayının palindrome olup olmadığını kontrol eden kodu yazın.
//      Palindrome: 121 <==> 121    123321 <==> 123321


//tersten okunusu da ayni olan cumle sayi vb

        //String'e çevirmemizin mantığı birleştirme yapması yani çevirmesek toplama yapacak?

int k=312;

        String m =String.valueOf(k); //"312"
        String reversed=""; //ters cevrilmis olani bunun icinde saklayacagiz
        int n=m.length()-1;  //son indeksi alip n degiskenine yükledik

        while (n>-1){ //n>=0 da olur
            reversed=reversed+m.charAt(n);
            n--;
        }
        System.out.println(reversed);

if (m.equals(reversed)){
    System.out.println("palindiromdur");
}else{
    System.out.println("palindirom degil");
}






    }
}
