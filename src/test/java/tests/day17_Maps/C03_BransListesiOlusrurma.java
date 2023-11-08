package tests.day17_Maps;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class C03_BransListesiOlusrurma {

    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap = new TreeMap<>();

        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");
        ogrenciMap.put(107,"Veli-Han-10-H-MF");
        ogrenciMap.put(108,"Kemal-Cem-11-M-TM");
        ogrenciMap.put(109,"Ayse-Han-10-K-MF");

        //MF bolumundaki ogrencilerin Sinif, sube ve soyisimlerini yazdirin

        Collection<String >valueCollection=ogrenciMap.values();

        for (String eachValue: valueCollection
             ) {
            String [] valueArr=eachValue.split("-");//Ayse, Han, 10, K, MF
            if (valueArr[4].equalsIgnoreCase("MF")){
                System.out.println(valueArr[2]+" "+valueArr[3]+" "+valueArr[0]+" "+valueArr[1]);
            }
        }


    }

    public static void bolumOgrenciListesiYazdir(Map<Integer,String> ogrenciMap, String bolum){

        //mapdeki tum valueleri bir collection olarak kaydededelim
        Collection<String >valueCollection=ogrenciMap.values();

        //Collectiondaki tum value'leri for-each loop ile tek tek ele alalim

        for (String eachValue: valueCollection
             ) {
            //herbir valueda birden fazla bilgi oldugu ve bilgilere
            // ulasabilmek icin split() methodu kullanalim

            String [] valueArr=eachValue.split("-");//Ayse, Han, 10, K, MF

           //arrayden istenen bolum bilgisini kontrol edip
            // istenen bolumdeki ogrencilerin sinif, sube, isim ve soyisimlerini yazdiralim
            if (valueArr[4].equalsIgnoreCase(bolum)){
                System.out.println(valueArr[2]+" "+valueArr[3]+" "+valueArr[0]+" "+valueArr[1]);
            }


        }
    }
}
