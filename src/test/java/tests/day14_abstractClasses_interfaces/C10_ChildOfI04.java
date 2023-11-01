package tests.day14_abstractClasses_interfaces;

public class C10_ChildOfI04 implements I04_InterfaceBodysiOlanMethod{
    @Override
    public void method1() {
        System.out.println("Child method1");

    }

    @Override
    public void method2() {
        System.out.println("Child method2");
    }

    public static void main(String[] args) {
    /*
            Interface'de istisnai olarak olusturulabilen
            static olarak isaretli method'lar InterfaceAdi.staticMethodAdi() seklinde calistirilabilirken
            default olarak isaretli method'lar obje olusturularak kullanilabilir
         */

        I04_InterfaceBodysiOlanMethod.method4();//Interface static method4

        C10_ChildOfI04 obj=new C10_ChildOfI04();
        obj.method3();

    }
}
