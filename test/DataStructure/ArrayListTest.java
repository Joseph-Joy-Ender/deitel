package DataStructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListTest {
    @Test
    public void testThatArrayListIsNotEmpty() {
        MyArrayList arrayList = new MyArrayList();
        assertTrue(arrayList.isEmpty());
    }

    @Test
    public void addToArrayList(){
        MyArrayList arrayList = new MyArrayList();
        assertTrue(arrayList.isEmpty());
        arrayList.add("G_String");
        assertFalse(arrayList.isEmpty());
    }
    @Test
    public void addTwoElementToArrayList(){
        MyArrayList arrayList = new MyArrayList();
        assertTrue(arrayList.isEmpty());
        arrayList.add("G_String");
        arrayList.add("F_String");
        assertFalse(arrayList.isEmpty());
    }

    @Test
    public void addThreeElementToArrayList(){
        MyArrayList arrayList = new MyArrayList();
        assertTrue(arrayList.isEmpty());
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        assertFalse(arrayList.isEmpty());
    }

    @Test
    public void removeFromArrayList() {
        MyArrayList arrayList = new MyArrayList();
        assertTrue(arrayList.isEmpty());
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.remove("A");
        int size = arrayList.getSize();
        assertEquals(size, 2);

    }
    @Test
    public void removeAllElementInTheList(){
        MyArrayList arrayList = new MyArrayList();
        assertTrue(arrayList.isEmpty());
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.remove("A");
        arrayList.remove("B");
        arrayList.remove("C");
        assertFalse(arrayList.contain("A"));
        assertFalse(arrayList.contain("B"));
        assertFalse(arrayList.contain("C"));

    }

    @Test
    void testThatListCanGrow() {
        MyArrayList arrayList = new MyArrayList(5);
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");
        arrayList.add("F");
        int size = arrayList.getSize();
        assertEquals(size, 6);

    }

    @Test
    void testThatListCanHaveSetMethod() {
        MyArrayList arrayList = new MyArrayList();

        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.set(0, "Wet");

        assertTrue(arrayList.contain("Wet"));

    }
    @Test
    void testThatAnElementCanAddArrayList() {
        MyArrayList arrayList = new MyArrayList();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");

        arrayList.set(0, "Wet");
        arrayList.set(1, "set");
        arrayList.set(2, "get");

        assertTrue(arrayList.contain("Wet"));
        assertTrue(arrayList.contain("set"));
        assertTrue(arrayList.contain("get"));

    }

    @Test
    void testThatArrayListHasGetMethod(){
        MyArrayList arrayList = new MyArrayList();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        assertEquals(2, arrayList.get("C"));

    }

    @Test
    void testThatArrayListCanBeTrimmed() {
        MyArrayList arrayList = new MyArrayList();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");

        arrayList.remove("A");
        arrayList.remove("B");

        int size = arrayList.getSize();
        assertEquals(size, 2);
        System.out.println(arrayList);
    }


}