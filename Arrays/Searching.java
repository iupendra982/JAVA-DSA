package Arrays;
import java.util.*;
public class Searching {
    public static int Binary_Search(int numbers[],int key){
        int start=0;
        int end=numbers.length-1;
        while(start<=end){
            int mid=(start+end)/2;

            //comparison
            if(numbers[mid] == key){ // found condition
                return mid;
            }
            if(numbers[mid]<key){ //right condition
                start=mid+1;
            }
            else{  //ledt condition
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10,12,14};
        int key=4;

        System.out.println("Index for key is : "+Binary_Search(numbers, key));
        
    }
}
