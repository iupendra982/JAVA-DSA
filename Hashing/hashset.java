import java.util.*;
public class hashset {
    public static void main(String[] args) {
        HashSet<Integer>hs=new HashSet<>();
        //creation or insertion of data --only unique value gets inserted no repetition allowed
        hs.add(1);
        hs.add(2);
        hs.add(4);
        hs.add(2);
        hs.add(1);
        hs.add(3);
        hs.add(5);

        //printing hashset
        System.out.println(hs);

        //contains function --returns boolean value
        System.out.println(hs.contains(1));

        //removing element
        hs.remove(2);

        System.out.println(hs);

        //printing size of hashset
        System.out.println(hs.size());

        //to empty the set
        hs.clear();
        System.out.println(hs.size());

        //isEmpty() function
        System.out.println(hs.isEmpty());

        hs.add(1);
        hs.add(2);
        hs.add(4);
        hs.add(3);
        hs.add(5);


        System.out.println("-------------------------------------------------------------");

        //Iteration in HashSet
        Iterator it=hs.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();
        //or we can iterate using enhanced for loop
        for(int i:hs){
            System.out.print(i+" ");
        }

        //In LinkedHashSet insertion order is maintained
        //In TreeSet order is sorted ascending order
    }
}
