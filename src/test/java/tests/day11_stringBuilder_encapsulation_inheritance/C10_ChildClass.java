package tests.day11_stringBuilder_encapsulation_inheritance;

public class C10_ChildClass extends C09_ParentClass {

    int sayi=25;
    String Adres="İzmir";
    /*
    insanlar aleminden farkli olarak
    Javada chil classlar parent belirler(secer)

    bir class istedigi herhangibir classa extends
    keywordu ile child olabilir

    bir class baska bir classi parent edinirse
    parent classtaki tum ozelliklere
    (variable, method,vs) otomatik olarak sahip olur

     parent classdaki özelliklerden
     1-istedigini direkt kullanir
     2-istedigini kendine uyarlar
     3-isterse de parent classda olmayan yeni özellikler ekleyebilir


     */
    public static void main(String[] args) {
        C10_ChildClass obj=new C10_ChildClass();
        obj.methodChild();
    }
    public void methodChild(){
        System.out.println(sayi);// 25
        renk="kirmizi";
        System.out.println(renk);// kirmizi
        System.out.println(no);//33
    }
}
