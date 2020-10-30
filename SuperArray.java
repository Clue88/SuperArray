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
        if (size < data.length) {
            data[size] = element;
            size++;
            return true;
        }
        return false;
    }
}
