package tests.day14_abstractClasses_interfaces;

public class C08_ChildOfI01 implements I01_Interface{
    public static void main(String[] args) {

        System.out.println(sayi);//10
        System.out.println(isim);

        //isTrue=false;  Cannot assign a value to final variable 'isTrue'
        //sayi2=15;         Cannot assign a value to final variable 'sayi2'

        // interface'lerdeki tum variable'lar final, static ve public'dir
        // final olarak isaretlenen bir variable'in degeri sonradan degistirilemez

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Math.PI);
    }

    @Override
    public void method2() {

    }

    @Override
    public void method3() {

    }

    @Override
    public void method5() {

    }
    //Class 'C08_ChildOfI01' must either be declared abstract or implement abstract method 'method2()' in 'I01_Interface'

}
