package tests.day15_exceptions;

import java.util.Scanner;

public class C07_ThrowKeyword {
    public static void main(String[] args) {

        /*
            Eger bir durum gerceklestiginde
            belirli satirlari atlamak
            ve kullaniciya exception vermek isterseniz

            throw new istenenExceptionTuru yazarak

            kontrollu exception firlatabilir
            ve istediginiz satirda bu exception'i yakalayip
            kodun normal calismaya devam etmesini saglayabilirsiniz
         */


        //kullanicidan yasini isteyin
        //O veya negatif deger girerse uyari verin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen Yasinizi Giriniz");

        int yas= scanner.nextInt();

        try {
            if (yas<=0){
                throw new IllegalArgumentException("Lutfen Gecerli Bir Yas Giriniz");

            }
            System.out.println("Atlanacak kod1");
            System.out.println("Atlanacak kod2");
            System.out.println("Atlanacak kod3");
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        System.out.println("kod normal calismaya devam eder");
    }
}
