//Before starting to work on this design the Tree in the Tester code 
// Complete the lowestCommonAncestor method
public class Task2 {

    //======================TASK#1======================
    // This method takes only 3 parameter first one is root
    // and second & third parameter are as 2 integers
    // You'll need to find the lowest common ancestor of them and return it
    public static Integer lowestCommonAncestor( BSTNode root, Integer x, Integer y ){
        // TO DO

        if(root == null) {
            return null;
        }

        while(root != null) {

            if(x < root.elem && y < root.elem) {
                root = root.left;
            } else if(x > root.elem && y > root.elem) {
                root = root.right;
            } else {
                return root.elem;
            }
        }

        return root.elem;
        // return null; //remove this line
    }
    //==================================================

}
