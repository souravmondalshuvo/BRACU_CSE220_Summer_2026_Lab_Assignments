// Complete the subtractSummation method
//ASSIGNMENT TASK MUST SUBMIT
public class Task6 {

    //===================================TASK#5===================================
    // This method takes only 1 parameter which is root of the given tree
    // This method returns an Integer
    // At times you may need to typeCast root.elem to Integer
    // You can use extra helper private static methods with extra extra params as per need
    public static Integer subtractSummation( BTNode root ){
        //TO DO

        if(root == null) {
            return 0;
        }

        return signedWalk(root.left, 1) + signedWalk(root.right, -1);
        // return null; //remove this line once ready
    }

    private static int signedWalk(BTNode node, int polarity) {

        if(node == null) {
            return 0;
        }

        int ojon = polarity * (Integer) node.elem;

        return ojon + signedWalk(node.left, polarity) + signedWalk(node.right, polarity);
    }
    //============================================================================

}
