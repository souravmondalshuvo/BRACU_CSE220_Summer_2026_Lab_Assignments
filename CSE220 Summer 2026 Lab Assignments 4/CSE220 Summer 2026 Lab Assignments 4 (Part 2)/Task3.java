//Before starting to work on this design the Tree in the Tester code 
// Complete the sumOfLeaves method
public class Task3 {

    //===================================TASK#2===================================
    // This method takes only 2 parameters
    // 1st one is root
    // 2nd one is an Integer
    // You'll need to find the path from the root to a node containing the Integer
    // return the path as a String
    public static String findPath( BSTNode root, Integer key ){
        // TO DO

        String path = "";

        if(root == null) {
            return "No Path Found";
        }

        while(root != null) {

            path += root.elem;

            if(((Integer) root.elem).equals(key)) {
                return path;
            }

            path += " ";

            if(key < root.elem) {
                root = root.left;
            } else {
                root = root.right;
            }
        }

        return "No Path Found";
        // return null; //remove this line
    }
    //============================================================================

}
