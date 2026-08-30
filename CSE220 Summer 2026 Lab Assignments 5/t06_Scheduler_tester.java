public class t06_Scheduler_tester {

    // ANSI color codes for terminal output
    static final String green = "\u001B[32m", red = "\u001B[31m", cyan = "\033[0;96m";
    static final String bold = "\u001B[1m", normal = "\033[0;0m";

    public static void main(String[] args) {
        testSampleCase();
        testAlreadyOrdered();
        testSingleTask();
        testWideSpread();
    }

    // --------------------------
    // Test 1: Sample from the spec
    // --------------------------
    private static void testSampleCase() {
        header("===== Test 1: Sample Input =====");

        String[] names = {"Email", "Meeting", "Code Review", "Lunch", "Debug"};
        int[] priorities = {2, 5, 3, 1, 4};

        String[] expected = {"Meeting", "Debug", "Code Review", "Email", "Lunch"};
        String[] out = Scheduler.schedule(names, priorities);

        check("Processing order by priority", expected, out);
        System.out.println();
    }

    // --------------------------
    // Test 2: Input already in priority order
    // --------------------------
    private static void testAlreadyOrdered() {
        header("===== Test 2: Pre-ordered Input =====");

        String[] names = {"A", "B", "C"};
        int[] priorities = {9, 5, 1};

        check("Order preserved", new String[]{"A", "B", "C"},
              Scheduler.schedule(names, priorities));
        System.out.println();
    }

    // --------------------------
    // Test 3: One task only
    // --------------------------
    private static void testSingleTask() {
        header("===== Test 3: Single Task =====");

        String[] names = {"Deploy"};
        int[] priorities = {7};

        check("Lone task returned", new String[]{"Deploy"},
              Scheduler.schedule(names, priorities));
        System.out.println();
    }

    // --------------------------
    // Test 4: Reversed input, wide priority gaps
    // --------------------------
    private static void testWideSpread() {
        header("===== Test 4: Reversed Input =====");

        String[] names = {"Low", "Mid", "High", "Critical"};
        int[] priorities = {1, 50, 200, 999};

        check("Fully reversed", new String[]{"Critical", "High", "Mid", "Low"},
              Scheduler.schedule(names, priorities));
        System.out.println();
    }

    // --------------------------
    // Utility checker
    // --------------------------
    private static void check(String testName, String[] expected, String[] actual) {
        if (actual == null || expected.length != actual.length) {
            fail(testName + " | size mismatch | Got: " + show(actual));
            return;
        }
        for (int i = 0; i < expected.length; i++) {
            if (actual[i] == null || !expected[i].equals(actual[i])) {
                fail(testName +
                        " | Expected: " + show(expected) +
                        " | Got: " + show(actual));
                return;
            }
        }
        pass(testName + " | " + show(actual));
    }

    private static String show(String[] arr) {
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
        System.out.println(cyan + bold + text + normal);
    }

    private static void pass(String text) {
        System.out.println(green + "PASS: " + text + normal);
    }

    private static void fail(String text) {
        System.out.println(red + "FAIL: " + text + normal);
    }
}