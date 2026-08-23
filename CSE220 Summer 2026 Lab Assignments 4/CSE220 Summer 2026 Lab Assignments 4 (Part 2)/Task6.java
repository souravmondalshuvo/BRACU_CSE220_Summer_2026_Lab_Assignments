//Assignment Task (must Submit)
// Complete the isBST method
public class Task6 {

    //===================================TASK#6======================
    // This method takes only one parameter
    // it is root of the given tree
    // You can use extra helper private static methods as per need
    public static Boolean isBST( BSTNode root ){
        //TO DO

        return withinBounds(root, null, null);
        // return null; // remove this line
    }

    private static boolean withinBounds(BSTNode node, Integer floor, Integer ceil) {

        if(node == null) {
            return true;
        }

        int shongkha = (Integer) node.elem;

        if(floor != null && shongkha <= floor) {
            return false;
        }

        if(ceil != null && shongkha >= ceil) {
            return false;
        }

        return withinBounds(node.left, floor, shongkha) && withinBounds(node.right, shongkha, ceil);
    }
    //===============================================================


}
