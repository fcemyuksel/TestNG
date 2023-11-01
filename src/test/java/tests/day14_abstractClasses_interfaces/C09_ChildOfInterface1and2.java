package tests.day14_abstractClasses_interfaces;

public class C09_ChildOfInterface1and2 extends C01_ClassicParent implements I02_Interface1,I03_Interface2{
    @Override
    public void method1() {

    }

    @Override
    public int method2() {
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(SAYI);
        System.out.println(S);

        //System.out.println(ISIM);
        //ISIM varieblei iki farkli interface oldugundan Java hangisini kullanacagini sorar
        System.out.println(I03_Interface2.ISIM); //VELI
        System.out.println(I02_Interface1.ISIM);//ALI
    }
}
