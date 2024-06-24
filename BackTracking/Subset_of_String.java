public class Subset_of_String {
    public static void findSubsets(String str,String ans,int i){
        //base case
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");//printing the empty subset
            }else{
                System.out.println(ans);
            }            return;
        }
        //Yes Choice
        findSubsets(str, ans+str.charAt(i), i+1);
        //No Choice
        findSubsets(str, ans, i+1);
    }
    public static void main(String[]args){
        String str="abc";
        findSubsets(str, "", 0);
    }
}
