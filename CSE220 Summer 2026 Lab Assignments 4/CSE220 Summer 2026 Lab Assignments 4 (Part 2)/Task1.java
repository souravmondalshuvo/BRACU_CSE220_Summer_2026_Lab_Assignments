//Before starting to work on this design the Tree in the Tester code 
// Complete the lowestCommonAncestor method
public class Task1 {

    //======================TASK#1a======================
    // This method takes only 1 parameter; root of a BST
    // You'll need to find the max of the BST and return it
    public static Integer maxOfBST( BSTNode root ){
        // TO DO

        if(root == null) {
            return null;
        }

        while(root.right != null) {
            root = root.right;
        }

        return root.elem;
        // return null; //remove this line
    }
    //==================================================

    //======================TASK#1b======================
    // This method takes only 2 parameters
    // root of a BST and the value of which you wanna the predecessor
    // You'll need to find the max of the BST and return it
    public static Integer inOrderPred( BSTNode root, Integer x ){
        // TO DO

        BSTNode current = root;
        Integer predecessor = null;

        while(current != null) {

            if(x > current.elem) {
                predecessor = current.elem;
                current = current.right;
            } else if(x < current.elem) {
                current = current.left;
            } else {

                if(current.left != null) {
                    return maxOfBST(current.left);
                }
            }
        }

        return predecessor;
        // return null; //remove this line
    }
    //==================================================
}
