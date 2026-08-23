//Assignment Task (must Submit)
// Complete the rangeSum method
public class Task4 {

    //===================================TASK#4======================
    // This method takes only three parameters
    // first one is the root of the given tree
    // second one the low range and third one is high range
    // You can use extra helper private static methods as per need
    public static Integer rangeSum( BSTNode root, Integer low, Integer high ){
        //TO DO

        if(root == null || low == null || high == null) {
            return 0;
        }

        return window(root, low, high);
        // return null; // remove this line
    }

    private static int window(BSTNode node, int floor, int ceil) {

        if(node == null || floor > ceil) {
            return 0;
        }
            
        int shongkha = (Integer) node.elem;

        if(shongkha < floor) {
            return window(node.right, floor, ceil);
        }

        if(shongkha > floor) {
            return window(node.left, floor, ceil);
        }

        return shongkha + window(node.left, floor, shongkha) + window(node.right, shongkha, ceil);
    }
    //===============================================================


}
