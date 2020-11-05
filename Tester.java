import java.util.Arrays;

public class Tester {
    public static void main(String[] args) {
        int err = 0;
        /* ----------------------------------------------------------------- */
        
        SuperArray a = new SuperArray();
        SuperArray b = new SuperArray(20);
        String[] c = {"world"};
        SuperArray d = new SuperArray();
        SuperArray e = new SuperArray();
        SuperArray f = new SuperArray(15);
        SuperArray g = new SuperArray(5);

        // Basic methods and replacements
        err += check("a.isEmpty()", b.isEmpty(), true);
        err += check("a.size()", a.size(), 0);
        err += check("a.add(\"test\")", a.add("test"), true);
        err += check("a.get(0)", a.get(0), "test");
        err += check("a.set(0, \"new\"", a.set(0, "new"), "test");
        err += check("a.toString()", a.toString(), "[new]");
        err += check("a.contains(\"new\")", a.contains("new"), true);
        err += check("a.contains(\"test\")", a.contains("test"), false);

        // Resizing
        for (int i = 1; i < 15; i++) {
            String name = "a.add(\"test" + i + "\")";
            err += check(name, a.add("test" + i), true);
        }
        err += check("a.get(8)", a.get(8), "test8");
        err += check("a.get(13)", a.get(13), "test13");
        err += check("a.toString()", a.toString(), "[new, test1, test2, test3, test4, test5, test6, test7, test8, test9, test10, test11, test12, test13, test14]");
        
        // Insertion
        a.add(3, "hi");
        err += check("a.toString()", a.toString(), "[new, test1, test2, hi, test3, test4, test5, test6, test7, test8, test9, test10, test11, test12, test13, test14]");
        
        // Indexing
        err += check("a.indexOf(\"test5\")", a.indexOf("test5"), 6);
        err += check("a.indexOf(\"howdy\")", a.indexOf("howdy"), -1);
        err += check("a.set(0, \"test5\")", a.set(0, "test5"), "new");
        err += check("a.lastIndexOf(\"test5\")", a.lastIndexOf("test5"), 6);
        err += check("a.lastIndexOf(\"howdy\"", a.lastIndexOf("howdy"), -1);

        // Clearing
        a.clear();
        err += check("a.isEmpty()", a.isEmpty(), true);
        err += check("a.toString()", a.toString(), "[]");

        // Removing elements
        err += check("b.add(\"world\")", b.add("world"), true);
        b.add(0, "hello");
        err += check("b.toString()", b.toString(), "[hello, world]");
        err += check("b.remove(0)", b.remove(0), "hello");
        err += check("b.toString()", b.toString(), "[world]");

        // SuperArray to String[]
        err += check("b.toArray()", Arrays.toString(b.toArray()), Arrays.toString(c));

        // Removing duplicates
        for (int i = 0; i < 3; i++) {
            err += check("d.add(\"foo\")", d.add("foo"), true);
            err += check("d.add(\"bar\")", d.add("bar"), true);
            err += check("d.add(\"baz\")", d.add("baz"), true);
            err += check("d.add(\"hola\")", d.add("hola"), true);
        }
        err += check("d.add(\"foo\")", d.add("foo"), true);
        err += check("d.toString()", d.toString(), "[foo, bar, baz, hola, foo, bar, baz, hola, foo, bar, baz, hola, foo]");
        Demo.removeDuplicates(d);
        err += check("d.toString()", d.toString(), "[foo, bar, baz, hola]");

        // Finding overlap
        err += check("e.add(\"hola\")", e.add("hola"), true);
        err += check("e.add(\"foo\")", e.add("foo"), true);
        err += check("Demo.findOverlap(d, e)", Demo.findOverlap(d, e).toString(), "[foo, hola]");

        // Checking equality
        err += check("f.add(\"test\")", f.add("test"), true);
        err += check("g.add(\"test\")", g.add("test"), true);
        err += check("f.equals(g)", f.equals(g), true);
        err += check("f.equals(a)", f.equals(a), false);

        // Combining two arrays
        err += check("Demo.zip(a, b)", Demo.zip(a, b).toString(), "[world]");
        err += check("Demo.zip(d, e)", Demo.zip(d, e).toString(), "[foo, hola, bar, foo, baz, hola]");
        err += check("Demo.zip(b, f)", Demo.zip(b, f).toString(), "[world, test]");
        err += check("Demo.zip(e, d)", Demo.zip(e, d).toString(), "[hola, foo, foo, bar, baz, hola]");

        /* ----------------------------------------------------------------- */
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
