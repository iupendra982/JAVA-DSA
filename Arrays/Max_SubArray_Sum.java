package Arrays;

public class Max_SubArray_Sum {

    public static void maximum_sub_array_sum(int arr[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                currSum=0;
                for(int k=i;k<=j;k++){
                    //sub array sum
                    currSum+=arr[k];
                }
                System.out.println("Current Sum is : "+currSum);
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("Max sum of subArray is : "+maxSum);
        //here in this case Time complexity is O(n3) not feasible
    }

    //prefix sum array for maximum sub array problem
    public static void prefix_sum_array(int arr[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        //calculate prefix array
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                currSum=0;
                //sub array sum
                currSum+=i==0 ? prefix[j] : prefix[j]-prefix[i-1];
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("Max sum of subArray is : "+maxSum);
        //here in this case Time complexity is O(n2) little bit feasible
    }
    public static void Kadanes_algorithm(int arr[]){
        //for every negative lement array this algo will not perform well so we will perform
        //a special case if every elements are negative the return smalllest -ve no.
        int ms=Integer.MIN_VALUE;
        int cs=0;

        for(int i=0;i<arr.length;i++){
            cs=cs+arr[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs, ms);
        }
        System.out.println("Maximum sub array sum is : "+ms);
        //in this case time complexity is O(n) feasible solution
    }
    public static void main(String[] args) {
        int arr[]={1,-2,6,1,3};
        maximum_sub_array_sum(arr);
        prefix_sum_array(arr);
        Kadanes_algorithm(arr);
    }
}
