import java.util.HashMap;

public class countOccurenece_HM {
    public static void main(String[] args) {
        int arr[]={1,2,2,3,4,5,6,2,1,5,5,6,6,6};
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int x:arr){
            hm.put(x,hm.getOrDefault(x,0)+1);
        }
        for(int x:hm.keySet()){
            System.out.print(x+"->"+hm.get(x)+"  ");
        }
    }
}
