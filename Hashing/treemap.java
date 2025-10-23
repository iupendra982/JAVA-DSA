//
import java.util.*;
public class treemap {
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

        //TreeMap
        //HashMap
        TreeMap<String,Integer>tm=new TreeMap<>();
        tm.put("India",100);
        tm.put("China",150);
        tm.put("USA",50);
        tm.put("Africa",90);
        tm.put("Asia",55);

        //keys are in sorted order automatically So, TC=O(logn)
        System.out.println(tm);        
    }
}
