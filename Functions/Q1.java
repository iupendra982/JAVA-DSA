//Write a Java method to compute the averageof three numbers



package Functions;
import java.util.Scanner;
public class Q1 {
    public static int average(int a,int b,int c){
        int avg=(a+b+c)/3;
        return avg;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value 1");
        int x=sc.nextInt();
        System.out.println("Enter value 2");
        int y=sc.nextInt();
        System.out.println("Enter value 3");
        int z=sc.nextInt();
        System.out.println("Average of three numbers is : "+average(x,y,z));
    }
}
