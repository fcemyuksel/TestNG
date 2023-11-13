package tests.day17_Maps;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class C08_SinifListesiYazdirma {
    public static void main(String[] args) {
        Map<Integer, String> ogrenciMap = new TreeMap<>();

        ogrenciMap.put(101, "Ali-Can-11-H-MF");
        ogrenciMap.put(102, "Veli-Cem-10-K-TM");
        ogrenciMap.put(103, "Ali-Cem-11-K-TM");
        ogrenciMap.put(104, "Ayse-Can-10-H-MF");
        ogrenciMap.put(105, "Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106, "Sevgi-Can-10-K-MF");
        ogrenciMap.put(107, "Veli-Han-10-H-MF");
        ogrenciMap.put(108, "Kemal-Cem-11-M-TM");
        ogrenciMap.put(109, "Ayse-Han-10-K-MF");

        // 10.siniftaki ogrencilerin numara,isim,soyisim ve subelerini yazdirin

        Set<Map.Entry<Integer, String>> ogrenciEntrySeti = ogrenciMap.entrySet();

        for (Map.Entry eachEntry : ogrenciEntrySeti
        ) { //eachEntry==> 101="Veli-Cem-10-K-TM"

            String value = (String) eachEntry.getValue();

            String[] valueArr = value.split("-"); //[Veli, Cem, 10, K, TM]

            if (valueArr[2].equals("10")) {
                System.out.println(eachEntry.getKey() + " " + valueArr[0] + " " + valueArr[1] + " " + valueArr[3]);
            }
        }

    }

    public static void sinifListesiYazdirma(Map<Integer, String> ogrenciMap, String sinif) {

        //once tum entry'leri bir set olarak kaydedelim
        Set<Map.Entry<Integer, String>> ogrenciEntrySeti = ogrenciMap.entrySet();

        //tum entryleri bir for-each loop ile ele alalim
        for (Map.Entry eachEntry : ogrenciEntrySeti
        ) { //eachEntry==> 101="Veli-Cem-10-K-TM"

            //istenen sinif bilgisini kontrol etmek icin value'yu arraye cevirelim
            String value = (String) eachEntry.getValue();

            String[] valueArr = value.split("-"); //[Veli, Cem, 10, K, TM]

            //arraydeki sinif bilgisini kontrol edip yazdirilacak sinif ise
            //istenen bilgileri yazdiririz
            if (valueArr[2].equals(sinif)) {
                System.out.println(eachEntry.getKey() + " " + valueArr[0] + " " + valueArr[1] + " " + valueArr[3]);
            }
        }

    }
}