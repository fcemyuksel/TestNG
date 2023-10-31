package tests.day14_abstractClasses_interfaces;

public abstract class C03_KuralciParent {
        /*
        Java'da kuralci parent kullanimi mecbur degildir

        EGER bir class kendisini PARENT edinecek child class'larin
        parent class'daki BELIRLENEN method'lari
        MUTLAKA bulundurmasi ve OVERRIDE ederek kendisine uyarlamasini istiyorsak

        abstract yapilar kullaniriz.

        Bir Parent'in child class'lari zorlayabilmesi icin
            - oncelikle bunu class olarak deklare etmesi lazim
              bunun icin method deklarasyonuna
              abstract keyword eklenir
            - abstract class'lar KISMI ABSTRACTRACTION'a sahiptir
                * child class'lari override etmeye zorlamak ISTEMEDIGIMIZ
                  method'lari bugune kadar olusturdugumuz sekilde olustururuz
                * child class'larin OVERRIDE etmesini
                  MECBURI yapacagimiz method'lari ise
                  abstract olarak olustururuz
     */

    public void method1(){

    }

    public abstract void method2();
    // abstract method'lar sadece zorunluluk olusturmak icin kullanilir
    // body'leri olmaz
}
