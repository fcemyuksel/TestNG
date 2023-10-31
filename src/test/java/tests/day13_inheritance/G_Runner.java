package tests.day13_inheritance;

public class G_Runner {
    public static void main(String[] args) {

         /*
            Eger ozellik method olarak olusturulursa

            java hangi method'un calisacagini bulmak icin
            aramaya data turunun oldugu class'dan baslar

            ANCAK buldugu ilk method'u kullanmaz
            method'u bulduktan sonra
            o method isminde daha guncel bir
            method var mi diye kontrol eder
            ve constructor'in oldugu class'a kadar
            en guncel bilgiyi bulup onu kullanir

            Yani
            variable'lar objenin data turu olarak secilen class'daki
            tum objelerin ortak ozelliklerini soylerken

            method'lar o ortak ozelligi kabul eder
            ama varsa daha guncelini soyler

         */

        F_AvciKuslar kartal4=new F_AvciKuslar();
        kartal4.hareket();//F class "ucarlar"
        kartal4.solunum();//E class "Akcigerle nefes alir"
        kartal4.beslenme();//F class "et yerler"
        kartal4.cogalma();//E class "yumurta ile cogalirlar"
        kartal4.omur();// D class "yasar ve olurler"
        kartal4.kanat();// E class "kanatlidirlar"
        kartal4.hareket();//F clas "ucarlar"
        kartal4.gaga();// F class "sivri gagali"
        kartal4.pence();//F class "pencelidir"
        System.out.println("===================");

        E_Kuslar kartal5=new F_AvciKuslar();
        kartal5.hareket();//F class "ucarlar"
        kartal5.solunum();//E class "Akcigerle nefes alir"
        kartal5.beslenme();//F class "et yerler"
        kartal5.cogalma();//E class "yumurta ile cogalirlar"
        kartal5.omur();// D class "yasar ve olurler"
        kartal5.kanat();// E class "kanatlidirlar"
        kartal5.hareket();//F class "ucarlar"
        kartal5.gaga();// F class "sivri gagali"
        //kartal5.pence();//CTE
        System.out.println("=================");

        D_Hayvanlar kartal6=new F_AvciKuslar();
        kartal6.hareket();//F class "ucarlar"
        kartal6.solunum();//E class "Akcigerle nefes alir"
        kartal6.beslenme();//F class "et yerler"
        kartal6.cogalma();//E class "yumurta ile cogalirlar"
        kartal6.omur();// D class "yasar ve olurler"
        //kartal6.kanat();// CTE
        kartal6.hareket();//F class "ucarlar"
        //kartal6.gaga();// CTE
        //kartal6.pence();//CTE
        System.out.println("===================");

        E_Kuslar kus1=new E_Kuslar();
        kus1.hareket();//D class "hareket edeler"
        kus1.solunum();//E class "Akcigerle nefes alir"
        kus1.beslenme();//D class "beslenirler"
        kus1.cogalma();//E class "yumurta ile cogalirlar"
        kus1.omur();// D class "yasar ve olurler"
        kus1.kanat();// E class "kanatlidirlar"
        kus1.hareket();//F clas "ucarlar"
        kus1.gaga();// E class "gagalidir"
        //kus1.pence();//CTE
        System.out.println("===================");

        D_Hayvanlar kus2=new E_Kuslar();
        kus2.hareket();//D class "hareket edeler"
        kus2.solunum();//E class "Akcigerle nefes alir"
        kus2.beslenme();//D class "beslenirler"
        kus2.cogalma();//E class "yumurta ile cogalirlar"
        kus2.omur();// D class "yasar ve olurler"
        //kus2.kanat();// CTE
        kus2.hareket();//D clas "hareket ederler"
        //kus2.gaga();// CTE
        //kus2.pence();//CTE
        System.out.println("===================");

        D_Hayvanlar hayvan1=new D_Hayvanlar();
        hayvan1.hareket();//D class "hareket edeler"
        hayvan1.solunum();//D class "nefes alirlar"
        hayvan1.beslenme();//D class "beslenirler"
        hayvan1.cogalma();//D class "cogalirlar"
        hayvan1.omur();// D class "yasar ve olurler"
        //hayvan1.kanat();// CTE
        hayvan1.hareket();// CTE
        //hayvan1.gaga();// CTE
        //hayvan1.pence();//CTE
        System.out.println("===================");

    }
}
