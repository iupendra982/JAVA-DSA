//Write a Java method to compute the sum of the digits in an integer.(Hint: Approach this
// question in the following way:a.Take a variable sum = 0b.Find the last digit of the 
//numberc.Add it to the sumd.Repeat a & b until the number becomes 0 )

package Functions;
import java.util.Scanner;
public class Q5 {
    public static int sumDigits(int num){
        int sum=0;
        int copy=num;
       while(copy>0){
        int rem=copy%10;
        sum+=rem;
        copy/=10;
       }
       return sum;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter an Integer");
        int value=sc.nextInt();
        System.out.println("Sum of digits of Integer is : "+sumDigits(value));
    }
    
}

