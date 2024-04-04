package Strings;

public class String_Functions {

    //SubString Method
    public static String SubString(String str,int si,int ei){
        String subStr="";
        for(int i=si;i<ei;i++){
            subStr+=str.charAt(i);
        }
        return subStr;
    }

    //largest string as of dexicographically means as of letter precedence in alphabets
    public static String largest_string(String fruits[]){
        String largest=fruits[0];
        for(int i=1;i<fruits.length;i++){
            if(largest.compareTo(fruits[i])<0){
                largest=fruits[i];
            }
        }
        System.out.println(largest);
        return largest;
    }

    //convert first letter of every word to upper case
    public static String toUpperCase(String str){
        StringBuilder sb=new StringBuilder("");

        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    } 

    //String Compression
    public static String compress(String str){
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<str.length();i++){
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count>1){
                sb.append(count.toString());
            }
        }
        System.out.println(sb.toString());
        return sb.toString();
    }
    public static void main(String[] args) {
        String s1="Tony";
        String s2="Tony";
        String s3=new String("Tony");

        
        //compare method
        if(s1==s2){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }
        
        if(s1==s3){//this will return not same 
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }

        //so to rectify that we will use
        if(s1.equals(s3)){//this only checks the value of string
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }


        //calling substring method
        String str="hello world is first line of code";
        System.out.println(SubString(str, 0, 5));
        System.out.println(str.substring(0, 5));//in built method

        //calling largest length method
        String fruits[]={"apple","mango","bannana"};
        largest_string(fruits);

        //String Buiulder Program   T.C ==O(n^2)
        StringBuilder sb=new StringBuilder("");
        for(char ch='a';ch<='z';ch++){
            sb.append(ch);
        }
        System.out.println(sb);
        System.out.println(sb.length());

        //calling conversion to upper case function
        System.out.println(str);
        System.out.println(toUpperCase(str));

        //calling string compression method
        String str1="aaabbcccdd";
        compress(str1);
    }
}
