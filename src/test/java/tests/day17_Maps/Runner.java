package tests.day17_Maps;

import java.util.Map;
import java.util.TreeMap;

public class Runner {
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

        //10/H sinifindaki ogrenci listesini yazin

        C02_SinifListesiOlusturma.sinifSubeListesiYazdirma(ogrenciMap,"10","H");//Ayse Can   Veli Han
        C02_SinifListesiOlusturma.sinifSubeListesiYazdirma(ogrenciMap,"11","M");//Sevgi Cem  Kemal Cem
    }
}
