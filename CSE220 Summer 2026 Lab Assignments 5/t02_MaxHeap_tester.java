public class t02_MaxHeap_tester {
    public static void main(String[] args) {

        testInsertAndPeek();
        testExtractMax();
        testMultipleExtract();
        testEdgeCases();
        testCapacity();
        testIsEmpty();
    }

    // --------------------------
    // Test 1: Insert + Peek
    // --------------------------
    private static void testInsertAndPeek() {
        System.out.println("===== Test 1: Insert & Peek =====");

        MaxHeap h = new MaxHeap(10);

        h.insert(10);
        h.insert(5);
        h.insert(20);
        h.insert(2);

        Integer expected = 20;
        Integer actual = h.peek();

        check("Peek after inserts", expected, actual);
        System.out.println();
    }

    // --------------------------
    // Test 2: Extract Max
    // --------------------------
    private static void testExtractMax() {
        System.out.println("===== Test 2: Extract Max =====");

        MaxHeap h = new MaxHeap(10);

        h.insert(10);
        h.insert(5);
        h.insert(20);
        h.insert(2);

        check("First extract", 20, h.extractMax());
        check("Second extract", 10, h.extractMax());
        check("Third extract", 5, h.extractMax());
        check("Fourth extract", 2, h.extractMax());

        System.out.println();
    }

    // --------------------------
    // Test 3: Order correctness
    // --------------------------
    private static void testMultipleExtract() {
        System.out.println("===== Test 3: Sorted Order =====");

        MaxHeap h = new MaxHeap(10);

        Integer[] values = {15, 3, 17, 10, 84, 19, 6, 22, 9};

        for (int i = 0; i < values.length; i++) {
            h.insert(values[i]);
        }

        Integer[] expected = {84, 22, 19, 17, 15, 10, 9, 6, 3};

        boolean pass = true;

        for (int i = 0; i < expected.length; i++) {
            Integer val = h.extractMax();
            if (!equals(expected[i], val)) {
                pass = false;
                System.out.println("Mismatch at index " + i +
                        " | Expected: " + expected[i] +
                        " | Got: " + val);
            }
        }

        if (pass) {
            System.out.println("PASS: Heap produces descending order");
        }

        System.out.println();
    }

    // --------------------------
    // Test 4: Edge cases
    // --------------------------
    private static void testEdgeCases() {
        System.out.println("===== Test 4: Edge Cases =====");

        MaxHeap h = new MaxHeap(5);

        check("Extract from empty", null, h.extractMax());
        check("Peek from empty", null, h.peek());

        h.insert(42);
        check("Single element peek", 42, h.peek());
        check("Single element extract", 42, h.extractMax());
        check("Empty again", null, h.extractMax());

        System.out.println();
    }

    // --------------------------
    // Test 5: Capacity
    // --------------------------
    private static void testCapacity() {
        System.out.println("===== Test 5: Capacity =====");

        MaxHeap h = new MaxHeap(3);

        h.insert(10);
        h.insert(20);
        h.insert(5);
        h.insert(99); // should be ignored or handled

        check("Capacity handling", 20, h.peek());

        System.out.println();
    }

    // --------------------------
    // Test 6: isEmpty
    // --------------------------
    private static void testIsEmpty() {
        System.out.println("===== Test 6: isEmpty =====");

        MaxHeap h = new MaxHeap(5);

        checkBool("Initially empty", true, h.isEmpty());

        h.insert(10);
        checkBool("After one insert", false, h.isEmpty());

        h.extractMax();
        checkBool("After removing all elements", true, h.isEmpty());

        System.out.println();
    }

    // --------------------------
    // Utility checker
    // --------------------------
    private static void check(String testName, Integer expected, Integer actual) {
        if (equals(expected, actual)) {
            System.out.println("PASS: " + testName);
        } else {
            System.out.println("FAIL: " + testName +
                    " | Expected: " + expected +
                    " | Got: " + actual);
        }
    }

    private static void checkBool(String testName, boolean expected, boolean actual) {
        if (expected == actual) {
            System.out.println("PASS: " + testName);
        } else {
            System.out.println("FAIL: " + testName +
                    " | Expected: " + expected +
                    " | Got: " + actual);
        }
    }

    private static boolean equals(Integer a, Integer b) {
        if (a == null && b == null) return true;
        if (a == null || b == null) return false;
        return a.equals(b);
    }
}