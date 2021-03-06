public class Demo {
    public static void removeDuplicates(SuperArray s) {
        for (int i = s.size() - 1; i >= 0; i--) {
            if (i != s.indexOf(s.get(i))) s.remove(i);
        }
    }

    public static SuperArray findOverlap(SuperArray a, SuperArray b) {
        SuperArray out = new SuperArray();
        for (int i = 0; i < a.size(); i++) {
            if (b.contains(a.get(i))) out.add(a.get(i));
        }
        removeDuplicates(out);
        return out;
    }

    public static SuperArray zip(SuperArray a, SuperArray b) {
        SuperArray out = new SuperArray();
        if (a.size() < b.size()) {
            for (int i = 0; i < a.size(); i++) {
                out.add(a.get(i));
                out.add(b.get(i));
            }
            for (int i = a.size(); i < b.size(); i++) {
                out.add(b.get(i));
            }
        } else {
            for (int i = 0; i < b.size(); i++) {
                out.add(a.get(i));
                out.add(b.get(i));
            }
            for (int i = b.size(); i < a.size(); i++) {
                out.add(a.get(i));
            }
        }
        return out;
    }
}
