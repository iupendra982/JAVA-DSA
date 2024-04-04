
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
    public static void main(String[] args) {
        printDec(10);
        printInc(1);
        System.out.println(fact(5));
        System.out.println(calcSum(5));
        System.out.println(fib(25));
    }
}