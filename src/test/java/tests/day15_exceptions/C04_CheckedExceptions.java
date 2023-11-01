package tests.day15_exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C04_CheckedExceptions {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        /*
        Checked exceptionlarda iki alternatif var
        1- try catch ile exceptionu konyrol altına alabiliriz
            boylece exception olustugunda bizim istedigimiz islemi(catch blogu)
            yapar ve kod calismaya devam eder

        2- Eger exception olustugunda kodun calismaya devam etmesini istemiyorsaniz
           Sadece riskin farkinda oldugunuzu Javaya deklare etmek ve
           sonradan kodu inceleyenlere bu kodun expection barindirdigini
           bildirmek icin method signaturea "throws beklenenExpection" ekleriz

           Boylece Java kodun altindaki kirmizi cizgiyi kaldirir
           kodun calismasina izin verir
           AMA kod dosyaya erisemezse exception firlatir ve calismayi durdurur
         */

        /*
        IOExpection Javada bir dosyaya erisip
        o dosya ile ilgili islem yaparken karsilasabilecegimiz
        tum expectionlari kapsar

         FileNotFoundException da  IOExpection'in child classidir

         Method deklerasyonunda birbiri ile parent-child iliskisi olan
         exceptionlari yazmamiz gerektiginde
         sadece parent exceptionu yazmamiz yeterli olacaktir

         CUNKU parent exception daha kapsamlidir ve child classin yakalayacagi
         exceptionlari da yakalar
         */

        String dosyaYolu="src/test/java/tests/day15_exceptions/text.txt";

        FileInputStream fileInputStream=new FileInputStream(dosyaYolu);

        int k=0;
        while((k= fileInputStream.read() ) != (-1)) {
            System.out.print((char) k);
        }
    }
}
