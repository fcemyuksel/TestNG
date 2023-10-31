package tests.day12_Inheritance;

public class J_Child extends I_Parent{

    String strChild="Child";
    String str="ChildStr";

    J_Child(){
        //super() ;  Gorunur bir constructor call olmadıgından burada gorunmeyen costructor call var
        System.out.println("Child parametresiz constructor");
    }
    J_Child(int sayi){
        super("Java");
        System.out.println("Child int parametreli constructor");
    }
    J_Child(String str){
        super(7);
        System.out.println(str);
        System.out.println("Child String parametreli constructor");
        str="Son";
    }

    J_Child(boolean bl){
        //super(true);

        //eger parent classta olmayan bir const cagrilirsa
        //CTE olusur

    }

    public static void main(String[] args) {

        J_Child child3=new J_Child("Ali");
        System.out.println(child3.strChild);//Child
        System.out.println(child3.strParent);//Parent
        System.out.println(child3.strGP);//Grand Parent
        System.out.println(child3.str);//ChildStr

        J_Child child2=new J_Child(5);
        System.out.println(child2.strChild);//Child
        System.out.println(child2.strParent);//Yeni Parent
        System.out.println(child2.strGP);//Grand Parent


        J_Child child1=new J_Child();
        System.out.println(child1.strChild);//Child
        System.out.println(child1.strParent);//Parent
        System.out.println(child1.strGP);//Grand Parent
        System.out.println(child1.str);//ChildStr
        /*
        Child Classda bir obje olusturuldugunda
        parent classlardaki tum ozelliklere
        sahip olur.
        Ancak
        Javanın bir objeye ilk deger atamasi
        (initialization) için constructor
        calismalidir.
        Java bunun için özel bşr mekanizma
        olusturmustur.

        extends kullanan bir classtaki
        her constructorun ilk satirinda mutlaka
        bir con. call olur.
        eger cons. call yoksa Java default olarak
        super() koyar.
         */

    }                                                                       //
}
