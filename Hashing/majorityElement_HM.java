//Given an integer array of size n, find all elements that appear more than(n/3) times.
//nums={1,3,2,5,1,3,1,5,1}  O/P-- 1

import java.util.*;
public class majorityElement_HM {
    public static void main(String[] args) {
        int nums[]={1,3,2,5,1,3,1,5,1};
        int nums1[]={1,2};
        majorityElement(nums);
        System.out.println();
        System.out.println("-------------------------------------------------------------");
        majorityElement(nums1);
    }
    public static void majorityElement(int arr[]){
        int n=arr.length;
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<n;i++){
//-------------------------------------------------------------we can write this whole part in
            // if(hm.containsKey(arr[i])){
            //     hm.put(arr[i],hm.get(arr[i])+1);
            // }else{
            //     hm.put(arr[i],1);
            // }
//---------------------------------------------------------------------------------in this way
            hm.put(arr[i],hm.getOrDefault(arr[i], 0)+1);
        }
        System.out.println(hm);

        Set<Integer>keys=hm.keySet();
        System.out.println(keys);
        
        for(int i:keys){
            if(hm.get(i)>(n/3)){
                System.out.print(i+" ");
            }
        }
    }
}