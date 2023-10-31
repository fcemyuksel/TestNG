package tests.day14_abstractClasses_interfaces;

public class C07_ChildOfAbstractParendAndGP extends C06_AbstractParent{
 /*
        Abstract class'in abstract child class'lari olabilir

        bir abstract child, parent'i olan abstract class'daki
        abstract method'lari kendisine uyarlamak ZORUNDA DEGILDIR
           - isterse kendisine uyarlayip concrete'lestirir
           - isterse hic bir islem yapmayabilir

        Abstract bir zincirden (parent - grandparent - ...)sonra gelen
        ILK CONCRETE class parent abstract class'lardaki
        concrete'lestirilmeyen TUM abstract method'lari
        kendisine implement etmek ZORUNDADIR
     */

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    @Override
    public void method3() {

    }
}
