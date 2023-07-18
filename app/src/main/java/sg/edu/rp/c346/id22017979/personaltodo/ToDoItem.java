package sg.edu.rp.c346.id22017979.personaltodo;

import java.util.Calendar;

public class ToDoItem {
    private String item;
    private Calendar date;

    public ToDoItem(String item, Calendar date) {
        this.item = item;
        this.date = date;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    @Override
    public String toString() {
        String str = date.get(Calendar.DAY_OF_MONTH)+"/"+date.get(Calendar.MONTH)
                +"/"+date.get(Calendar.YEAR) + " (" + getDay(date.get(Calendar.DAY_OF_WEEK)) + ")";

        return str;
    }

    private String getDay(int day) {
        String dayy = String.format("%d",date.get(Calendar.DAY_OF_WEEK));
        return dayy;
    }

}
