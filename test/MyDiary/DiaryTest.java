package MyDiary;

import Banking.exception.InvalidPinException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiaryTest {

    @Test
    public void testThatDiaryHasUserName(){
        Diary diary = new Diary("JOY", "1234");
        assertTrue(diary.isLocked());
        diary.unlockDiary("1234");
        assertFalse(diary.isLocked());

    }

    @Test
    void testThatDiaryCanNotBeUnlockedWithWrongPassword() {
        Diary diary = new Diary("JOY", "1234");
        assertThrows(InvalidPinException.class, () -> diary.unlockDiary("1342"));

    }

    @Test
    void testThatTheDiaryIsLocked() {
        Diary diary = new Diary("JOY", "1234");
        assertTrue(diary.isLocked());
        diary.unlockDiary("1234");
        diary.lockDiary();
        assertFalse(diary.isLocked());
    }

    @Test
    void testThatEntryHasBeenCreated() {
        Diary diary = new Diary("JOY", "1234");
        diary.unlockDiary("1234");
        diary.createEntry("My diary", "A diary app that makes me remember my past diary");
        assertEquals(1, diary.getTotalNumberOfEntry());

    }

    @Test
    void testThatMoreThanOneEntryCanBeCreated() {
        Diary diary = new Diary("JOY", "1234");
        diary.unlockDiary("1234");
        diary.createEntry("My diary", "A diary app that makes me remember my past diary");
        diary.createEntry("My second diary", "My favorite diary app");
        assertEquals(2, diary.getTotalNumberOfEntry());

    }

    @Test
    void testThatAnEntryCanBeDeleted() {
        Diary diary = new Diary("JOY", "1234");
        diary.unlockDiary("1234");
        diary.createEntry("My diary", "A diary app that makes me remember my past diary");
        diary.createEntry("My second diary", "My favorite diary app");
        assertEquals(2, diary.getTotalNumberOfEntry());
        diary.deleteEntry(1);
        assertEquals(1, diary.getTotalNumberOfEntry());

    }

    @Test
    void testThatEntryCanBeUpdated() {
        Diary diary = new Diary("JOY", "1234");
        diary.unlockDiary("1234");
        diary.createEntry("My diary", "A diary app that makes me remember my past diary");
        diary.createEntry("My second diary", "My favorite diary app");

        diary.updateEntry(2, "My sweet diary", "favorite");
        assertEquals("My sweet diary", diary.findEntryById(2).getTitle());

    }

    @Test
    void testThatEntryCanBeCreatedAgain() {
        Diary diary = new Diary("JOY", "1234");
        diary.unlockDiary("1234");
       Entry entry = diary.createEntries("My diary", "A diary app that makes me remember my past diary");
       Entry secondEntry = diary.createEntries("My second diary", "My favorite diary app");
        assertEquals(1, entry.getId());
        assertEquals(2, secondEntry.getId());
        assertEquals(2, diary.getTotalNumberOfEntry());

    }

    @Test
    void testThatExceptionIsThrownIfPasswordIsNotEntered() {
        Diary diary = new Diary("JOY", "1234");
        assertThrows(EntryIsLockedException.class, () -> diary.createEntry("Joy", "Body"));
        assertThrows(EntryIsLockedException.class, () -> diary.createEntries("Joseph", "Joy"));

    }
}