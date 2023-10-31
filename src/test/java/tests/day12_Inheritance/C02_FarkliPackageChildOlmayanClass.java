package tests.day12_Inheritance;

import tests.day11_stringBuilder_encapsulation_inheritance.C05_AccessModifiers;

public class C02_FarkliPackageChildOlmayanClass {

    public static void main(String[] args) {
        //System.out.println(C05_AccessModifiers.strDefault); //başka packagedan kullanamaz

        //C05_AccessModifiers.strPrivate

        C05_AccessModifiers.strpublic="ayni package'dan deger atamasi yapabiliriz";
        //C05_AccessModifiers.methodDefault(); //başka packagedan kullanamaz
        //C05_AccessModifiers.methodPrivate();
        // 'methodPrivate()' has private access in 'tests.day11_stringBuilder_encapsulation_inheritance.C05_AccessModifiers'
        //C05_AccessModifiers.methodProtected(); //başka packagedan kullanamaz ***exdends olmadigi icin
        C05_AccessModifiers.methodpublic();//public Method
        //extends yapilmadgi icin sadece publice ulasilabilir
    }
}
