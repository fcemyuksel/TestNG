package tests.day17_Maps;

import java.util.Map;
import java.util.TreeMap;

public class C06_NumaraIleSoyisimUpdate {
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

        //103 numarali ogrencinin soyismini "Han" yapalim

        String value103=ogrenciMap.get(103); //Ali-Cem-11-K-TM

        String[] valueArr=value103.split("-"); //[Ali, Cem, 11, K, TM]

        valueArr[1]="Han"; //[Ali, Han, 11, K, TM]

        //yapilan degisikligi map'e konulacak value biciminde yazalim

        String yeniValue=valueArr[0]+"-"
                +valueArr[1]+"-"
                +valueArr[2]+"-"
                +valueArr[3]+"-"
                +valueArr[4];        //Ali-Han-11-K-TM


        ogrenciMap.put(103,yeniValue);
        System.out.println(ogrenciMap);//103=Ali-Han-11-K-TM

    }

    public static Map<Integer,String > numaraIleSoyisimUpdate(Map<Integer,String>ogrenciMap, int ogrenciNo, String yeniSoyisim){

        //soyadi degistirilecek ogrencinin eski bilgisini ogrenci no ile cagirip kaydededlim

        String eskiValue=ogrenciMap.get(ogrenciNo);

        //eski value uzerinde degisiklik yapmak icin array'e cevirelim

        String[] valueArr=eskiValue.split("-");

        //valueArr uzerinde istenen update'i yapalim

        valueArr[1]=yeniSoyisim;

        // degisikligi Array'de yaptik. Mapin degismesi icin array'de yapilan degisikligi map'e eklemeliyiz
        //once arrayi yeniValue haline donusturelim

        String yeniValue=valueArr[0]+"-"+valueArr[1]+"-"+valueArr[2]+"-"+valueArr[3]+"-"+valueArr[4];

        // ogrenci no ve yeniValue'yu Map'e ekleyelim
        //map'de ogrenci no zaten oldugundan Java Eskiyi silip
        //ekledigimiz yeni degeri kabul edecektir

        ogrenciMap.put(ogrenciNo,yeniValue);
        return ogrenciMap;

    }

}
