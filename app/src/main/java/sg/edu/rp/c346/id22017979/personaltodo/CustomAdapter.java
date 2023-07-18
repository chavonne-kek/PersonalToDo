package sg.edu.rp.c346.id22017979.personaltodo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<ToDoItem> ToDoList;

    public CustomAdapter(Context context, int resource, ArrayList<ToDoItem> objects){
        super(context, resource,objects);

        parent_context = context;
        layout_id = resource;
        ToDoList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)
                parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent, false);
        TextView tvItem = rowView.findViewById(R.id.tvItem);
        TextView tvDate = rowView.findViewById(R.id.tvDate);
        ToDoItem currentVersion = ToDoList.get(position);

        tvItem.setText(currentVersion.getItem());

        Calendar date = currentVersion.getDate();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy (EEEE)");
        String dateString = dateFormat.format(date.getTime());

        tvDate.setText(dateString);
        return rowView;
    }
}
