package tests.day12_Inheritance;

import java.util.ArrayList;
import java.util.List;

public class M_DataTypeKullanimi {

    public static void main(String[] args) {

        List<String> isimler      =new ArrayList<>();
        ArrayList<String> isimler2=new ArrayList<>();

        int sayi=10;
        //int data turudur
        String str="Java Candir";
        //String hem classdır
        //       hem de o classtan olusturulan objeler icin data turudur
        //Butun non primitive data turleri bir class veya interface dir
        //butun class/interfaceler de pirimitive data turudur

        F_Corolla corolla1=new F_Corolla();
        E_Toyota corolla2=new F_Corolla();
        D_Araba corolla3=new F_Corolla();

        // Java'da child class constructor'i kullanilarak olusturulan bir objenin
        // data turu kendi class'i veya parent class'lari secilebilir
    }
}
