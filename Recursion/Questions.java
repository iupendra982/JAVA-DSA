public class Questions {
    //For a given integer array of size N.You have to find all the occurrences(indices) of a 
    //given element(Key) and print them.Use a recursive function to solve this problem

    public static void recOccurence(int arr[],int key,int i){
        if(i==arr.length){
            return;
        }
        if(arr[i]==key){
            System.out.print(i+" ");
        }
        recOccurence(arr, key, i+1);
    }
    //You are given a number (eg -  2019), convert it into a String of english like“two zero 
    // one nine”.  Use a recursive function to solve this problem

    static String digits[]={"zero","one","two","three","four","five","ssix","seven",
        "eight","nine"};
    public static void digitToStringConversion(int num){
        if(num==0){
            return;
        }
        int lastdigit=num%10;
        digitToStringConversion(num/10);
        System.out.print(digits[lastdigit]+" ");
    }

    //Write a program to find Length of a String using Recursion
    public static void lengthOfStringRecursively(String str){   

    }

    //Tower of Hanoi Prroblem
    public static void towerOfHanoi(int n,String src,String helper,String dest){
        if(n==1){
            System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
            return;
        }
        //transfer top n-1 from src to helper using dest as 'helper'
        towerOfHanoi(n-1, src, dest, helper);
        //transfer nth from source to dest
        System.out.println("Transfer disk "+n+" from "+src+" to "+helper);
        //transfer n-1 from helper to dest using src as 'helper'
        towerOfHanoi(n-1, helper, src, dest);
    }
    public static void main(String[] args) {
        //recursive occurence
        int arr[]={3,2,4,5,6,2,7,2,2};
        int key=2;
        recOccurence(arr, key,0);
        System.out.println();

        //print integers in string
        digitToStringConversion(1234);
        System.out.println();

        //tower of hanoi
        int n=4;
        towerOfHanoi(n, "A", "B", "C");
    }
}
