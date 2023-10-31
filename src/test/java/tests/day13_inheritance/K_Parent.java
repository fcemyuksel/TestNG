package tests.day13_inheritance;

public class K_Parent {

    public void method1(){
        System.out.println("Parent method1");

    }
    public void method2(){
        System.out.println("Parent method2");
    }
}

class Child extends K_Parent{
    public void method1(){
        System.out.println("Child method1");
    }

    @Override
    public void method2() {
        super.method2();
        System.out.println("Child class method2");
    }

    public static void main(String[] args) {

        Child child=new Child();
        child.method1();// Child method1
        child.method2();//

        K_Parent child2=new Child();
        child2.method1();// Child method1
        child2.method2();//
    }

}