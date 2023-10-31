package tests.day13_inheritance;

public class C_AvciKuslar extends B_Kuslar{
    String hareket= "ucarlar";
    String beslenme= "et yerler";
    String pence= "pencelidir";
    String gaga= "sivri gagali";

    public static void main(String[] args) {
         /*
            Eger bir ozellik variable olarak olusturulmussa
            Objenin ozelliklerini ararken
            Aramaya data turunun oldugu class'dan baslarim
            ve buldugumuz ilk variable'in degerini kullaniriz

            Burada Java'nin realize ettigi fikir
            bir obje'nin data turu ne ise
            o data turune sahip tum objelerle
            ayni ozellikleri tasiyor OLMALI
         */

        C_AvciKuslar kartal1=new C_AvciKuslar();
        // Data turu C classindan (Avci Kuslar) arama yapmaya basladigi icin once kendi classina bakar
        System.out.println(kartal1.omur);//A classindan yasar ve olurler
        System.out.println(kartal1.solunum);//B classindan akcigerle nefes alirlar
        System.out.println(kartal1.cogalma);//B classindan yumurtayla cogalirlar
        System.out.println(kartal1.kanat);//B classindan kanatlidir
        System.out.println(kartal1.gaga);//C classindan sivri gagali
        System.out.println(kartal1.pence);// C classindan pencelidir
        System.out.println(kartal1.hareket);//C classindan ucarlar
        System.out.println(kartal1.beslenme);//C classindan et yerler
        System.out.println("=========================================");

        B_Kuslar kartal2=new C_AvciKuslar();
        //Data turu Kuslar classindan baslar
        System.out.println(kartal2.omur);//A classindan yasar ve olurler
        System.out.println(kartal2.solunum);//B classindan akcigerle nefes alirlar
        System.out.println(kartal2.cogalma);//B classindan yumurtayla cogalirlar
        System.out.println(kartal2.kanat);//B classindan kanatlidir
        System.out.println(kartal2.gaga);//B classindan gagalari vardir
        System.out.println(kartal2.hareket);//A classindan hareket ederler
        System.out.println(kartal2.beslenme);//A classindan beslenirler
        //System.out.println(kartal2.pence);// B ve A classinda pence olmadıgi icin CTE verir
        System.out.println("=========================================");

        A_Hayvanlar kartal3=new C_AvciKuslar();
        //Data turu A Hayvanlar classindan baslar
        System.out.println(kartal3.omur);//A classindan yasar ve olurler
        System.out.println(kartal3.solunum);//A classindan nefes alirlar
        System.out.println(kartal3.cogalma);//A classindan cogalirlar
        //System.out.println(kartal3.kanat);//A classinda kanat olmadıgi icin CTE verir
        //System.out.println(kartal3.gaga);//A classinda gaga olmadıgi icin CTE verir
        System.out.println(kartal3.hareket);//A classindan hareket ederler
        System.out.println(kartal3.beslenme);//A classindan beslenirler
        //System.out.println(kartal3.pence);//A classinda pence olmadıgi icin CTE verir

    }
}
