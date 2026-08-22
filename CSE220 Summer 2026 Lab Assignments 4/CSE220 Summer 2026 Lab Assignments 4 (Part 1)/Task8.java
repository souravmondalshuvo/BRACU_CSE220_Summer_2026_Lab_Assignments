// Complete the swapChild method
//ASSIGNMENT TASK MUST SUBMIT
public class Task8 {

    //===================================TASK#4===================================
    // This method takes only 3 parameters
    // 1st one is root of the given tree
    // 2nd one is there to help you count the levels
    // 3rd one is the level TILL whic you need to swap childs
    // All the changes will happen in-place
    // This method doesn't return anything
    // You can use extra helper private static methods as per need
    public static void swapChild( BTNode root, int lvl, int M ){
        //TO DO

        mirrorTop(root, M - lvl);
    }

    private static void mirrorTop(BTNode node, int budget) {

        if(node == null || budget <= 0) {
            return;
        }

        BTNode dhore_rakhe = node.left;
        node.left = node.right;
        node.right = dhore_rakhe;

        mirrorTop(node.left, budget - 1);
        mirrorTop(node.right, budget - 1);
    }
    //============================================================================
}
