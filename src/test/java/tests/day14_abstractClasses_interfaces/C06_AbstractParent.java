package tests.day14_abstractClasses_interfaces;

public abstract class C06_AbstractParent extends C05_AbstractGrandParent {

    public abstract void method2();

    public abstract void method3();

    @Override
    public void method4() {
        System.out.println("GP'deki abstract methodu concrete'lestirdim");
    }

    //public final abstract void method5();
    // Illegal combination of modifiers: 'final' and 'abstract'
    // final ==> override edilemez demek , abstract ==> mutlaka override edilecek demek


    // private abstract void method6();
    // Illegal combination of modifiers: 'abstract' and 'private'
    // abstract ==> mutlaka override edilecek
    // private method'lar class disindan kullanilamayacagi icin override edilemez
}

