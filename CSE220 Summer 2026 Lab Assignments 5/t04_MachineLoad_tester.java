public class t04_MachineLoad_tester {

    // ANSI color codes for terminal output
    static final String green = "\u001B[32m", red = "\u001B[31m", blue = "\u001B[34m";
    static final String bold = "\u001B[1m", normal = "\033[0;0m";

    public static void main(String[] args) {
        testSampleCase();
        testMoreMachinesThanTasks();
        testSingleMachine();
        testEqualTasks();
    }

    // --------------------------
    // Test 1: Sample from the spec
    // --------------------------
    private static void testSampleCase() {
        header("===== Test 1: Sample Input =====");

        int[] tasks = {2, 4, 7, 1, 6};
        Integer[] out = MachineLoad.distribute(tasks, 4);

        // {2, 4, 7, 7} as a multiset — array layout may differ but is still a valid heap
        checkLoads("Loads for tasks=[2,4,7,1,6], m=4", new int[]{2, 4, 7, 7}, out);
        System.out.println();
    }

    // --------------------------
    // Test 2: Idle machines left over
    // --------------------------
    private static void testMoreMachinesThanTasks() {
        header("===== Test 2: Machines > Tasks =====");

        int[] tasks = {5, 3};
        Integer[] out = MachineLoad.distribute(tasks, 4);

        checkLoads("Two idle machines remain at 0", new int[]{0, 0, 3, 5}, out);
        System.out.println();
    }

    // --------------------------
    // Test 3: Everything on one machine
    // --------------------------
    private static void testSingleMachine() {
        header("===== Test 3: One Machine =====");

        int[] tasks = {2, 4, 7, 1, 6};
        Integer[] out = MachineLoad.distribute(tasks, 1);

        checkLoads("All 20 units on a single machine", new int[]{20}, out);
        System.out.println();
    }

    // --------------------------
    // Test 4: Perfectly divisible workload
    // --------------------------
    private static void testEqualTasks() {
        header("===== Test 4: Even Split =====");

        int[] tasks = {5, 5, 5, 5};
        Integer[] out = MachineLoad.distribute(tasks, 2);

        checkLoads("Balanced across two machines", new int[]{10, 10}, out);
        System.out.println();
    }

    // --------------------------
    // Utility checker
    // --------------------------
    // Compares as a multiset: heap array layout is not unique when loads tie,
    // so what matters is which loads exist, not the slot each one landed in.
    private static void checkLoads(String testName, int[] expected, Integer[] actual) {
        if (actual == null || expected.length != actual.length) {
            fail(testName + " | size mismatch | Got: " + show(actual));
            return;
        }

        int[] mine = new int[actual.length];
        for (int i = 0; i < actual.length; i++) mine[i] = actual[i];

        sort(expected);
        sort(mine);

        for (int i = 0; i < expected.length; i++) {
            if (expected[i] != mine[i]) {
                fail(testName + " | Got: " + show(actual));
                return;
            }
        }
        pass(testName + " | " + show(actual));
    }

    // simple insertion sort so no built-in sorting is used
    private static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
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