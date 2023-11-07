package tests.day16_iterator_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C08_LinkedList_Deque {

    public static void main(String[] args) {

         /*
            Deque iki tarafli queue demektir,
            bu ozelliginden dolayi pek cok method icin first ve last secenekleri verir

            birbirine benzer method'lar arasinda
            exception firlatma veya null dondurme
            kapasite sinirlamasi altinda calisma veya kapasiteye bakmaksizin calisma
            elemani silip dondurme veya silmeden dondurme gibi
            nuanslar vardir.
         */

        Deque<Integer> sayilar=new LinkedList<>();

        sayilar.add(34);
        sayilar.add(12);
        sayilar.add(25);

        System.out.println(sayilar);//[34, 12, 25]

        sayilar.addLast(44);
        sayilar.addFirst(5);
        System.out.println(sayilar);//[5, 34, 12, 25, 44]

        sayilar.offerFirst(22);
        sayilar.offerLast(23);
        System.out.println(sayilar);//[22, 5, 34, 12, 25, 44, 23]
        //kapasite sinirlamasi varsa ona gore davranir

        sayilar.push(65);
        System.out.println(sayilar);//[65, 22, 5, 34, 12, 25, 44, 23]
        //addFirst ile ayni isi goruyor

        System.out.println(sayilar.pop());//ilk elementi siler ve bize dondurur  //65
        System.out.println(sayilar);//[22, 5, 34, 12, 25, 44, 23]

        System.out.println(sayilar.peek());//22 silmeden ilk elementi dondurur, liste bossa null dondurur

        System.out.println(sayilar.removeLast());// 23
        System.out.println(sayilar);//[22, 5, 34, 12, 25, 44]

        System.out.println(sayilar.removeFirst());// 22
        System.out.println(sayilar);// [5, 34, 12, 25, 44]

        Object silinecekElement=5;
        //System.out.println(sayilar.removeFirst());// 5
        //System.out.println(sayilar.remove(silinecekElement));//true
        //System.out.println(sayilar.removeFirstOccurrence(silinecekElement));//true
        System.out.println(sayilar.removeLastOccurrence(silinecekElement));//true
        System.out.println(sayilar);// [34, 12, 25, 44]


    }
}
