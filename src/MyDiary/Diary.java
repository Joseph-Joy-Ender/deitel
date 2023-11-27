package MyDiary;

import Banking.Account;
import Banking.exception.InvalidPinException;

import java.util.ArrayList;

public class Diary {

    private String userName;
    private String password;
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
        isLocked = true;
    }

    public void createEntry(String title, String body) {
        totalNumberOfEntry++;
        Entry entry = new Entry(1, title, body);
        entries.add(entry);
        entry.setId(totalNumberOfEntry);

//        boolean isUnLocked = !isLocked;
//        if (isUnLocked){
//            Entry = new Entry(1, title, body);
//            entries.add(entry);
//            totalNumberOfEntry++;
//            entry.setId(totalNumberOfEntry);
//        }

    }

    public Entry findEntryById(int id)  {
        for (Entry entry: entries) {
            if (entry.getId() == id) return entry;

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
        entry.setId(id);
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
