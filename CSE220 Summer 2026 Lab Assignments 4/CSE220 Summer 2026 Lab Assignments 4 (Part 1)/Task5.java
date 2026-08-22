//LAB TASK NO NEED TO SUBMIT
public class Task5 {

        //===================================TASK#4===================================
        // This method takes 1 parameter, the root
        // This method returns the largest value
        // No Helper Methods are needed for this task
        public static Integer maxTree( BTNode root ){
            // TO DO
            // you'll need to typecast Object into Integer
            // in order to use > or < operators

            if(root == null) {
                return Integer.MIN_VALUE;
            }

            int current = (Integer) root.elem;
            int left_max = maxTree(root.left);
            int right_max = maxTree(root.right);

            if(current >= left_max && current >= right_max) {
                return current;
            } else if(left_max >= current && left_max >= right_max) {
                return left_max;
            } else {
                return right_max;
            }
            // return null;
        }
        //============================================================================


}
