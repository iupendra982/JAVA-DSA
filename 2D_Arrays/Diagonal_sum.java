public class Diagonal_sum {
    public static int diagonalSum(int matrix[][]){//T.C.==O(n^2) not a good code
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                //primary diagonal sum
                if(i==j){
                    sum+=matrix[i][j];
                }
                //secondary diagonal sum
                if(i+j==matrix.length-1){
                    sum+=matrix[i][j];
                }
            }
        }
        return sum;
    }
    public static int diagonalSumOptimized(int matrix[][]){//T.c>==o(n)
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            //primary diagonal
            sum+=matrix[i][i];
            //secondary diagonal
            if(i !=matrix.length-1-i){
                //condition for not calcuulating the middle element in case for double addition
                sum+=matrix[i][matrix.length-1-i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(diagonalSumOptimized(matrix));
    }
}
