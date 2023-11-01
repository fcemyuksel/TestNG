package tests.day15_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C05_ParentChildException {

    public static void main(String[] args) {
        /*
            Eger ongorulen exception'lar arasinda
            parent-child iliskisi varsa

                - tek bir catch cumlesi yazip, parent exception'i kullanabiliriz
                - veya bir try birden fazla catch cumlesi yazabiliriz
                  exception'lar parent-child olduklarindan
                  uste child exception yazilmalidir.
                  parent once yazilirsa child'in yakalayacagi tum exception'lari da
                  parent yakalayacagindan child'i yazmak ANLAMSIZ olur
                  Java'da child alta yazilirsa CTE verir
         */


        String dosyaYolu = "src/test/java/tests/day15_exceptions/text1.txt";

        try {
            FileInputStream fileInputStream = new FileInputStream(dosyaYolu);

            int k = 0;
            while ((k = fileInputStream.read()) != (-1)) {
                System.out.print((char) k);
            }
        } catch (FileNotFoundException e) {
            System.out.println("dosya okunamadi");
        } catch (IOException e) {
            System.out.println("dosya bulunmadi veya okunamadi");
            System.out.println(e.getMessage());
        }
    }
}
