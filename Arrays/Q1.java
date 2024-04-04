package Arrays;
import java.util.Scanner;

// Given an integer array nums, return true if any value appears at least twice in the array,
//  and return false if every element is distinct

public class Q1 {
    static boolean Same_elemnts(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int length=sc.nextInt();
        int arr[]=new int[length];
        for(int i=0;i<length;i++){
            arr[i]=sc.nextInt();
        }
        Same_elemnts(arr);
        System.out.println(Same_elemnts(arr));
        
    }
    
}
