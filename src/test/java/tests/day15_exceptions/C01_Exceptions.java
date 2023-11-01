package tests.day15_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C01_Exceptions {

    public static void main(String[] args) {

        // kullanicidan 2 tamsayi alip
        // bu sayilari birbirine bolun ve sonucu yazdirin

        String str="Java Candir";
        //System.out.println(str.substring(20)); StringIndexOutOfBoundsException

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen iki tam sayi giriniz");

        int sayi1= 0;
        int sayi2= 1;

        try {
            sayi1 = scanner.nextInt();
            sayi2 = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("tam sayi girmelisiniz");

        }

        if (sayi2!=0){
            System.out.println("Sayilarin bolumu: "+ sayi1/sayi2);
        }else {
            System.out.println("ikinci sayi 0 olamaz");
        }

        System.out.println("kodda sorun olursa bu satir calismaz");
    }
}
