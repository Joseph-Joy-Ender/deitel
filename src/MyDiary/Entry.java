package MyDiary;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Entry {

private int id;
private String title;
private String body;
private LocalDateTime dateTime;
    public Entry(int id, String title, String body) {
        this.id = id;
        this.title = title;
        this.body = body;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public static String date() {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm aa");
        String time = simpleDateFormat.format(date);
        LocalDate localDate = LocalDate.now();
        return (localDate + " " + time);
    }
    public String toString() {
        return String.format("""
                id:  %s
                date: %s
                title: %s
                body: %s
                """,id, date(), title, body);
    }
}
