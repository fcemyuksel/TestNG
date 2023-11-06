package tests.day16_iterator_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C03_iterator {

    public static void main(String[] args) {

        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(10);
        sayilar.add(15);
        sayilar.add(6);
        sayilar.add(23);
        sayilar.add(24);
        sayilar.add(19);
        sayilar.add(22);

        System.out.println(sayilar);//[10, 15, 6, 23, 24, 19, 22]

        Iterator iterator=sayilar.iterator();

        while (iterator.hasNext()){

            //iterator.next her kullanildiginda itaretor bir saga gecer
            //loop icerisinde eleman atlamamak icin
            //iterator.next() sadece bir kez kullanilmalidir

            Integer sayi= (Integer) iterator.next();

            if (sayi%2==0){
                iterator.remove();
            }
        }
        System.out.println(sayilar);// [15, 23, 19]

        //listeyi yeniden gozden gecirin ve 15'den buyukleri silin

        //iterator ile calisirken iteratoru en son nerede biraktigimiza dikkat etmeliyiz
        //ornegin burada yukaridaki loopta iterator sona gitti
        //eger yeniden iterator kullanip elemanlari gözden ecirmek istersek
        // yeni bir iterator olusturmamiz gerekiyor

        Iterator iterator1= sayilar.iterator();

        while (iterator1.hasNext()){
            //bir yana gec ve uzerinden gectigin elementi bana getir

            Integer sayi= (Integer) iterator1.next();
            if (sayi>15){
                iterator1.remove();
            }
        }
        System.out.println(sayilar); //[15]
    }
}
