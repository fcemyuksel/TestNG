package tests.day16_iterator_collections;

import java.util.ArrayList;
import java.util.List;

public class C01_iteratorKullanimSebebi {
    public static void main(String[] args) {
         /*
            Java'da birden fazla eleman barindiran yapilarda
            index kullanmadan tum elemanlari gozden gecirip
            istenenleri update etme, istenenleri silme gibi islemler
            YAPILAMAZ
         */


        // verilen bir listede, index kullanmadan
        // tum sayilari 2 artirin

        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(10);
        sayilar.add(16);
        sayilar.add(6);
        sayilar.add(34);
        sayilar.add(24);
        sayilar.add(19);
        sayilar.add(22);

        System.out.println(sayilar);// [10, 16, 6, 34, 24, 19, 22]

        for (Integer each:sayilar
             ) {
            System.out.print(each+2 + " "); //12 18 8 36 26 21 24
        }
        System.out.println("---------------");
        System.out.println(sayilar); //[10, 16, 6, 34, 24, 19, 22]

        for (Integer each:sayilar
             ) {
            each=each+2;
        }
        // System.out.println(each); each  loop icerisinde olusturulmus bir variabledir
                                    // scoop'u loop oldugundan, loop'un disinda kullanilamaz
                                    // each'e yapilan atamalar loop icinde kalir

        System.out.println(sayilar); //[10, 16, 6, 34, 24, 19, 22]

        //index kullanmadan listeden cift sayilari silin

        //index kullanmadan bunu cozmemiz mumukun degildir
        //ayrica index kullansak bile listenin boyutunu degistiren islemler
        //ayni list uzerinden yapilirsa hatalar cikabilir

        for (int i = 0; i < sayilar.size(); i++) {
            if (sayilar.get(i)%2==0){
                sayilar.remove(i);
                i--; //silinen elemandan dolayi liste degistiginden elemanlarda atlanan eleman olmamasi
                    //icin indexi bir geriye aldik
            }
        }

        System.out.println(sayilar);//[19]
    }


    }

