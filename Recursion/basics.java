
public class basics {
    //print decreasing numbers
    public static void printDec(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }

    //print increasing numbers
    public static void printInc(int n){
        if(n==10){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printInc(n+1);

        // //another way
        // if(n==1){
        //     System.out.println(n+" ");
        //     return;
        // }
        // printDec(n-1);
        // System.out.print(n+" ");

        // //we had to call it with
        // //printInc(10);
    }

    //print factorial of a num
    public static int fact(int n){//T>C = O(n)
        if(n==0){
            return 1;
        }
        int p=n*fact(n-1);
        return p;
    }

    //print sum of n numbers
    public static int calcSum(int n){
        if(n==1){
            return 1;
        }
        int sum=n+calcSum(n-1);
        return sum;

    }

    //print fibonnaci sum of n numbers
    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        int fnm1=fib(n-1);
        int fnm2=fib(n-2);
        int fn=fnm1+fnm2;
        return fn;
    }

    //check if array is sorted or not
    public static boolean isSorted(int arr[],int i){//i is the starting point from where we
        //are starting checking
        if(i==arr.length-1){//base case for stoping recursive loop 
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }

    //find the first occurence of an element in an array
    public static int firrstOccurence(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firrstOccurence(arr, key, i+1);
    }

     //find the last occurence of an element in an array
     public static int lastOccurence(int arr[],int key,int i){
        if(i == arr.length){
            return -1;
        }
        int isFound=lastOccurence(arr, key, i+1);
        if(isFound == -1 && arr[i]==key){
            return i;
        }
        return isFound;
     }

     //Print x^n
     public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        // int xnm1=power(x,n-1);
        // int xn=x*xnm1;
        // return xn;
        return x*power(x,n-1);
     }

     //Optimized Power method with TC==o(n)
     public static int optimizedPower(int a,int n){
        if(n==0){
            return 1;
        }
        int halfPower=optimizedPower(a, n/2);
        //if n is even
        int halfPowerSq=halfPower*halfPower;
        //if n is odd
        if(n%2!=0){
            halfPowerSq=a*halfPowerSq;
        }
        return halfPowerSq;
     }
    public static void main(String[] args) {
        printDec(10);
        printInc(1);
        System.out.println(fact(5));
        System.out.println(calcSum(5));
        System.out.println(fib(25));

        int arr[]={1,2,3,4,5};
        System.out.println(isSorted(arr, 0));

        int arr1[]={8,3,6,9,5,10,2,5,3};
        System.out.println(firrstOccurence(arr1, 5, 0));

        System.out.println(lastOccurence(arr1, 5, 0));

        System.out.println(power(2, 10));

        System.out.println(optimizedPower(2, 10));
    }
}