package Sorting;
import java.util.Arrays;

public class Basic_sorting {

    public static void bubbleSort(int arr[]){
    //here bubble sort is worst case time complexity to make it to best we will use a counter
    //swap after the first loop and if swap =0 after first iteration then our array was already 
    //sorted then we sholud exit
        for(int turn=0;turn<arr.length-1;turn++){
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minPos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minPos]>arr[j]){
                    minPos=j;
                }
            }
            //swapping after the for loop to avoid swapping avery time
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp; 
        }
    }
    public static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            //finding out correct position to insert
            while(prev>=0 && arr[prev]>curr){//for descending order arr[prev]<curr
                arr[prev+1]=arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1]=curr;
        }
    }

    public static void countingSort(int[]arr){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest,arr[i]);
        }

        int count[]=new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        //sorting
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        int arr1[]={1,4,1,3,2,4,3,7};
        // bubbleSort(arr);
        // printArray(arr);  
        // selectionSort(arr);
        // printArray(arr);
        // insertionSort(arr);
        printArray(arr);
        countingSort(arr1);
        printArray(arr1);
    }
}
