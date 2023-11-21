package DataStructure;

public class Set {
    private int size;
    private int capacity = 10;
    private final String[] array;



    public Set(){
        this.array = new String[capacity];
    }

    public Set(int userCapacity) {
        this.capacity = userCapacity;
        this.array = new String[userCapacity];

    }
    public boolean isEmpty() {
        return size == 0;
    }

    public void add(String element) {
        if (!isDuplicate(element)){
            array[size] = element;
            size++;
        }
    }

    public boolean isDuplicate(String element) {
        if (array.length != 0) {
            for (int i = 0; i < size; i++) {
                if (array[i].equals(element)) return true;

            }
        }
        return false;
    }
    public  int getSize() {
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
//            if (size <= (capacity / 3))
//                trim();

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


}
