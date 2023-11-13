package tests.day17_Maps;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class C07_SubedekiTumOgrencileriTasima {
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


        //11-M'deki tum ogrencileri 12-A'ya gecirin
        ogrenciMap=topluSinifDegistirme(ogrenciMap,"11","M","12","A");

        //10K'daki ogrencileri 11B'ye tasiyalim
        ogrenciMap=topluSinifDegistirme(ogrenciMap,"10","K","11","B");

        //ogrenci listesinin son halini yazdiralim
        System.out.println(ogrenciMap);

    }
    public static Map<Integer,String> topluSinifDegistirme(Map<Integer,String >ogrenciMap,
                   String eskiSinif,String eskiSube,String yeniSinif, String yeniSube){

        //butun ogrencileri gozden gecirecegimiz icin key'leri Set olarak kaydedelim

        Set<Integer> keySeti=ogrenciMap.keySet();

        //for-each loop ile herbir key'i ele alip
        // key'e ait value istenen sinif ve subede ise update edelim

        for (Integer eachKey:keySeti
             ) { //eachKey==>101,102,.....

            //ele aldigimiz key'e ait eski valueyi kaydedelim

            String eskiValue=ogrenciMap.get(eachKey);

            //value String oldugundan inceleme ve update icin Array'e cevirelim

            String [] valueArr= eskiValue.split("-");  // [Sevgi, Cem, 11, M, TM]

            //valueArr'yi inceleyip sinif ve sube degistirilmek istenen
            // eski sinif ve eski sube ise yeniSinif ve yeniSube olarak update edelim

            if (valueArr[2].equals(eskiSinif)&& valueArr[3].equalsIgnoreCase(eskiSube)){
                valueArr[2]=yeniSinif;
                valueArr[3]=yeniSube;
            }

            //update yapildi, simdi bu arraydeki bilgiyi yeniden map'e eklemeliyiz
            //once arrayi stringe cevirelim
            String yeniValue=valueArr[0]+"-"+valueArr[1]+"-"+valueArr[2]+"-"+valueArr[3]+"-"+valueArr[4];

            //key==> eachKey, value==> yeniValue olarak ogrenciMap'e ekleyelim

            ogrenciMap.put(eachKey,yeniValue);

        }
        return ogrenciMap;
    }
}
