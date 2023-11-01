package tests.day15_exceptions;

public class C03_CokluExeptions {
    public static void main(String[] args) {
        String str="Java Candir";
        int[] arr={2,4,5,6,7,8,95,6,7,8,9,1,22};
        //input olarak verilen tam sayiyi alip Sting ve
        //arrayde o indexdeki elementleri yazdirin
        int input=20;

        //birden fazla riskli durum varsa
        //4 ihtimalimiz var
        //1- ayri ayri try-catch yapabiliriz
        //   iki exepcitionu da kontrol altina almis oluruz

        /*
        try {
            System.out.println(str.substring(input,input+1));// C
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("index stringin disinda");
        }
        try {
            System.out.println(arr[input]);//8
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("index array disinda");
        }

         */
        //ic ice try catch bloklari kullanabiliriz
        //ic ice yapilar karmasik oldugundan tavsiye edilmez
        /*
        try {
            try {
                System.out.println(arr[input]);
                System.out.println(str.substring(input,input+1));
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("index array disinda");
            }
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("index stringin disinda");
        }


         */

        //3- 1 try, birden fazla catch ekleyebiliriz
        //ilk karsilastigi exceptionu yazdirir

        try {
            System.out.println(arr[input]);
            System.out.println(str.substring(input,input+1));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("index array disinda");
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("index stringin disinda");
        }



        //4- olusabilecek tum exceptionlari kapsayan bir tek catch cumlesi yazilabilir
        //daha genel bir aciklama yazilabilir.
        //sorunun spesifik kaynagi bulunamayabilir
        /*
        try {
            System.out.println(arr[input]);
            System.out.println(str.substring(input,input+1));
        } catch (Exception e) {
            System.out.println("index str veya arrayin sinirlari disinda");
        }


         */
    }


}
