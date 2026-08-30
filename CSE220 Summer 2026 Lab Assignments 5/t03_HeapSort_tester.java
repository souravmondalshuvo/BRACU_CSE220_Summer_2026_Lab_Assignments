public class t03_HeapSort_tester {

    public static void main(String[] args) {
        testSortedOrder();
        testAlreadySorted();
        testDuplicates();
        testSingleAndEmpty();
    }

    // --------------------------
    // Test 1: General case
    // --------------------------
    private static void testSortedOrder() {
        System.out.println("===== Test 1: General Sort =====");

        int[] arr = {15, 3, 17, 10, 84, 19, 6, 22, 9};
        int[] expected = {3, 6, 9, 10, 15, 17, 19, 22, 84};

        MinHeap.outPlaceHeapSort(arr);
        check("Sorted order", expected, arr);
        System.out.println();
    }

    // --------------------------
    // Test 2: Already sorted input
    // --------------------------
    private static void testAlreadySorted() {
        System.out.println("===== Test 2: Already Sorted =====");

        int[] arr = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};

        MinHeap.outPlaceHeapSort(arr);
        check("Unchanged when pre-sorted", expected, arr);
        System.out.println();
    }

    // --------------------------
    // Test 3: Repeated values
    // --------------------------
    private static void testDuplicates() {
        System.out.println("===== Test 3: Duplicates =====");

        int[] arr = {7, 2, 7, 1, 2, 7};
        int[] expected = {1, 2, 2, 7, 7, 7};

        MinHeap.outPlaceHeapSort(arr);
        check("Duplicates preserved and ordered", expected, arr);
        System.out.println();
    }

    // --------------------------
    // Test 4: Edge sizes
    // --------------------------
    private static void testSingleAndEmpty() {
        System.out.println("===== Test 4: Edge Cases =====");

        int[] one = {42};
        MinHeap.outPlaceHeapSort(one);
        check("Single element", new int[]{42}, one);

        int[] none = {};
        MinHeap.outPlaceHeapSort(none);
        check("Empty array", new int[]{}, none);

        System.out.println();
    }

    // --------------------------
    // Utility checker
    // --------------------------
    private static void check(String testName, int[] expected, int[] actual) {
        if (expected.length != actual.length) {
            System.out.println("FAIL: " + testName + " | length mismatch");
            return;
        }
        for (int i = 0; i < expected.length; i++) {
            if (expected[i] != actual[i]) {
                System.out.println("FAIL: " + testName +
                        " | Expected: " + show(expected) +
                        " | Got: " + show(actual));
                return;
            }
        }
        System.out.println("PASS: " + testName + " | " + show(actual));
    }

    private static String show(int[] arr) {
        String s = "[";
        for (int i = 0; i < arr.length; i++) {
            s = s + arr[i];
            if (i != arr.length - 1) s = s + ", ";
        }
        return s + "]";
    }
}