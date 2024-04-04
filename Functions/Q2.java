/*Write a method named isEven that accepts an int argument.The method should return true if the argument is even,or false otherwise.Also write a program to test your method*/

package Functions;
import java.util.Scanner;
public class Q2 {
    public static boolean isEven(int number){
        if(number%2==0){
            return true;
        }
        else 
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an integer");
        int num=sc.nextInt();

        if(isEven(num)){
            System.out.println("Number is even");
        }
        else
        System.out.println("Number is odd");
    }
}
