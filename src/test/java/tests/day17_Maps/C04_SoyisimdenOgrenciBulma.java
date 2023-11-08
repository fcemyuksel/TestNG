package tests.day17_Maps;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class C04_SoyisimdenOgrenciBulma {
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

        //ogrenci mapinde istenen soyisme sahip ogrencilerin
        //sinif sube bolum ve isimlerini yazsirin

        soyisimOgrenciListesi(ogrenciMap,"Can");

    }

    public static void soyisimOgrenciListesi(Map<Integer,String>ogrenciMap,String soyisim){

        //mapdeki tum valuelari Collection olarak kaydedelim
        Collection<String > valueColletion=ogrenciMap.values();

        //tum valueleri gozden gecirmek icin bir for-each lop olusturalim

        for (String eachValue:valueColletion
             ) { //each value==> Ayse-Han-10-K-MF

            //Stringdeki bilgilere ulasmak icin split methodunu kullanalim

            String [] valueArr=eachValue.split("-");
            if (valueArr[1].equalsIgnoreCase(soyisim)){
                System.out.println(valueArr[2]+" "+valueArr[3]+" "+valueArr[4]+" "+valueArr[0]+" "+ valueArr[1]);
            }
        }
    }
}
