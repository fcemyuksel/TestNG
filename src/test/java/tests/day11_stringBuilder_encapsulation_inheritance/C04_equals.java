package tests.day11_stringBuilder_encapsulation_inheritance;

public class C04_equals {
    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder("Java");
        StringBuilder sb2=new StringBuilder("Java");
        StringBuilder sb3=new StringBuilder("Tava");
        StringBuilder sb4=new StringBuilder("Jale");

        String str="Java";



        // farklı data turlerine sahip non-primitif variabller ==
         //ile karsilastirilamazlar
        //          System.out.println(sb1==str);   **********      ///

        System.out.println(sb1==sb2);  //false

        System.out.println(sb1.equals(str)); //false
        //StringBuilder ile Stringi equals ile karsilastirisaniz Java
        // itiraz etmez ama sonuc hep FALSE olur


        //sb1'i toString() ile Stringe cevirerek kullanabilriz
        System.out.println(sb1.toString().equals(str));// true
        System.out.println(sb1.equals(sb1)); //true     SADECE KENDİNİ KONTROL EDERSE TRUE VERİR
        System.out.println(sb1.equals(sb2)); // false

        //          StringBuilder objelerde EQUALS kullanılmaz      ///

        System.out.println(sb1.compareTo(sb2)); //0
        //sonuc 0(sıfır) ise metinler aynidir

        //metinler ayni degilse herbir indexdeki karakterleri karsilastirir
        //ve ilk buldugu farkli olan karakterler arasindaki ascii deger farkini dondurur

        System.out.println(sb1.compareTo(sb3)); //-10 Java ile Tava
        System.out.println(sb1.compareTo(sb4)); //10  Java ile Jale
        System.out.println(sb4.compareTo(sb3)); //-10 Jale ile Tava

        //ASCII table'a göre

        StringBuilder sb5=new StringBuilder("java");
        System.out.println(sb1.compareTo(sb5)); // -32 Java ile java
        // ayni harfin büyük ile kucugu arasında 32 fark var




    }
}
