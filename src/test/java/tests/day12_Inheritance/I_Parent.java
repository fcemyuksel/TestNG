package tests.day12_Inheritance;

public class I_Parent extends H_GrandParent{
    String strParent="Parent";
    String str="ParentStr";
    I_Parent(){
        System.out.println("Parent parametresiz constructor");
    }
    I_Parent(int sayi){
        super("Hava");
        System.out.println(strParent);
        this.strParent="En Yeni Parent";
        System.out.println("Parent int parametreli constructor");
    }
    I_Parent(String str){
        strParent="Yeni Parent";
        System.out.println("Parent String parametreli constructor");
    }
    I_Parent(char chr){
        //super();
        //constructor parametreliolsa da Javanın default olarak
        //koydugu const call parametresizdir.
    }
}
