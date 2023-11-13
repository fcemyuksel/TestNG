package tests.day17_Maps;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class C10_DetayliTopluListeYazdirma {
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

        //tum ogrencilerin numara, sinif, sube, bolum, isim, soyisim'lerini
        // bir methodla yazdiralim

        detayliListeYazdir(ogrenciMap);

    }

    public static void detayliListeYazdir(Map<Integer, String> ogrenciMap) {

    //hem ogrenciNo hem de diger bilgiler istendigi icin EntrySet ile yapalim

        Set<Map.Entry<Integer,String >> ogrenciEntrySeti=ogrenciMap.entrySet();

        //tum entryleri for-each loop ile ele alalim

        for (Map.Entry<Integer,String > eachEntry:ogrenciEntrySeti
             ) { //eachEntry ==> 109="Ayse-Han-10-K-MF"

            //value'daki bilgilere ulasabilmek icin Array'e cevirekim

            String [] valueArr=eachEntry.getValue().split("-"); //[Ayse, Han, 10, K, MF]
            System.out.println(eachEntry.getKey()+" "+valueArr[2]+"/"
                    +valueArr[3]+"-"+valueArr[4]+" "+valueArr[0]+" "+valueArr[1]);
            //101 11/H-MF Ali Can
            //102 10/K-TM Veli Cem
            //103 11/K-TM Ali Cem
            //104 10/H-MF Ayse Can
            //105 11/M-TM Sevgi Cem
            //106 10/K-MF Sevgi Can
            //107 10/H-MF Veli Han
            //108 11/M-TM Kemal Cem
            //109 10/K-MF Ayse Han

        }

    }
}
