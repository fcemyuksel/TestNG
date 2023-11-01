package tests.day14_abstractClasses_interfaces;

public interface I03_Interface2 {

    int S=30;

    String ISIM="VELI";

    void method1();

    //String method2();
    //bir class birden fazla interfaceyi implement edebilir
    // ANCAK implement ettigi interface'lerde
    // AYNI ISIMDE fakat FARKLI RETURN TYPE'lara sahip method olursa conflict cikar
    // bu durumda cozum conflict olusan iki interface'den birini implement etmekten vazgecmek olabilir
    // veya yapisal problemlere yol acmayacaksa, interface'lerdeki cakisan method'larda
    // duzeltme yapilabilir

}
