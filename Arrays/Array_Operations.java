package Arrays;
public class Array_Operations {
    
    public static void reverse_Array(int arr[]){
        int first=0;
        int last=arr.length-1;

        while(first<last){
            //swap
            int temp=arr[last];
            arr[last]=arr[first];
            arr[first]=temp;
            first++;
            last--;

        }
    }

    public static void print_Pairs_in_Array(int arr[]){
        int total_pairs=0;
        for(int i=0;i<arr.length;i++){
            int current=arr[i];
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+current+","+arr[j]+")");
                total_pairs++;
            }
            System.out.println();
        }
        System.out.println("Total no. of pairs = "+total_pairs);
    }

    public static void print_sub_arrays(int arr[]){
        int total_subarrays=0;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(arr[k]+" ");
                }
                total_subarrays++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total no. of sub_arrays are : "+total_subarrays);
    }


    public static void display_array(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        reverse_Array(arr);
        reverse_Array(arr);
        display_array(arr);
        print_Pairs_in_Array(arr);
        print_sub_arrays(arr);
    }
}
