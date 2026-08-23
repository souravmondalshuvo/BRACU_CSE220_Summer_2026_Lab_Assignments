//Assignment Task (must Submit)
// Complete the sumOfLeaves method
public class Task5 {

    //===================================TASK#5======================
    // This method takes only one parameter
    // it is root of the given tree
    // You can use extra helper private static methods as per need
    public static Integer mirrorSum( BSTNode root ){
        //TO DO

        if(root == null) {
            return 0;
        }

        return facingWalk(root.left, root.right);
        // return null; // remove this line
    }

    private static int facingWalk(BSTNode baamPasherSide, BSTNode daanPasherSide) {

        if(baamPasherSide == null || daanPasherSide == null) {
            return 0;
        }

        int jora = (Integer) baamPasherSide.elem + (Integer) daanPasherSide.elem;

        int bairer = facingWalk(baamPasherSide.left, daanPasherSide.right);
        int bhitorer = facingWalk(baamPasherSide.right, daanPasherSide.left);

        return jora + bairer + bhitorer;
    }
    //===============================================================


}
