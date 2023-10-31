package tests.day12_Inheritance;

public class K_ClassUyeleriniKullanma {

    String str="Java";
    int sayi=30;
    char ch='k';

    public static void main(String[] args) {
        K_ClassUyeleriniKullanma obj=new K_ClassUyeleriniKullanma();
        obj.method1();
    }
    public void method1(){
        String str="Tava";

        System.out.println(str); //Tava
        System.out.println(this.str);//Java

    }
}
