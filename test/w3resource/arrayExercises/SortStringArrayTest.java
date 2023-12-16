package w3resource.arrayExercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortStringArrayTest {
    @Test
    void testThatStringArrayCanBeSorted() {
        SortStringArray stringArray = new SortStringArray();
        String[] array = {"joy", "kelechi", "udeme", "ender", "chloe"};
        assertArrayEquals(new String[]{"chloe", "ender", "joy", "kelechi", "udeme"}, stringArray.sortStringArray(array));
    }

    @Test
    void testThatAnotherStringArrayCanBeSorted() {
        SortStringArray stringArray = new SortStringArray();
        String[] array = {"joy", "joseph", "john", "junior", "jae"};
        assertArrayEquals(new String[]{"jae", "john", "joseph", "joy", "junior"}, stringArray.sortStringArray(array));

    }
}