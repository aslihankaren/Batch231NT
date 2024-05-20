package d19stringbuilder_buffer_accesmodifier_static;

public class StudentRunner02 {
    public static void main(String[] args) {


        //Static classs üyelerine ulasmak icin sadce class ismi yeterlidir
        System.out.println(Student02.stdName); //Ali  Can

        //age non static oldugu icin, ona ulasmak icin object olusturmaliyiz

        Student02 ali= new Student02();
        System.out.println(ali.age);

        Student02.StaticMethod(); //ben statik metodum
        ali.nonStaticMethod();  //ben non-statik metodum







    }
}
