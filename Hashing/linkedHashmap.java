//all operations of hashmap work on linkedhashmap 
//Time Complexity is O(1)
import java.util.*;
public class linkedHashmap {
    public static void main(String[] args) {
        //HashMap
        HashMap<String,Integer>hm=new HashMap<>();
        hm.put("India",100);
        hm.put("China",150);
        hm.put("USA",50);
        hm.put("Africa",90);
        hm.put("Asia",55);

        //order will not be maintained
        System.out.println(hm);



        LinkedHashMap<String,Integer>lhm=new LinkedHashMap<>();
        lhm.put("India",100);
        lhm.put("China",150);
        lhm.put("USA",50);
        lhm.put("Africa",90);
        lhm.put("Asia",55);

        //order is maintained
        System.out.println(lhm);
    }
}
