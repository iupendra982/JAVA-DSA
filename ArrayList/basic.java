import java.util.ArrayList;
import java.util.Collections;

public class basic {

    //Swap 2 elements in arraylist
    public static void swap(ArrayList<Integer>l1,int idx1,int idx2){
        int temp=l1.get(idx1);
        l1.set(idx1,l1.get(idx2));
        l1.set(idx2, temp);
    }

    public static void main(String[] args) {
        //ArrayList is a part of Java Collections Framework
        //ClassName objectName=neew ClassName();
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<String> list2=new ArrayList<>();
        ArrayList<Boolean> list3=new ArrayList<>();

        //Add Operation
        list1.add(1);//O(1)
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        list1.add(1,9);//it will add element 9 at index 1 rest of the elements 
        //will shift to right from the index position    || O(n)

        System.out.println(list1);

        //Get Operation
        int element=list1.get(0);//get element at index 0  ||  O(1)
        System.out.println(element);

        //Remove Element    
        list1.remove(2);//remove element at index 2  ||  O(n)
        //beacuse it will search linearly elements in the list the time complexity is O(n)
        System.out.println(list1);

        //Set Element at Index
        list1.set(2, 10);//set element at index 0  and value 10  ||  O(n)
        System.out.println(list1);

        //Contains Element
        boolean flag=list1.contains(10);//check if element 10 is present in the list or
        System.out.println(flag);

        //Size of an ArrayList
        int size=list1.size();//get the size of the list  ||  O(1)
        System.out.println(size);

        //Print the ArrayList
        for(int i=0;i<list1.size();i++){
            System.out.print(list1.get(i)+" ");
        }
        System.out.println();

        //Print Reverse of an ArrayList
        for(int i=list1.size()-1;i>=0;i--){
            System.out.print(list1.get(i)+" ");
        }
        System.out.println();

        //Find Maximum in Array List
        int max=Integer.MIN_VALUE;
        for(int i=0;i<list1.size();i++){
            //or we can do it in one line
            //max=Math.max(max,list1.get(i));
            if(list1.get(i)>max){
                max=list1.get(i);
            }
        }
        System.out.println("Max Element is : "+max);

        //Swap 2 Elements in ArrayList
        //Printing list without swapping
        System.out.println(list1);
        //method calling 
        swap(list1,0,3);
        //Printing list after swapping
        System.out.println(list1);

        //Sorting the list
        Collections.sort(list1);//sorting in ascending order
        System.out.println("Sorted List :");
        System.out.println(list1);

        //here comparator function logic is used to sort the list in descending order
        Collections.sort(list1,Collections.reverseOrder());//This will sort in descending
        System.out.println("Sorted list in descending order");
        System.out.println(list1);
    }
}