/*Write a Java program to check if a number is a palindrome in Java ? (121 is a palindrome, 321 is not) A number is called a palindrome if the number is equal to the reverse of a number  e.g.,121 is a palindrome because the reverse of 121 is 121 itself.On the other hand, 321 is not a palindrome because the reverse of 321 is 123, which is not equal to 321 */

package Functions;
import java.util.Scanner;
public class Q3 {
    public static boolean isPalindrome(int n){
        int copy=n;
        int reverse=0;

        while(copy!=0){
            int rem=copy%10;
            reverse=reverse*10+rem;
            copy=copy/10;
        }

        if(n == reverse){
            return true;
        }
        return false;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int value=sc.nextInt();
        if (isPalindrome(value)) {
            System.out.println("Number "+value+" is Palindrome");
        }
        else{
            System.out.println("Number "+value+" is not Palindrome");
        }
    }
}
