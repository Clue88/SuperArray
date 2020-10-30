public class Tester {
    public static void main(String[] args) {
        int err = 0;
        SuperArray a = new SuperArray();

        err += check("a.size()", a.size(), 0);
        err += check("a.add(\"test\")", a.add("test"), true);

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
