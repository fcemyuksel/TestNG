package tests.day17_Maps;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class C09_TopluBolumDegistirme {
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

        //MF bolumundeki tum ogrencilerin bolum bilgisini SAY yapin

        ogrenciMap=topluBolumDegistirme(ogrenciMap,"MF","SAY");
        ogrenciMap=topluBolumDegistirme(ogrenciMap,"TM","EA");
        System.out.println(ogrenciMap);
    }

    public static Map<Integer, String> topluBolumDegistirme(Map<Integer, String> ogrenciMap, String esliBolum, String yeniBolum) {

        //tum ogrencileri elden gecirmek icin
        //entry seti olusturduk
        //entry hem KEy hem de value icerdiginden ayri ayri key ve value dusunmemize gerek kalmaz
        Set<Map.Entry<Integer,String >> ogrenciEntrySeti=ogrenciMap.entrySet();

        //tum entryleri for-each lopp ile ele alalim

        for (Map.Entry<Integer,String > eachEntry:ogrenciEntrySeti
             ) { //eachEntry ==> 109="Ayse-Han-10-K-MF"

            //keylerde update yok, value'lari update etmek icin bir arraye kaydedelim

            String [] valueArr=eachEntry.getValue().split("-"); //[Ayse, Han, 10, K, MF]

            //arraydeki bolum bilgisini kontrol edip
            //degismesi istenen eski bolum bilgisine sahip ise
            //yeni deger atayalim

            if (valueArr[4].equalsIgnoreCase(esliBolum)){
                valueArr[4]=yeniBolum;

            } //[Ayse, Han, 10, K, SAY]

            //ARRAYDE YAPİLAN DEGİSİKLİGİ MAP'E KAYDEDEDLİM
            //entry.setValue("istenenYeniValue") yazildiginde map'i update eder
            eachEntry.setValue(valueArr[0]+"-"+valueArr[1]+"-"+valueArr[2]+"-"+valueArr[3]+"-"+valueArr[4]);

        }
        return ogrenciMap;

    }
}
