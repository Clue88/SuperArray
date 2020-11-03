public class Tester {
    public static void main(String[] args) {
        int err = 0;
        SuperArray a = new SuperArray();
        SuperArray b = new SuperArray(20);

        err += check("a.isEmpty()", b.isEmpty(), true);
        err += check("a.size()", a.size(), 0);
        err += check("a.add(\"test\")", a.add("test"), true);
        err += check("a.get(0)", a.get(0), "test");
        err += check("a.set(0, \"new\"", a.set(0, "new"), "test");
        err += check("a.toString()", a.toString(), "[new]");
        err += check("a.contains(\"new\")", a.contains("new"), true);
        err += check("a.contains(\"test\")", a.contains("test"), false);
        for (int i = 1; i < 15; i++) {
            String name = "a.add(\"test" + i + "\")";
            err += check(name, a.add("test" + i), true);
        }
        err += check("a.get(8)", a.get(8), "test8");
        err += check("a.get(13)", a.get(13), "test13");
        err += check("a.isEmpty()", a.isEmpty(), false);
        err += check("a.toString()", a.toString(), "[new, test1, test2, test3, test4, test5, test6, test7, test8, test9, test10, test11, test12, test13, test14]");
        a.add(3, "hi");
        err += check("a.toString()", a.toString(), "[new, test1, test2, hi, test3, test4, test5, test6, test7, test8, test9, test10, test11, test12, test13, test14]");
        a.clear();
        err += check("a.isEmpty()", a.isEmpty(), true);
        err += check("a.toString()", a.toString(), "[]");
        err += check("b.add(\"world\")", b.add("world"), true);
        b.add(0, "hello");
        err += check("b.toString()", b.toString(), "[hello, world]");
        err += check("b.remove(0)", b.remove(0), "hello");
        err += check("b.toString()", b.toString(), "[world]");

        if (err == 0) System.out.println("All good!");
        else if (err == 1) System.out.println("Uh oh... 1 error found.");
        else System.out.println("Uh oh... " + err + " errors found.");
    }

    public static int check(String name, Object actual, Object expected) {
        if (actual.equals(expected)) return 0;
        else {
            System.out.println("Failure on " + name + ": Expected \"" +
                                expected + "\", got \"" + actual + "\".");
            return 1;
        }
    }
}
