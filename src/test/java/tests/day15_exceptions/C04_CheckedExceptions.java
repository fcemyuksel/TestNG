package tests.day15_exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C04_CheckedExceptions {
    public static void main(String[] args) throws FileNotFoundException {

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

        String dosyaYolu="src/test/java/tests/day15_exceptions/text.txt";

        FileInputStream fileInputStream=new FileInputStream(dosyaYolu);
    }
}
