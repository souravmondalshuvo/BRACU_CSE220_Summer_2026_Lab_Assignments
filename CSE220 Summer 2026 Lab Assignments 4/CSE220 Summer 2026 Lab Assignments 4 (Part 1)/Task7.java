// Complete the levelSum method
//ASSIGNMENT TASK MUST SUBMIT
public class Task7 {

    //===================================TASK#6===================================
    // This method takes only 1 parameter which is root of the given tree
    // This method returns an Integer
    // At times you may need to typeCast root.elem to Integer
    // You can use extra helper private static methods with extra extra params as per need
    public static Integer levelSum( BTNode root ){
        //TO DO

        return alternatingWalk(root, -1);
        // return null; //remove this line once ready
    }

    private static int alternatingWalk(BTNode node, int polarity) {

        if(node == null) {
            return 0;
        }

        int ojon = polarity * (Integer) node.elem;
        int niche = alternatingWalk(node.left, -polarity) + alternatingWalk(node.right, -polarity);

        return ojon + niche;
    }
    //============================================================================

}
