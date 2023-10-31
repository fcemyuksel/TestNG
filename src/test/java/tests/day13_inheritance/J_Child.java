package tests.day13_inheritance;

public class J_Child extends I_Parent {
    @Override
    public void method1() {
        //overriding (gecersiz kılan) metodun yaninda yukari dogru
        //override (gecersiz kilinan) metodun yaninda asagi dogru
        //OK OLUR

    }

    public void method2(String str) {
        //bir methodun overriding yapmasi icin
        //SIGNATURE'i paretn class ile ayni OLMALIDIR

        //Signature: method ismi
        //          ve parametreleri data turleri
    }


    @Override
    public void method3() {
        super.method3();
    }

    public void method4() {
        //overriding method istenirse @Override
        //notasyonu kullanabilir
        //notasyonu kullanirsak parent classtaki method
        //silinir veya override edilemeyecek sekilde degisirilirse
        //notasyon CTE verir ve duzeltilmesini saglar

    }


    public static void method5() {
        //static methodlar override edilemez
    }

    private void method6() {
        //parent classtaki private methodu goremeyecegi icin,
        // child classdaki method tamamen bagimsiz method olur

    }
    /*
        public void method7(){}
    javada final keywordu DEGİSTİRİLEMEZ demektir
    parent classta final olarak isaretlenen bir method
    degistirilemeyecegi icin override edilemez

    */

    @Override
    void method8() {
        //parent classdaki method8'in access modifieri
        //default access modifierdir
        //child classdaki methodun access modifieri
        //parentinki ile ayni veya daha geniş olabilir
        //bu method icin defauld, protected veya public secilebilir

    }

    @Override
    public void method9() {
        //access modifier parent clastaki methodun
        //access modifieri ile ayni veya daha geniş olabilir
        //public veya protected olabilir
    }

    public void method10() {
        //void veya primitive data turu return eden methodlarin
        //override etmek icin return typeleri ayni olmalidir

    }

    @Override
    int method11() {
        return 5;
    }

    public String method12()
    //return type non primitive ise ya ayni olmali
            //yada childin return type ile
            //parent return type arasında
            //IS_A relationship olmali
            //buna co-variant denir
    {
        return "override";
    }

}
