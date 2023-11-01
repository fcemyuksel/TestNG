package tests.day14_abstractClasses_interfaces;

public class C11_ChildOfI04 implements I04_InterfaceBodysiOlanMethod{
    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    @Override
    public void method3() {

    }

    public static void method4(){
        //parent classtaki method4 abstract olmadigindan implamant edilemez
        //parent classdaki method4 static oldugu icin override da edilemez
        System.out.println("Child Classdaki method 4");
    }

    public static void main(String[] args) {
        method4();//Child Classdaki method 4
        I04_InterfaceBodysiOlanMethod.method4();//Interface static method4
    }
}
