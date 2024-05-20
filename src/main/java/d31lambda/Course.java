package d31lambda;

public class Course {

    //Senaryo: Lambdayi object’lerle kullanmayi ogrenelim.
    // Class icerisinde pasif ve aktif ozellikler olusturalim

    /*
        Icinde
        1) private variable'lar (kapsulleme-encapsulation)
        2) parametreli ve parametresiz constructor'lar
        3) getter'lar -Private değişkenlere erişim sağlamak için-
        4) setter'lar -Private değişkenleri değiştirmek için-
        5) toString() methodu -Objenin içeriğini okunabilir bir formatta döndürmek için-
        barindiran classlara POJO class denir

        POJO==>Plain Old Java Object -Düz Eski Java Nesnesi

        Birçok uygulamada, veriyi bir katmandan diğerine taşımak için POJO sınıfları kullanılır. (API)
    */
    //1 private variable'lar

    private String season;
    private String  CourseName;
    private  int averagescore;
    private  int numberOfStudents;


//2) parametreli ve parametresiz constructor'lar


    public Course(String season, String courseName, int averagescore, int numberOfStudents) {
        this.season = season;
        CourseName = courseName;
        this.averagescore = averagescore;
        this.numberOfStudents = numberOfStudents;
    }


    public Course() {
    }




    //3) getter'lar -Private değişkenlere erişim sağlamak için-

    public String getSeason() {
        return season;
    }

    public String getCourseName() {
        return CourseName;
    }

    public int getAveragescore() {
        return averagescore;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }


    //4) setter'lar -Private değişkenleri değiştirmek için-


    public void setSeason(String season) {
        this.season = season;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public void setAveragescore(int averagescore) {
        this.averagescore = averagescore;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }


    // 5) toString() methodu


    @Override
    public String toString() {
        return "Course{" +
                "season='" + season + '\'' +
                ", CourseName='" + CourseName + '\'' +
                ", averagescore=" + averagescore +
                ", numberOfStudents=" + numberOfStudents +
                '}';
    }
}
