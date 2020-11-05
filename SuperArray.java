public class SuperArray {
    private String[] data;
    private int size;

    public SuperArray() {
        data = new String[10];
        size = 0;
    }

    public SuperArray(int initialCapacity) {
        data = new String[initialCapacity];
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
        if (indexOf(s) == -1) return false;
        return true;
    }

    public void add(int index, String element) {
        for (int i = size; i >= index; i--) {
            data[i+1] = data[i];
        }
        data[index] = element;
        size++;
    }

    public String remove(int index) {
        String removed = data[index];
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i+1];
        }
        size--;
        return removed;
    }

    public int indexOf(String s) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(s)) return i;
        }
        return -1;
    }

    public String[] toArray() {
        String[] out = new String[size];
        for (int i = 0; i < size; i++) {
            out[i] = data[i];
        }
        return out;
    }

    public int lastIndexOf(String value) {
        for (int i = size - 1; i >= 0; i--) {
            if (data[i].equals(value)) return i;
        }
        return -1;
    }

    public boolean equals(SuperArray other) {
        if (size != other.size()) return false;
        for (int i = 0; i < size; i++) {
            if (data[i] != other.get(i)) return false;
        }
        return true;
    }
}
