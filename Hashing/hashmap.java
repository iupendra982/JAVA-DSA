import java.util.HashMap;
import java.util.Set;
public class hashmap{
    public static void main(String[] args) {
        //creation
        HashMap<String,Integer>hm=new HashMap<>();
        //inserting data
        hm.put("India",100);
        hm.put("China",150);
        hm.put("USA",50);
        hm.put("Africa",90);
        hm.put("Asia",55);
        //printing
        System.out.println(hm);
        //get method -- it gives value of the key
        int population=hm.get("India");
        System.out.println(population);
        //if there is no key value pair still we ask for the value so it will return null value
        System.out.println(hm.get("Indonesia"));
        //containsKey--checks that key exists or not and gives answer as boolean
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Indonesia"));
        //remove-if theres valid key then it will remove it and will return its value
        //if no key then it will return null value and nothing changes in map
        System.out.println(hm.remove("China"));
        System.out.println(hm);
        //knowing the size of hashmap
        int x=hm.size();
        System.out.println(x);
        //checking hasmap is empty or not return boolean value
        System.out.println(hm.isEmpty());
        //clear function-empties the whole hashmap
        hm.clear();
        System.out.println(hm.isEmpty());
        System.out.println("-------------------------------------------------------------");


        //Iteration in hashmap
        hm.put("India",100);
        hm.put("China",150);
        hm.put("USA",50);
        hm.put("Africa",90);
        hm.put("Asia",55);        

        //iteration setup--it will be also in unordered way no sequence
        //making new set which consists of keys of the hm hashmap
        Set<String> keys=hm.keySet();
        System.out.println(keys);

        for(String k:keys){
            System.out.println("Key = "+k+", Value = "+hm.get(k));
        }
    }
}