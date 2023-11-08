package tests.day17_Maps;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class C05_NumaraliOgrenciListesi {
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

        //ogrenci mapindeki tum ogrencilerin
        //numara, isim ve soyisimlerini yazdirin

        //tum keyleri kaydedelim

        Set<Integer> ogrenciKeySeti=ogrenciMap.keySet();
        //[101, 102, 103, 104, 105, 106, 107, 108, 109]

        for (Integer eachKey: ogrenciKeySeti
             ) { //eachKey==101
            String eachValue=ogrenciMap.get(eachKey); //Ali-Can-11-H-MF

            String [] valueArr=eachValue.split("-");

            System.out.println(eachKey+" "+valueArr[0]+" "+valueArr[1]);
            //101 Ali Can
            //102 Veli Cem
            //103 Ali Cem
            //104 Ayse Can
            //105 Sevgi Cem
            //106 Sevgi Can
            //107 Veli Han
            //108 Kemal Cem
            //109 Ayse Han
        }
    }


    public static void njumaraliOgrenciListesiYazdirma(Map<Integer,String >ogrenciMap){
        //tum keyleri bir set olarak kaydedelim

        Set<Integer> ogrenciKeySeti=ogrenciMap.keySet();

        //kaydettigimiz keyleri tek tek ele almak icin bir for-each loop olusturalim

        for (Integer eachKey: ogrenciKeySeti
             ) {
            //for-each loopda ele alinan herbir key'in value'sini kaydedelim
            String eachValue=ogrenciMap.get(eachKey); //Ali-Can-11-H-MF

            //value String oldugundan bilgilere erismek icin arraye cevirelim

            String [] valueArr=eachValue.split("-");

            //bir sart olmadan tum ogrencilerin numara, isim ve soyisimlerini yazdiralim
            System.out.println(eachKey+" "+valueArr[0]+" "+valueArr[1]);

        }


    }
}
