public class Problems {
    //TILLING Problem
    public static int tillingProblem(int n){
        //base case
        if(n==0 || n==1){
            return 1;
        }
        //vertical choice 
        int fnm1=tillingProblem(n-1);
        //horizontal choice
        int fnm2=tillingProblem(n-2);

        int totWays=fnm1+fnm2;
        return totWays;
    }

    //Remove duplicates in a String
    public static void removeDuplicates(String str,int idx,StringBuilder newStr,boolean map[]){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
        //kaam
        char currChar=str.charAt(idx);
        if(map[currChar-'a']==true){
            //duplicate
            removeDuplicates(str, idx+1, newStr, map);
        }
        else{
            map[currChar-'a'] = true;
            removeDuplicates(str, idx+1, newStr.append(currChar), map);
        }
    }

    //Friends Pairing Problem
    public static int friendsPairing(int n){
        if(n==1 || n==2){
            return n;
        }
        //choice options
        //single
        int fnm1=friendsPairing(n-1);

        //pair
        int fnm2=friendsPairing(n-2);
        int pairways=(n-1)*fnm2;

        //total ways
        int totWays=fnm1+pairways;
        return totWays;

        // //it can be also written in simple code as
        // if(n==1 || n==2){
        //     return n;
        // }
        // return friendsPairing(n-1)+(n-1)*friendsPairing(n-2);
    }
    public static void main(String[] args) {
        System.out.println(tillingProblem(4));

        String str="appnnacollege";
        removeDuplicates(str, 0, new StringBuilder(""),new boolean[26]);

        System.out.println(friendsPairing(3));
    }
}
