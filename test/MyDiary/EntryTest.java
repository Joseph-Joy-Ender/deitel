package MyDiary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EntryTest {

    @Test
    public void testThatEntryHasIdTitleAndBody(){
        Entry entry = new Entry(1, "My diary", "My life");
    }

}