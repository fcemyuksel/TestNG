package tests.day16_iterator_collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C05_LinkedList {
    public static void main(String[] args) {

         /*
            LinkedList 3 interface'i implement etmistir
            Bu sebeple obje olustururken
            data turu olarak kendi class'ini secebildigi gibi

            implement ettigi 3 interface'i de secebilir
            data turu ne secilirse
            objenin sahip olacagi method'lar da ona gore degisecektir.
         */

        LinkedList<Integer> ll1 =new LinkedList<>();

        List<Integer> ll2       =new LinkedList<>();

        Queue<Integer> ll3      =new LinkedList<>();

        Deque<Integer> ll4      =new LinkedList<>();
    }
}
