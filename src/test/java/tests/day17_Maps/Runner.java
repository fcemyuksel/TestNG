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

        //TM bolumundeki ogrenci listesi

        C03_BransListesiOlusrurma.bolumOgrenciListesiYazdir(ogrenciMap,"TM");
        //10 K Veli Cem
        //11 K Ali Cem
        //11 M Sevgi Cem
        //11 M Kemal Cem

        System.out.println("==================================================");

        //soyismi Can olan ogrenci listesi

        C04_SoyisimdenOgrenciBulma.soyisimOgrenciListesi(ogrenciMap,"Can");
        //11 H MF Ali Can
        //10 H MF Ayse Can
        //10 K MF Sevgi Can

        System.out.println("======================================================");

        //soyadi Cem olanlar
        C04_SoyisimdenOgrenciBulma.soyisimOgrenciListesi(ogrenciMap,"Cem");
        //10 K TM Veli Cem
        //11 K TM Ali Cem
        //11 M TM Sevgi Cem
        //11 M TM Kemal Cem

        System.out.println("===============================");
        //tum ogrencilerin numara isim ve soyisimlerini yazdirin
        System.out.println("--------------TUM OGRENCI LISTESI--------------------");

        C05_NumaraliOgrenciListesi.njumaraliOgrenciListesiYazdirma(ogrenciMap);

        //101 Ali Can
        //102 Veli Cem
        //103 Ali Cem
        //104 Ayse Can
        //105 Sevgi Cem
        //106 Sevgi Can
        //107 Veli Han
        //108 Kemal Cem
        //109 Ayse Han


        //104 numarali ogrencinin soyismini Yilmaz, 105 numarali ogrencinin soyismini Celik yapip
        //tum ogrenci listesini yazdiralim

        ogrenciMap=C06_NumaraIleSoyisimUpdate.numaraIleSoyisimUpdate(ogrenciMap,104,"Yilmaz");
        ogrenciMap=C06_NumaraIleSoyisimUpdate.numaraIleSoyisimUpdate(ogrenciMap,105,"Celik");

        System.out.println("--------------TUM OGRENCI LISTESI SOYISIM DEGISIMI SONRA--------------------");

        C05_NumaraliOgrenciListesi.njumaraliOgrenciListesiYazdirma(ogrenciMap);

        //--------------TUM OGRENCI LISTESI SOYISIM DEGISIMI SONRA--------------------
        //101 Ali Can
        //102 Veli Cem
        //103 Ali Cem
        //104 Ayse Yilmaz
        //105 Sevgi Celik
        //106 Sevgi Can
        //107 Veli Han
        //108 Kemal Cem
        //109 Ayse Han



    }
}
