package MyDiary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EntryTest {

    @Test
    public void testThatEntryHasIdTitleAndBody(){
        Entry entry = new Entry(1, "My diary", "My life");
        assertEquals("My diary", entry.getTitle());
    }

    @Test
    public void testThatEntryHasTwoIdWhenTwoEntryIsCreated(){
        Entry entry = new Entry(1, "My diary", "My life");
        Entry entry1 = new Entry(2, "My story", "My life");
        assertEquals(2, entry.getId());
    }


}