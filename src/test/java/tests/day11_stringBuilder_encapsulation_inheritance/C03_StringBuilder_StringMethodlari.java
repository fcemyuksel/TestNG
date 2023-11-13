package tests.day11_stringBuilder_encapsulation_inheritance;

public class C03_StringBuilder_StringMethodlari {
    public static void main(String[] args) {

        // StringBuilder'da kullanilan
        //bize int, String, char donduren methodlar kalici degisiklik yapmazlar

        StringBuilder sb=new StringBuilder("Java Candir");

        System.out.println(sb.substring(5));//Candir

        System.out.println(sb); //Java Candir

        // sb. sonrasi bize StrinBuilder dondururen methodlar verdigimiz
        // degeri degistirir
        // sb. sonrasi bize StrinBuilder DONDURMEYEN  methodlar verdigimiz
        // degeri DEGİSTİRMEZLER.

        System.out.println(sb.indexOf("Java"));//0  (indexi sıfırdır

        //sb de java var mi?
        //bazen StringBuilder bir variablede String Methodlari kullanmak isteriz
        //bu durumlar icin once toString() ile sb'i Stringe cevirebiliriz

        System.out.println(sb.toString().contains("Java"));//true

        System.out.println(sb);//Java Candir (icerik degismedi)



        }
    }


