package tests.day14_abstractClasses_interfaces;

public class C04_ChildOfKuralciParent extends C03_KuralciParent{


    @Override
    public void method2() {
        // abstract parent class'lar
        // child class'lari abstract olarak isaretlenen method'lari
        // implement etmeye zorlarlar.
        // method body'sine yani method'u nasil kullanacaklarina karismazlar
    }
    public void method1(){
        // child class'lar parent class'daki concrete method'lari
        // (abstract olmayan)
        // kendilerine ISTERLERSE uyarlayabilirler

        // parent class'lardaki concrete method'lari
        // Override etmek OPSIYONEL'dir
        // child class isterse override eder
        // isterse parent class'dan kullanir
    }

    @Override
    public void method4() {

    }
    //public abstract void method5();
    // Abstract method in non-abstract class
    // Concrete bir class icerisinde ABSTRACT method OLUSTURULAMAZ
}
