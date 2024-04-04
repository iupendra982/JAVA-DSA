public class Stair_Case_search {
    public static boolean stairCaseSearch(int matrix[][],int key){
        //here we are moving from top right element
        //different approach can be there from bottom left element 
        int row=0;
        int col=matrix[0].length-1;
        while (row<matrix.length && col>=0){
            if(matrix[row][col]==key){
                System.out.println("Found key at ("+row+","+col+")");
                return true;
            }
            else if(key<matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("Key not found");
        return false;
    }
    //bottom left approach
    public static boolean stairCaseSearch2(int matrix[][],int key){
        //here we are moving from top right element
        //different approach can be there from bottom left element 
        int row=matrix.length-1;
        int col=0;
        while (col<matrix.length && row>=0){
            if(matrix[row][col]==key){
                System.out.println("Found key at ("+row+","+col+")");
                return true;
            }
            else if(key<matrix[row][col]){
                row--;
            }
            else{
                col++;
            }
        }
        System.out.println("Key not found");
        return false;
    }


    public static void main(String[] args) {
        int matrix[][]={{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}};
        int key=33;
        stairCaseSearch(matrix, key);
        stairCaseSearch2(matrix, key);
    }
}
