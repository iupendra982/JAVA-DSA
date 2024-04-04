import java.util.*;
public class Half_Pyramid_Pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter number ");
        int n=sc.nextInt();
        for(int line=1;line<=n;line++){
            for(int number=1;number<=line;number++){
                System.out.print(number+" ");
            }
            System.out.println();
        }
    }
}
