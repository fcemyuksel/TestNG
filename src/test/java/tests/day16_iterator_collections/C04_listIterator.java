package tests.day16_iterator_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C04_listIterator {

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

        //index kullanmadan tum elementlerin degerlerini 2 artirin

        ListIterator lit= sayilar.listIterator();

        while (lit.hasNext()){
           Integer elementEskiDegeri = (Integer) lit.next();

           lit.set(elementEskiDegeri+2);

        }
        System.out.println(sayilar); //[12, 17, 8, 25, 26, 21, 24]

        //Listenin elementlerini, index kullanmadan sondan basa dogru yazdirin

        //soruyu cozmeden once iterator nerede kontrol etmeliyiz
        //bu satir itibari ile itarator loopdan dolayi sonda

        while (lit.hasPrevious()){

            System.out.print(lit.previous()+ " "); //24 21 26 25 8 17 12
        }

        System.out.println("=================");

        //elementleri gozden gecirin
        //tek sayi olanlari silin
        //cift sayi olanlarin degerini 5 artirin

        while (lit.hasNext()){

            Integer sayi= (Integer) lit.next();

            if (sayi%2==0){
                lit.set(sayi+5);

            }else {
                lit.remove();
            }
        }

        System.out.println(sayilar); //[17, 13, 31, 29]
    }
}
