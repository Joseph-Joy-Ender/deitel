package MyDiary;

import java.util.ArrayList;

public class Diaries {
    private final ArrayList<Diary> diaries = new ArrayList<>();
    private int size;


    public void add(String userName, String password) {
        diaries.add(new Diary(userName, password));
        size++;
    }

    public int getSize(){
        return diaries.size();
    }

    public Diary findByUsername(String username) {
        for (Diary diary: diaries) {
            if (diary.getUserName().equals(username)) return diary;

        }
        return null;
    }

    public void delete(String username){
        Diary diary = findByUsername(username);
       diaries.remove(diary);
       size--;

    }
}
