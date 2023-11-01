package tests.day14_abstractClasses_interfaces;

public interface I04_InterfaceBodysiOlanMethod {

    void method1(); // access modifier public

    public abstract void method2(); //access modifier public
           //bunlara static yazamayiz
    //public protected void method3(); //Illegal combination of modifiers: 'public' and 'protected'
                                       //iki access modifier kullanilamaz

    public default void method3(){
        System.out.println("Interface default method3");
        /*
         Bir projede Interface'e sonradan bir abstract method eklerseniz
            O interface'i daha onceden implement etmis olan tum class'lar
            yeni eklenen method'u da implement etmek zorunda kalir.
            ANCAK buyu projelerde bu tur sonradan yapilan degisikliklerin
            nasil bir karisikliga sebep olacagini ongoremeyiz

            JAVA 8 ile developer'larin talepleri cercevesinde
            Java Interface'lerde bir istisna olusturmustur

            EGER bir interface'de
            default veya static keyword kullanarak bir method olusturursaniz
            bu method body'ye sahip olabilir
            ve boylece tum child class'larin IMPLEMENT mecburiyeti OLMAZ
         */
    }

    //public static void method4(); //Static methods in interfaces should have a body
    public static void method4(){
        System.out.println("Interface static method4");
    }
}
