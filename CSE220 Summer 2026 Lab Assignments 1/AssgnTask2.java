//Assignment Task 02: Matrix Compression
class AssgnTask2{

    //Complete this method so that it gives the Expected Output
    //YOU ONLY HAVE TO SUBMIT THIS METHOD, NO OTHER DRIVER CODE
    public static Integer[][] compressMatrix( Integer[][] matrix ){

        //For this task you'll need to create new 2D array
        
        //TO DO

        int row = matrix.length;
        int column = matrix[0].length;

        Integer[][] compressed_matrix = new Integer[row / 2][column / 2];

        for(int i = 0; i < row; i += 2) {
            for(int j = 0; j < column; j += 2) {
                int block_sum = matrix[i][j] +
                                matrix[i][j + 1] + 
                                matrix[i + 1][j] +
                                matrix[i + 1][j + 1];

                compressed_matrix[i / 2][j / 2] = block_sum;
            }
        }

        //remove the line below and return the newly created Compressed 2D matrix
        // return null;
        return compressed_matrix;
    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[][] matrix = {
            { 1 , 2 , 3 , 4 },
            { 5 , 6 , 7 , 8 },
            { 1 , 3 , 5 , 2 },
            {-2 , 0 , 6 ,-3 }
        };
        System.out.println("Given Matrix: ");
        Arr.print2D(matrix);
        
        System.out.println("\nExpected Output:");
        System.out.print("| 14 | 22 |\n| 2  | 10 |\n");
        
        System.out.print("\nYour Output:\n");
        Integer[][] returnedArray = compressMatrix( matrix );
        Arr.print2D( returnedArray );
    }
}
