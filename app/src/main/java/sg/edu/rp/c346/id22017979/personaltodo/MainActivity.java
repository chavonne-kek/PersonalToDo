package sg.edu.rp.c346.id22017979.personaltodo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
ListView lv;
ArrayList<ToDoItem> alToDo;
CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.lv);
        alToDo = new ArrayList<>();

        Calendar date1 = Calendar.getInstance();
        date1.set(2023, Calendar.JULY, 17);
        ToDoItem item1 = new ToDoItem("Go for a movie", date1);
        alToDo.add(item1);

        Calendar date2 = Calendar.getInstance();
        date2.set(2023, Calendar.JULY, 18);
        ToDoItem item2 = new ToDoItem("Go for haircut", date2);
        alToDo.add(item2);

        adapter = new CustomAdapter(this, R.layout.row, alToDo);
        lv.setAdapter(adapter);

    }
}