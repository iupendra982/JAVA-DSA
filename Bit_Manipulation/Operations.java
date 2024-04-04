package Bit_Manipulation;

public class Operations {

//number is odd or even method by bit manipulation
    public static void oddOrEven(int n){
        int bitMask=1;
        if((n & bitMask)==0){
            //even
            System.out.println("Even");
        }else{
            System.out.println("Odd ");
        }
    }

//getting the i th bit method
    public static int getIthBit(int n,int i){
        int bitMask=1<<i;
        if((n & bitMask)==0){
            return 0;
        }else{
            return 1;
        }
    }

//setting the i th bit means setting it to 1
    public static int setIthBit(int n,int i){
        int bitMask= 1<<i;
        return (n|bitMask); 
    }

//clearing the it bit means setting it to 0
    public static int clearIthBit(int n,int i){
        int bitMask= ~(1<<i);
        return (n & bitMask);
    }

//updating the i th bit 
    public static int updateIthBit(int n,int i,int newBit){
        if(newBit==0){
            return clearIthBit(n, i);
        }else{
            return setIthBit(n, i);
        }

        //another method to do this is 
        // n=clearIthBit(n, i);  //ye i th bit me 0 set kar rha
        // int bitMask= newBit<<i;  //ye agar bit 0 set karni hai to no change
        //                          //1 karni hai to 1 kar dega or set bit ki tarah kaam karega
        // return (n|bitMask);

    }

//clearing all the i no. of bits 
    public static int clear_I_Bits(int n,int i){
        int bitMask=(~0)<<i;
        return (n & bitMask);
    }

//clearing all the values between i to j index
    public static int clearBitsInRange(int n,int i,int j){
        int a=((~0)<<(j+1));//a bit mask
        int b=(1<<i)-1;//b bit mask
        int bitMask= a|b;
        return (n & bitMask);
    }

//checking if a number is in the form of power of 2 or not
    public static boolean isPowerOfTwo(int n){
        return (n & (n-1)) == 0;//True
    }

//counting the no. of set bits in a number
    public static int countSetBits(int n){
        int count=0;
        while(n>0){
            if((n & 1) !=0){//checking LSB
                count++;
            }
            n=n>>1;
        }
        return count;
    }

//doing fast exponential multiplication concluding to less time complexity 
    public static int fastExponent(int a,int n){
        int ans=1;
        while(n>0){
            if((n & 1) != 0){//checking LSB
                ans=ans*a;
            }
            a=a*a;
            n=n>>1;
        }
        return ans;
    }

//modular exponential 
    public static int modularExponent(int a,int n,int p){//  a^n %p
        int ans=1;
        while(n>0){
            if((n & 1) != 0){//checking LSB
                ans=ans*a;
            }
            a=a*a;
            n=n>>1;
        }
        return ans%p;
    }
//swapping of two numbers without using third variable
    public static void swapTwoNumb(int x,int y){
        System.out.println("Before swap : x = "+x+" and y = "+y);
        //swap using XOR
        x=x^y;
        y=x^y;
        x=x^y;
        System.out.println("After swap : x = "+x+" and y = "+y);
    }

    public static void main(String[] args) {
        oddOrEven(3);
        oddOrEven(11);
        oddOrEven(14);
    
        System.out.println(getIthBit(10, 2));

        System.out.println(setIthBit(10, 2));

        System.out.println(clearIthBit(10, 1));

        System.out.println(updateIthBit(10, 1, 0));

        System.out.println(clear_I_Bits(15,2));

        System.out.println(clearBitsInRange(10, 2, 4));

        System.out.println(countSetBits(10));

        System.out.println(fastExponent(3, 5));//Taking only O(log n) T.C instead of O(n)

        System.out.println(modularExponent(3, 5, 2));

        swapTwoNumb(5, 3);

        //Adding 1 to an integer using Bit Manipulation
        int x=0;
        System.out.println(x+" + 1 is : " + -~x );
    }
}
