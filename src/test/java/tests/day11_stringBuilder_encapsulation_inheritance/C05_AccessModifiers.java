package tests.day11_stringBuilder_encapsulation_inheritance;

public class C05_AccessModifiers {

    //bir class ut-yesi olusturuldugunda accessModifier olusturulmak zorundadir
    String str; // eger gorunur access modifier yoksa
                //Java default access modifier tanimlar


    private static String strPrivate="private String";
        private static void methodPrivate(){
        System.out.println("Private Method");
    }
    static String strDefault="Default String";
    static void methodDefault(){
        System.out.println("Default Method");
    }

    protected static String strProtected="protected String";
    protected static void methodProtected(){
        System.out.println("protected Method");
    }

    public static String strpublic="public String";
    public static void methodpublic(){
        System.out.println("public Method");
    }

    public static void main(String[] args) {
        System.out.println(strPrivate);
        strPrivate="main methoddan deger atadim";

        System.out.println(strDefault);
        System.out.println(strProtected);
        System.out.println(strpublic);

        methodDefault();
        methodPrivate();
        methodProtected();
        methodpublic();
    }

}
