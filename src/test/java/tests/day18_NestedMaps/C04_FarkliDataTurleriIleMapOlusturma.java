package tests.day18_NestedMaps;

import java.util.HashMap;
import java.util.Map;

public class C04_FarkliDataTurleriIleMapOlusturma {
    public static void main(String[] args) {

        /*
        {
        "userId":3,
        "id":22,
        "title":"dolor sint quo a velit explicabo quia nam",
        "body":"eos qui et ipsum ipsam suscipit aut\nsed omnis non odio\nexpedita earum mollitia molestiae aut atque rem suscipit\nnam impedit esse"
        }
         */

        Map<String,Object> map1=new HashMap<>();

        map1.put("userId",3);
        map1.put("id",20);
        map1.put("title","dolor sint quo a velit explicabo quia nam");
        map1.put("body","eos qui et ipsum ipsam suscipit aut");

        System.out.println(map1);
        //{
        // id=20,
        // title=dolor sint quo a velit explicabo quia nam,
        // body=eos qui et ipsum ipsam suscipit aut,
        // userId=3
        // }

        //id'yi yazdirin
        System.out.println(map1.get("id"));//20

        //title'i yazdirin
        System.out.println(map1.get("title"));
        //dolor sint quo a velit explicabo quia nam

        //id'nin 2 fazlasini yazdirin
        System.out.println((((Integer) map1.get("id")) + 2)); //22

        //bodyi buyuk harflerle yazdirin
        System.out.println(map1.get("body").toString().toUpperCase());
        //EOS QUİ ET İPSUM İPSAM SUSCİPİT AUT
        System.out.println(((String) map1.get("body")).toUpperCase());
        //EOS QUİ ET İPSUM İPSAM SUSCİPİT AUT

        //id'yi 25 yapalim
        map1.put("id",25);
        System.out.println(map1);
        //{id=25, title=dolor sint quo a velit explicabo quia nam, body=eos qui et ipsum ipsam suscipit aut, userId=3}
    }
}
