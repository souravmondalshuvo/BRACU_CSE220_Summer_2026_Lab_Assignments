//Assignment Task 03: Game Arena
class AssgnTask3{

    //Complete this method so that it gives the Expected Output
    //YOU ONLY HAVE TO SUBMIT THIS METHOD, NO OTHER DRIVER CODE
    public static void playGame( Integer[][] arena ){

        //For this task you don't need to create any new 2D array
        //just print the result inside the function
        
        //TO DO

        int points = 0;
        boolean found_exit = false;

        for(int i = 0; i < arena.length; i++) {
            int floor = 0;
            int pit = 0;
            boolean hostile_row = false;

            for(int j = 0; j < arena[i].length; j++) {
                int value = arena[i][j];

                if(value == 200) {
                    found_exit = true;
                }

                if(value == 2) {
                    floor++;
                } else if(value == 0) {
                    pit++;
                } else if(value != 1) {
                    hostile_row = true;
                }
            }

            if(!hostile_row && floor > pit) {
                points += floor * 2;
            }
        }

        System.out.print("Points Gained: " + points + ". ");
        
        if(found_exit) {
            System.out.println("Your team has survived the game.");
        } else {
            System.out.println("Your team is out.");
        }
    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[][] arena = {
            {0,2,2,0},
            {50,1,2,0},
            {2,2,2,0},
            {1,100,2,0}
        };
        System.out.println("Given Arena: ");
        Arr.print2D(arena);
        
        System.out.println("\nExpected Output:");
        System.out.print("Points Gained: 6. Your team is out.\n");
        
        System.out.print("\nYour Output:\n");
        playGame( arena );

        System.out.print("\n======================\n");

        Integer[][] arena1 = {
            {0,2,2,0,2},
            {1,50,2,1,100},
            {2,2,2,0,2},
            {0,200,2,0,0}
        };
        System.out.println("\nGiven Arena: ");
        Arr.print2D(arena1);
        
        System.out.println("\nExpected Output:");
        System.out.print("Points Gained: 14. Your team has survived the game.\n");
        
        System.out.print("\nYour Output:\n");
        playGame( arena1 );
    }
}
