public class t05_TopK_tester {

    // ANSI color codes for terminal output
    static final String green = "\u001B[32m", red = "\u001B[31m", blue = "\u001B[34m";
    static final String bold = "\u001B[1m", normal = "\033[0;0m";

    public static void main(String[] args) {
        testSampleCase();
        testKEqualsOne();
        testKEqualsLength();
        testDuplicatesAndNegatives();
    }

    // --------------------------
    // Test 1: Sample from the spec
    // --------------------------
    private static void testSampleCase() {
        header("===== Test 1: Sample Input =====");

        int[] nums = {4, 10, 2, 8, 6, 7};
        Integer[] out = Task5.topK(nums, 3);

        check("Top 3 of [4,10,2,8,6,7]", new int[]{10, 8, 7}, out);
        System.out.println();
    }

    // --------------------------
    // Test 2: Only the largest
    // --------------------------
    private static void testKEqualsOne() {
        header("===== Test 2: k = 1 =====");

        int[] nums = {4, 10, 2, 8, 6, 7};
        Integer[] out = Task5.topK(nums, 1);

        check("Single largest element", new int[]{10}, out);
        System.out.println();
    }

    // --------------------------
    // Test 3: Whole array, descending
    // --------------------------
    private static void testKEqualsLength() {
        header("===== Test 3: k = n =====");

        int[] nums = {4, 10, 2, 8, 6, 7};
        Integer[] out = Task5.topK(nums, 6);

        check("Full descending order", new int[]{10, 8, 7, 6, 4, 2}, out);
        System.out.println();
    }

    // --------------------------
    // Test 4: Ties and negative values
    // --------------------------
    private static void testDuplicatesAndNegatives() {
        header("===== Test 4: Duplicates & Negatives =====");

        int[] nums = {-5, 9, 9, 0, -2, 9};
        Integer[] out = Task5.topK(nums, 4);

        check("Handles repeats and negatives", new int[]{9, 9, 9, 0}, out);
        System.out.println();
    }

    // --------------------------
    // Utility checker
    // --------------------------
    private static void check(String testName, int[] expected, Integer[] actual) {
        if (actual == null || expected.length != actual.length) {
            fail(testName + " | size mismatch | Got: " + show(actual));
            return;
        }
        for (int i = 0; i < expected.length; i++) {
            if (actual[i] == null || expected[i] != actual[i]) {
                fail(testName +
                        " | Expected: " + showInt(expected) +
                        " | Got: " + show(actual));
                return;
            }
        }
        pass(testName + " | " + show(actual));
    }

    private static String show(Integer[] arr) {
        if (arr == null) return "null";
        String s = "[";
        for (int i = 0; i < arr.length; i++) {
            s = s + arr[i];
            if (i != arr.length - 1) s = s + ", ";
        }
        return s + "]";
    }

    private static String showInt(int[] arr) {
        String s = "[";
        for (int i = 0; i < arr.length; i++) {
            s = s + arr[i];
            if (i != arr.length - 1) s = s + ", ";
        }
        return s + "]";
    }

    // --------------------------
    // Colored printers
    // --------------------------
    private static void header(String text) {
        System.out.println(blue + bold + text + normal);
    }

    private static void pass(String text) {
        System.out.println(green + "PASS: " + text + normal);
    }

    private static void fail(String text) {
        System.out.println(red + "FAIL: " + text + normal);
    }
}