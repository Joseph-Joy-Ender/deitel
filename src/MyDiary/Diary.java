package MyDiary;

import Banking.exception.InvalidPinException;

import java.util.ArrayList;

public class Diary {

    private final String userName;
    private final String password;
    private boolean isLocked = true;
    private int totalNumberOfEntry;
    private final ArrayList<Entry> entries;

    public boolean isLocked() {
        return isLocked;
    }

    public Diary(String userName, String password) {
        entries = new ArrayList<>();
        this.password = password;
        this.userName = userName;
    }

    public void unlockDiary(String password) {
        validate(password);
        isLocked = false;

    }

    private void validate(String password){
        if (!this.password.equals(password)) throw new InvalidPinException("Incorrect password");
    }

    public void lockDiary() {
        isLocked = false;
    }

    public void createEntry(String title, String body) {
           entryIsLocked();
            totalNumberOfEntry++;
            Entry entry = new Entry(totalNumberOfEntry, title, body);
            entries.add(entry);


    }

    public Entry createEntries(String title, String body) {
        entryIsLocked();
        totalNumberOfEntry++;
        Entry entry = new Entry(totalNumberOfEntry, title, body);
        entries.add(entry);
        return entry;

    }

    private void entryIsLocked() {
        if (isLocked) throw new EntryIsLockedException("You have to unlock diary first");
    }

    public Entry findEntryById(int id)  {
        for (Entry entry: entries) {
            if(entry.getId() == id) {
                return entry;
            }

        }
        return null;
    }

    public int getTotalNumberOfEntry() {
        return entries.size();
    }

    public void deleteEntry(int id) {
        Entry entry = findEntryById(id);
        entries.remove(entry);
        totalNumberOfEntry--;

    }

    public void updateEntry(int id, String title, String body) {
        Entry entry = findEntryById(id);
        entry.setBody(body);
        entry.setTitle(title);
    }

    public String getUserName() {
        return userName;
    }

    public void print() {
        for (Entry entry: entries) {
            System.out.println(entry);

        }

    }

}
