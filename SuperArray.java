public class SuperArray {
    private String[] data;
    private int size;

    public SuperArray() {
        data = new String[10];
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean add(String element) {
        if (size == data.length) resize();
        data[size] = element;
        size++;
        return true;
    }

    public String get(int index) {
        return data[index];
    }

    public String set(int index, String element) {
        String old = "";
        old = data[index];
        data[index] = element;
        return old;
    }

    private void resize() {
        String[] newData = new String[size * 2];
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        data = new String[10];
        size = 0;
    }

    public String toString() {
        if (size == 0) return "[]";
        String out = "[";
        for (int i = 0; i < size - 1; i++) {
            out += data[i] + ", ";
        }
        out += data[size - 1] + "]";
        return out;
    }

    public boolean contains(String s) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(s)) return true;
        }
        return false;
    }
}
