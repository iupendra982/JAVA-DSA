package Sorting;

import java.util.Arrays;
import java.util.Collections;;

public class Inbuilt_methods {
    public static void printArray(Integer arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
     public static void main(String[] args) {
        //int arr[]={5,4,1,3,2}; 
        //here we can not use this for collections method as it will
        //require object type integer array
        Integer arr[]={5,4,1,3,2};//this array is object of integer class

        printArray(arr);

        //we can directly use inbuilt methods for array sorting
        //for this we have to import java.util.Arrays
        //Arrays.sort(arr)
        //Arrays.Sort(arr,start_index,end_index)
        //here ending index is non inclusive
        
        Arrays.sort(arr,0,2);
        printArray(arr);
        Arrays.sort(arr);
        printArray(arr);

        //for reverse order we will use 
        //Arrays.sort(arr,Collections.reverseOrder());
        //Arrays.sort(arr,si,ei,Collections.reverseOrder());
        //reverseOrder ffunction uses a comparator
        
        Arrays.sort(arr,Collections.reverseOrder());
        printArray(arr);

    }
}
