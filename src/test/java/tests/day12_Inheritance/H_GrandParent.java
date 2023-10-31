package tests.day12_Inheritance;

public class H_GrandParent {
    String strGP="Grand Parent";
    String str="GPStr";

    H_GrandParent(){
        System.out.println("Grandparent parametresiz constructor ");
    }
    H_GrandParent(int sayi){
        System.out.println("Grandparent int parametreli constructor ");
    }
    H_GrandParent(String str){
        this();
        strGP="Super GP";
        System.out.println("Grandparent String parametreli constructor ");
    }

}
