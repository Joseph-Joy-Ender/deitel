package MyDiary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiariesTest {

    @Test
    void testThatDiariesCanAdd() {
        Diaries diaries = new Diaries();
        diaries.add("Joy", "1234");
        assertEquals(1, diaries.getSize());

    }

    @Test
    void testThatDiariesHasMoreThanOneDiary() {
        Diaries diaries = new Diaries();
        diaries.add("Joy", "1234");
        diaries.add("Joseph", "1235");
        diaries.add("Ender", "3456");
        assertEquals(3, diaries.getSize());

    }

    @Test
    void testThatDiariesCanDelete() {
        Diaries diaries = new Diaries();
        diaries.add("Joy", "1234");
        diaries.add("Joseph", "1235");
        diaries.add("Ender", "3456");
        assertEquals(3, diaries.getSize());
        diaries.delete("Joseph");
        assertEquals(2, diaries.getSize());

    }



}