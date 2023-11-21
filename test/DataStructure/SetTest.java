package DataStructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetTest {

    @Test
    public void testThatSetIsNotEmpty() {
        Set set = new Set();
        assertTrue(set.isEmpty());
    }

    @Test
    public void testThatICanAddOneElementToSet() {
        Set set = new Set();
        assertTrue(set.isEmpty());
        set.add("32");

        int size = set.getSize();
        assertEquals(1, size);
        assertFalse(set.isEmpty());
    }

    @Test
    public void testThatICanAddMoreThanOneElementToSet() {
        Set set = new Set();
        assertTrue(set.isEmpty());
        set.add("32");
        set.add("43");
        set.add("87");
        set.add("88");
        set.add("100");

        int size = set.getSize();
        assertEquals(5, size);
        assertFalse(set.isEmpty());
    }

    @Test
    void testThatDuplicatesAreNotAddedToTheSet() {
        Set set = new Set();
        assertTrue(set.isEmpty());
        set.add("32");
        set.add("43");
        set.add("87");
        set.add("88");
        set.add("100");
        set.add("32");
        set.add("43");

        int size = set.getSize();
        assertEquals(5, size);
        assertFalse(set.isEmpty());

    }

    @Test
    public void removeFromArrayList() {
        Set set = new Set();
        assertTrue(set.isEmpty());
        set.add("A");
        set.add("B");
        set.add("C");
        set.remove("A");
        int size = set.getSize();
        assertEquals(size, 2);

    }
}