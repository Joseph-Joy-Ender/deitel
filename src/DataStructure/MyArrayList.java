package DataStructure;


public class MyArrayList {

    private int size;
    private int capacity = 10;
   private String[] array;


    public MyArrayList(){
        this.array = new String[capacity];
    }

    public MyArrayList(int userCapacity) {
        this.capacity = userCapacity;
        this.array = new String[userCapacity];

    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(String element) {
        if (size >= capacity){
            grow();
        }
        array[size] = element;
        size++;
    }
    public int getSize() {
        return size;
    }


    public void remove(String element){
        for (int i = 0; i < size; i++) {
            if (array[i].equals(element)) {
                for (int j = 0; j < (size - i - 1); j++) {
                    array[i + j] = array[i + j + 1];
                }
                array[size - 1] = null;
                size--;
            }
            if (size <= (capacity / 3))
                trim();

        }
    }
    public String toString(){
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < capacity; i++){
            string.append(array[i]).append(", ");
        }
        if (!string.isEmpty()){
            string = new StringBuilder("[" + string.substring(0, string.length() - 2) + "]");
        }else string = new StringBuilder("[]");

        return string.toString();
    }

    public boolean contain(String element) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(element)){
                return true;
            }

        }
        return false;
    }

    private void grow() {
        int newCapacity = capacity * 2;
        String[] newArray = new String[newCapacity];
        if (size >= 0) System.arraycopy(array, 0, newArray, 0, size);
        capacity = newCapacity;
        array = newArray;
    }

    public void set(int index, String element) {
        if (size >= capacity) {
            grow();
        }
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = element;
        size++;
    }

    public int get(String element) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public void trim() {
        int newCapacity = capacity / 2;
        String[] newArray = new String[newCapacity];
        if (size >= 0) System.arraycopy(array, 0, newArray, 0, size);
        capacity = newCapacity;
        array = newArray;

    }

}
