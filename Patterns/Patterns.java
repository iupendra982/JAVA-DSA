public class Patterns {

    public static void hollow_Rectangele(int totRows,int totCols){
        //outer loop
        for(int i=1;i<=totRows;i++){
            //inner columns
            for(int j=1;j<=totCols;j++){
                //cell position --  (i,j)
                if(i==1 || i==totRows || j==1 ||j==totCols){
                    //boundary cells to be printed
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void inverted_Rotated_Half_Pyaramid(int n){
        //outer loop
        for(int i=1;i<=n;i++){
            //spaces printing
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //star printing
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

    }

    public static void inverted_Half_Pyramid_with_Numbers(int n){
        for(int i=1;i<=n;i++){
            //stars
            for(int j=1;j<=n+1-i;j++){
                System.out.print(j);
            }
            //spaces are not required foer this pattern
            for(int j=1;j<=i-1;j++){
                System.out.print("");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void FLOYD_Triangle(int n){
        int k=1;
        for(int i=1;i<=n;i++){
            //stars
            for(int j=1;j<=i;j++){
                System.out.print(k+" ");
                k++;
            }
            //spaces are not required foer this pattern
            for(int j=1;j<=i-1;j++){
                System.out.print("");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void zero_one_triangel(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void butterfly_pattern(int n){
                //ist half
                for(int i=1;i<=n;i++){
                    //stars -- i
                    for(int j=1;j<=i;j++){
                        System.out.print("*");
                    }
                    //spaces -- 2(n-i)
                    for(int j=1;j<=2*(n-i);j++){
                        System.out.print(" ");
                    }
                    //stars -- i
                    for(int j=1;j<=i;j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                //2nd half
                for(int i=n;i>=1;i--){
                    //stars -- i
                    for(int j=1;j<=i;j++){
                        System.out.print("*");
                    }
                    //spaces -- 2(n-i)
                    for(int j=1;j<=2*(n-i);j++){
                        System.out.print(" ");
                    }
                    //stars -- i
                    for(int j=1;j<=i;j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                System.out.println();
    }


    public static void solid_Rhombus_Pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void diamond_Pattern(int n){
        //1st half
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd half
        for(int i=n;i>=1;i--){
            //spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void hollow_Rhombus_Patter(int n){
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //hollow rectangle-stars
            for(int j=1;j<=n;j++){
                if(i==1 || i==n || j==1 ||j==n){
                    //boundary cells to be printed
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }


    public static void main(String[] args) {
        hollow_Rectangele(4,5);
        inverted_Rotated_Half_Pyaramid(5);
        inverted_Half_Pyramid_with_Numbers(5);
        FLOYD_Triangle(5);
        zero_one_triangel(5);
        butterfly_pattern(6);
        solid_Rhombus_Pattern(5);
        diamond_Pattern(4);
        hollow_Rhombus_Patter(5);

    }
}
