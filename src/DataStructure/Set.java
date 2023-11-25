package DataStructure;

public class Set {

    private final MyArrayList myArrayList = new MyArrayList();

    public boolean isEmpty() {
        return myArrayList.isEmpty();
    }

    public void add(String element) {
        if (!myArrayList.contain(element)) {
            myArrayList.add(element);
        }
    }
    public int getSize() {
        return myArrayList.getSize();
    }

    public void remove(String element){
        myArrayList.remove(element);
    }

    public String toString(){
        return myArrayList.toString();
    }

    public void get(String element){
        myArrayList.get(element);
    }

}
