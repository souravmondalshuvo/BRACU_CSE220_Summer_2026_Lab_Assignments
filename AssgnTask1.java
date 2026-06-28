//Assignment Task 01: Row Rotation Policy
class AssgnTask1{

    //Complete this method so that it gives the Expected Output
    //YOU ONLY HAVE TO SUBMIT THIS METHOD, NO OTHER DRIVER CODE
    public static Integer rowRotation( Integer examWeek, String[][] matrix ){

        //For this task you don't need to create new Matrix
	//You can create 1D array if you need (but you can do it without creating any 1D array as well)
        //After rotation the Matrix should be printed inside the method
        //Only the integer row number is to be returned

        //TO DO

        int total_rows = matrix.length;
        int shift = (examWeek - 1) % total_rows;

        for(int i = 0; i < shift; i++) {
            String[] back_row = matrix[total_rows - 1];

            for(int j = total_rows - 1; j > 0; j--) {
                matrix[j] = matrix[j - 1];
            }

            matrix[0] = back_row;
        }

        Arr.print2D(matrix);

        for(int i = 0; i < total_rows; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j].equals("AA")) {
                    return i + 1;
                }
            }
        }
        
        return null;
    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        String[][] seatStatus = {
                {"A" , "B"  , "C"  , "D"  , "E"},
                {"F" , "G"  , "H"  , "I"  , "J"},
                {"K" , "L"  , "M"  , "N"  , "O"},
                {"P" , "Q"  , "R"  , "S"  , "T"},
                {"U" , "V"  , "W"  , "X"  , "Y"},
                {"Z" , "AA" , "BB" , "CC" , "DD"}
        };
        System.out.println("Given Seat Status: ");
        Arr.print2D(seatStatus);
        
        System.out.println("\nExpected Output:");
        System.out.println("| U  | V  | W  | X  | Y  | ");
        System.out.println("| Z  | AA | BB | CC | DD | ");
        System.out.println("| A  | B  | C  | D  | E  | ");
        System.out.println("| F  | G  | H  | I  | J  | ");
        System.out.println("| K  | L  | M  | N  | O  | ");
        System.out.println("| P  | Q  | R  | S  | T  | ");
        System.out.println("Your friend AA will be on row 2");
        
        System.out.print("\nYour Output:\n");
        Integer examWeek = 3;
        //This following should print modified seat status after rotation and return the current exam week
        Integer rowNumber = rowRotation( examWeek, seatStatus );
        //The following should print Your friend AA will be on row 2
        System.out.println("Your friend AA will be on row "+rowNumber);
    }
}
