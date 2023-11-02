package tests.day15_exceptions;

public class C06_ExceptionExamples {

    public static void main(String[] args) {

        String str=null;
        System.out.println(str); //null
        System.out.println(str+" Java");//null Java

        String s="Guzeldir";
        //System.out.println(str+ " Java "+s);//null Java Guzeldir
        //System.out.println(str.length());//NullPointerException

        //System.out.println(str.equals(s));//NullPointerException

        //System.out.println(str.concat(s));//NullPointerException

        // null olarak isaretlenen bir String yazdirilabilir
        // ama yazdirma disinda bir method kullanildiginda NullPointerException verir

        //String sayiStr="A56";// rakam yerine farkli bir karakter girilirse NumberFormatException verir

        String sayiStr="256";
        //str 100'den buyuk mu?

        if (Integer.parseInt(sayiStr)>100){
            System.out.println("String olarak verilen sayi 100'den buyuk");
        }else System.out.println("String olarak verilen sayi 100'den buyuk DEGIL");

        //non-primitivelerde casting islemi sadece parent-child classlar arasında olabilir
        String abc="Java Candir";
        Object obj=abc; //auto widening
        Integer abcSayi= (Integer) obj; //explicit narrowing    ClassCastException

        //Syntax acisindan Object data turundeki bir variablein degeri
        //Integer data turune explicit narrowing ile cast edilebilir
        //ANCAK Java kodlari calisirdiginde obj variable degerinin
        //Integere'a uygun olmadigini görür ve ClassCastException firlatir
    }
}
