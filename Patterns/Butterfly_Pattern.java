import java.util.*;
public class Butterfly_Pattern{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter n");
        
        int number_of_line=1;
        int st=1;
        int sp=2*n-2;
        
        while(number_of_line<=2*n){
            //print stars
            for(int i=0;i<sp;i++){
                System.out.print("*");
            }
            //print spaces
            for(int i=0;i<st;i++){
                System.out.print(" ");
            }
              //print stars
              for(int i=0;i<sp;i++){
                System.out.print("*");
            }

            //next line
            if(number_of_line<n){
                st++;
                sp=-2;
            }else if(number_of_line>n){
                st--;
                sp=+2;
            }
            System.out.println();
            number_of_line++;
        }
    }
}