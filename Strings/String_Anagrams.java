package Strings;
import java.util.Arrays;
public class String_Anagrams {
    public static void main(String[] args) {
        String str1="earth";
        String str2="heart";
        //converting string to lower case, so that we don't have to check separately for uppercase
        str1=str1.toUpperCase();
        str2=str2.toUpperCase();
        //checking length
        if(str1.length()==str2.length()){
            //conerting strings into charArray
            char[] str1charArray=str1.toCharArray();
            char[] str2charArray=str2.toCharArray();
            //sorting the char array
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);
            //if sorted are same or not
            boolean result=Arrays.equals(str1charArray, str2charArray);

            if(result){
                System.out.println("Both strings are anagrams of each other");
            }else{
                System.out.println("Not anagrams");
            }
        }else{//case when length are not equal
            System.out.println("Not anagarams");
        }
    }
}
